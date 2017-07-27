package com.mkyong.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.CustomerRecord;

import java.util.List;
import java.util.ArrayList;

@Repository
public class CustomerRecordRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<CustomerRecord> findAll() {

		List<CustomerRecord> result = jdbcTemplate.query(
				"SELECT id, name, address, email, phone FROM customerRecord",
				(rs, rowNum) -> new CustomerRecord(rs.getInt("id"),
						rs.getString("name"), rs.getString("address"),rs.getString("email"),rs.getString("phone"))
				);

		return result;
	}
}
