package com.bdstudio.springbootdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdstudio.springbootdemo.dao.CityRepository;
import com.bdstudio.springbootdemo.domain.City;
import com.bdstudio.springbootdemo.service.CityService;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityRepository cityRepository;

	@Override
	public City selectCityById(long id) {
		
		return cityRepository.selectCityById(id);
	}

}
