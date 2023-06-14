package com.xcellity.fs.aircargo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xcellity.fs.aircargo.entity.AirPortEnity;
import com.xcellity.fs.aircargo.pojo.AircargoRequest;
import com.xcellity.fs.aircargo.service.AirCargoService;


@RestController

public class AirCargoController {
	
	//private final Producer producer;
	@Autowired
	AirCargoService airCargoService;

	/*
	 * @Autowired AirCargoController(Producer producer) { this.producer = producer;
	 * }
	 * 
	 * @PostMapping(value = "/publish") public void
	 * sendMessageToKafkaTopic(@RequestParam("message") String message) {
	 * this.producer.sendMessage(message); }
	 */
	   
	    @GetMapping("/airport")
	    public List<AirPortEnity> getAirPort() {
	    	List<AirPortEnity> response = 	airCargoService.getAirPort();
			return response;
	    }


}
