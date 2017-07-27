package com.mkyong;

import model.CustomerRecord;
import model.OrderRecord;
import model.ProductRecord;
import model.OrderedProductRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mkyong.dao.CustomerRecordRepository;
import com.mkyong.dao.OrderRecordRepository;
import com.mkyong.dao.ProductRecordRepository;
import com.mkyong.dao.OrderedProductRepository;

import javax.sql.DataSource;
import java.util.List;

import static java.lang.System.exit;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	private CustomerRecordRepository customerRecordRepository;

	@Autowired
	private OrderRecordRepository orderRecordRepository;

	@Autowired
	private ProductRecordRepository productRecordRepository;

	@Autowired
	private OrderedProductRepository orderedProductRepository;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootConsoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("DATASOURCE = " + dataSource);

		if (args.length <= 0) {
			System.err.println("[Usage] java xxx.jar {insert name email | display}");
		} else {

			if (args[0].equalsIgnoreCase("display")) {
				System.out.println("Display all customers...");
				List<CustomerRecord> customerList = customerRecordRepository.findAll();
				customerList.forEach(x -> System.out.println(x));

				System.out.println("Display all product records...");
				List<ProductRecord> productList = productRecordRepository.findAll();
				productList.forEach(x -> System.out.println(x));

				System.out.println("Display all ordered product records...");
				List<OrderedProductRecord> orderedProductList = orderedProductRepository.findAll();
				orderedProductList.forEach(x -> System.out.println(x));

				System.out.println("Display all orders...");
				List<OrderRecord> orderList = orderRecordRepository.findAll();
				orderList.forEach(x -> System.out.println(x));
			}
			System.out.println("Done!");
		}
		exit(0);
	}
}
