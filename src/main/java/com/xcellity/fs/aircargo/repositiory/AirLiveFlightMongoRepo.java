package com.xcellity.fs.aircargo.repositiory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.xcellity.fs.aircargo.entity.AirLiveFlightEntity;


	public interface AirLiveFlightMongoRepo extends MongoRepository < AirLiveFlightEntity, Long > {

	}
	

