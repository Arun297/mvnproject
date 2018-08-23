package com.company.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.service.SleuthService;

@RestController
@ComponentScan(basePackages= {"com.company.service"})
public class SleuthController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/")
	public String helloSleuth() {
		logger.info("Hello Sleuth");
		return "success";
	}

	@Autowired
	private SleuthService sleuthService;

	@GetMapping("/same-span")
	public String helloSleuthSameSpan() throws InterruptedException {
		logger.info("Same Span");
		sleuthService.doSomeWorkSameSpan();
		return "success";
	}
}