package com.example.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CountRowMapper implements RowMapper<Integer>{

	@Override
	public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return rs.getInt(1);
	}

}
