package com.example.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Categories;
import com.example.model.Products;

public class CategoryRowMapper implements RowMapper<Categories>{
	
	@Override
	public Categories mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Categories category= new Categories();
		category.setCategoryId(rs.getInt(1));
		category.setCategoryName(rs.getString(2));
		
		return category;
	}

}
