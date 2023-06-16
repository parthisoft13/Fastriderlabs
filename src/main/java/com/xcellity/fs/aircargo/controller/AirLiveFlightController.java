package com.xcellity.fs.aircargo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xcellity.fs.aircargo.entity.AirLiveFlightEntity;
import com.xcellity.fs.aircargo.service.AirLiveFlightService;

@RestController
public class AirLiveFlightController {
	
	@Autowired
	AirLiveFlightService airLiveFlightService;
	@GetMapping("/liveFlight")
	public List<AirLiveFlightEntity> getAllLiveFlight(){
		
		List<AirLiveFlightEntity> liveFlight = airLiveFlightService.getAllLiveFlight();
		
		return liveFlight;
		
	}
	

}
