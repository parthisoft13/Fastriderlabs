package com.xcellity.fs.aircargo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xcellity.fs.aircargo.entity.AirPortEnity;
import com.xcellity.fs.aircargo.pojo.AircargoRequest;
import com.xcellity.fs.aircargo.pojo.AircargoResponse;
import com.xcellity.fs.aircargo.repositiory.AirCargoMongoRepo;

@Service
@Transactional
public class AirCargoServiceImpl implements AirCargoService{
	
	@Autowired
	private AirCargoMongoRepo airCargoMango;
	

	@Override
	public List<AirPortEnity> getAirPort() {
		
		
	        return this.airCargoMango.findAll();
	    
		
		
		
	}

}
