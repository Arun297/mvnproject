package com.example.awscodedeploydemo.awscodedeploydemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.company.controller"})
public class Example {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/")
	String home() {
		logger.info("Doing some work");
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Example.class, args);
	}

}