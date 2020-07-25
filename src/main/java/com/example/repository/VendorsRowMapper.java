package com.example.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Vendors;

public class VendorsRowMapper implements RowMapper<Vendors>{
	
	@Override
	public Vendors mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Vendors vendor= new Vendors();
		vendor.setVendorId(rs.getInt(1));
		vendor.setVendorName(rs.getString(2));
		vendor.setVendorAddress(rs.getString(2));
		
		return vendor;
	}

}
