package com.xcellity.fs.aircargo.repositiory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.xcellity.fs.aircargo.entity.AirPortEnity;

public interface AirCargoMongoRepo extends MongoRepository < AirPortEnity, Long > {

}