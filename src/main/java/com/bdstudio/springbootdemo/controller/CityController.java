package com.bdstudio.springbootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bdstudio.springbootdemo.domain.City;
import com.bdstudio.springbootdemo.service.CityService;

@RestController
@RequestMapping(value = "/city")
@EnableAutoConfiguration
public class CityController {
	private static final Logger logger = LoggerFactory.getLogger("CityController");
	
	@Autowired
	private CityService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	@ResponseBody
	public City getCity(@PathVariable long id) {
		
		City city = service.selectCityById(id);
		logger.info(city.toString());
		return city;
	}

}
