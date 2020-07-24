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
		product.setName(rs.getString(2));
		
		return product;
	}

	

}
