package com.xcellity.fs.aircargo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xcellity.fs.aircargo.entity.AirLiveFlightEntity;
import com.xcellity.fs.aircargo.repositiory.AirLiveFlightMongoRepo;
@Service
@Transactional
public class AirLiveFlightServiceImpl implements AirLiveFlightService {
	@Autowired
	AirLiveFlightMongoRepo liveFlightMongo;

	@Override
	public List<AirLiveFlightEntity> getAllLiveFlight() {
		
		List<AirLiveFlightEntity> liveFlight = liveFlightMongo.findAll();
		
		return liveFlight;
	}

}
