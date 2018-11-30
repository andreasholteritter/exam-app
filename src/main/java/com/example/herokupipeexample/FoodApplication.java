package com.example.herokupipeexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class FoodApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(LogzioLogbackExample.class);
		
		logger.info("Starting SpringApplication");
		SpringApplication.run(FoodApplication.class, args);
		logger.info("SpringApplication Started");
	}
}
