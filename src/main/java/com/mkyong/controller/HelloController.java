package com.mkyong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.mkyong.dao.OrderRecordRepository;
import model.OrderRecord;

import java.util.List;

@RestController
@RequestMapping("/orderRecord")
public class HelloController {

	@Autowired
	private OrderRecordRepository orderRecordRepository;
	
  @GetMapping
  public List<OrderRecord> index() {
      return orderRecordRepository.findAll();
  }
	
}
