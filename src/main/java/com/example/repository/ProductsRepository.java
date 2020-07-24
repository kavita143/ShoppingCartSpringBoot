package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Products;

@Repository
public class ProductsRepository {
	@Autowired
	private JdbcTemplate template;

	public List<Products> getProducts() {
		String sql= "select * from products";
		ProductsRowMapper rowMapper= new ProductsRowMapper();
		List<Products> productsList=template.query(sql, rowMapper);
		return productsList;
	}
	
	public Products getProductById(int id) {
		String sql= "select * from products where id=?";
		ProductsRowMapper rowMapper= new ProductsRowMapper();
		Products product=template.queryForObject(sql, rowMapper,id);
		return product;
	}
	
	public List<Products> getProductByName(String name) {
		String sql= "select * from products where product_name=?";
		ProductsRowMapper rowMapper= new ProductsRowMapper();
		List<Products> products=template.query(sql, rowMapper,name);
		return products;
	}
	
	public Products addProduct(Products product) {
		String sql = "insert into products values (?,?)";
		template.update(sql, product.getProductId(),product.getName());
		return product;
	}
	
	public Products updateProduct(Products product,int id) {
		String sql = "update products set product_name=? where id=?";
		template.update(sql, product.getName(),id);
		return product;
	}
	
	public int deleteProduct(int id) {
		String sql = "delete  from products where id =?";
		int count=template.update(sql, id);
		return count;
	}
}
