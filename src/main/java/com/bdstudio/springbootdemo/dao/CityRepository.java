package com.bdstudio.springbootdemo.dao;

import com.bdstudio.springbootdemo.domain.City;

public interface CityRepository {
	
	public City selectCityById(long id);
}
