package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Categories;
import com.example.model.Products;
import com.example.model.Vendors;

@Repository
public class ProductsRepository {
	@Autowired
	private JdbcTemplate template;

	public List<Products> getProducts() {
		String sql = "select * from product_list";
		ProductsRowMapper rowMapper = new ProductsRowMapper();
		List<Products> productsList = template.query(sql, rowMapper);
		return productsList;
	}

	public List<Categories> getCategories() {
		String sql = "select category_id,category_name from categories";
		CategoryRowMapper rowMapper = new CategoryRowMapper();
		List<Categories> categoryList = template.query(sql, rowMapper);
		return categoryList;
	}

	public List<Vendors> getVendors(int categoryId) {
		String sql = "select vendor_id,vendor_name,vendor_address from vendors where category_id=?";
		VendorsRowMapper rowMapper = new VendorsRowMapper();
		List<Vendors> vendorsList = template.query(sql, rowMapper, categoryId);
		return vendorsList;
	}
	
	

	public Products getProductById(int id) {
		String sql = "select * from product_list where product_id=?";
		ProductsRowMapper rowMapper = new ProductsRowMapper();
		Products product = template.queryForObject(sql, rowMapper, id);
		return product;
	}

	public List<Products> getProductsByName(String name) {
		String sql = "select * from product_list where product_name = ?";
		ProductsRowMapper rowMapper = new ProductsRowMapper();
		List<Products> products = template.query(sql, rowMapper, name);
		System.out.println("test"+products);
		return products;
	}

	public List<Integer> getMaxProductId() {
		String sql = "select max(product_id) from product_list";
		CountRowMapper rowMapper = new CountRowMapper();
		List<Integer> maxProductIdList = template.query(sql, rowMapper);
		return maxProductIdList;
	}
	
	public Products addProduct(Products product) {
		String sql = "insert into product_list values (?,?,?,?,?,?,?,?,?,?,?)";
		template.update(sql,product.getProductId(), 
				product.getProdName(), 
				product.getProdDesc(),
				product.getImageURL(),
				product.getBrand(),
				product.getPrice(), 
				product.getNumOfUnits(),
				product.getDiscount(), 
				product.getProductSize(), 
				product.getCategoryId(),
				product.getVendorId());
		return product;
	}
	public Products updateProduct(Products product, int id) {
		String sql = "update product_list set Image_URL=?,Price=?,Discount=? where product_id =?";
		template.update(sql, product.getImageURL(),product.getPrice(),product.getDiscount(), id);
		return product;
	}

	public int deleteProduct(int id) {
		String sql = "delete  from product_list where product_id =?";
		int count = template.update(sql, id);
		return count;
	}
}
