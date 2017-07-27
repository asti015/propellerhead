package com.mkyong.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.OrderedProductRecord;

import java.util.List;
import java.util.ArrayList;

@Repository
public class OrderedProductRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<OrderedProductRecord> findAll() {

		List<OrderedProductRecord> result = new ArrayList<OrderedProductRecord>();
		result = jdbcTemplate.query(
				"SELECT id, orderRecord, product, quantity, totalPrice FROM orderedProduct",
				(rs, rowNum) -> new OrderedProductRecord(rs.getInt("id"),
						rs.getInt("orderRecord"), rs.getInt("product"), rs.getInt("quantity"), rs.getDouble("totalPrice"))
				);

		return result;
	}
}
