package com.mkyong.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.ProductRecord;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

@Repository
public class ProductRecordRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<ProductRecord> findAll() {

		List<ProductRecord> result = new ArrayList<ProductRecord>();
		result = jdbcTemplate.query(
				"SELECT id, productNumber, description, itemPrice FROM productRecord",
				(rs, rowNum) -> new ProductRecord(rs.getInt("id"),
						rs.getString("productNumber"), rs.getString("description"), rs.getDouble("itemPrice"))
				);

		return result;
	}
}
