package com.bdstudio.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bdstudio.springbootdemo.domain.City;
import com.bdstudio.springbootdemo.service.CityService;

@RestController
@RequestMapping(value="/city")
public class CityController {
	
	
	@Autowired
	private CityService service;
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public City getCity(@RequestParam(value="id", defaultValue="1") long id) {
		
		City city = service.selectCityById(id);
		
		return city;
	}

}
