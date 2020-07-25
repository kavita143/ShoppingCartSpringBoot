package com.example.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Products;

public class ProductsRowMapper implements RowMapper<Products>{

	@Override
	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Products product= new Products();
		product.setProductId(rs.getInt(1));
		product.setProdName(rs.getString(2));
		product.setProdDesc(rs.getString(3));
		product.setImageURL(rs.getString(4));
		product.setBrand(rs.getString(5));		
		product.setPrice(rs.getInt(6));
		product.setNumOfUnits(rs.getInt(7));
		product.setDiscount(rs.getString(8));
		product.setProductSize(rs.getString(9));		
		product.setCategoryId(rs.getInt(10));
		product.setVendorId(rs.getInt(11));
		return product;
	}

	

}
