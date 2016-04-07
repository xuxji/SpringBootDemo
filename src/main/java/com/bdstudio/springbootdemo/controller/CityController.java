package com.bdstudio.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bdstudio.springbootdemo.service.ICityService;

@RestController
public class CityController {
	
	@Autowired
	private ICityService service;

}
