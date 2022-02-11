package com.example.demo.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(20)
public class MessageRunner implements CommandLineRunner {

	  @Autowired
	  private ProductData pob;
	 
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application.Properties values printed "); 
		System.out.println(pob);
	}

}

