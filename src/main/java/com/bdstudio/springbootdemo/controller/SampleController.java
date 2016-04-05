package com.bdstudio.springbootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger("SampleController");
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		logger.debug("Start the Application");
		logger.info("Start the Application");
		
		for(int i=1; i<1000; i++) {
			logger.info("print to :" + i);
		}
		return "Hello World";
	}

}
