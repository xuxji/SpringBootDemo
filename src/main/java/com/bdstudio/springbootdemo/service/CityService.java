package com.bdstudio.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdstudio.springbootdemo.dao.CityRepository;
import com.bdstudio.springbootdemo.domain.City;

@Service
public class CityService{
	
	@Autowired
	private CityRepository mapper;
	
	public City selectCityById(long id){
		
		return mapper.selectCityById(id);
	}
	
}