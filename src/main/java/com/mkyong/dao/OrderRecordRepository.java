package com.mkyong.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.OrderRecord;

import java.util.List;
import java.util.ArrayList;

@Repository
public class OrderRecordRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * Returns a list of all {@link OrderRecord}s present in the database.
	 * 
	 * @return a list of all {@link OrderRecord}s present in the database.
	 */
	public List<OrderRecord> findAll() {

		List<OrderRecord> result = new ArrayList<OrderRecord>();
		result = jdbcTemplate.query(
				"SELECT id, orderNumber, orderStatus, creationTime, customerRecordId, customerName FROM orderRecord",
				(rs, rowNum) -> new OrderRecord(rs.getInt("id"),
						rs.getString("orderNumber"), rs.getString("orderStatus"), rs.getString("creationTime"), rs.getInt("customerRecordId"), rs.getString("customerName"))
				);

		return result;
	}
}
