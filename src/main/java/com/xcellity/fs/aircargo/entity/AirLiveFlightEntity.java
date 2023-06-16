package com.xcellity.fs.aircargo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "live_Flight_data")
public class AirLiveFlightEntity {
	private String hex;
	private String reg_number;
	private String flag;
	private String lat;
	private String lng;
	private String alt;
	private String dir;
	private String speed;
	private String v_speed;
	private String squawk;
	private String flight_number;
	private String flight_icao;
	private String flight_iata;
	private String dep_icao;
	private String dep_iata;
	private String arr_icao;
	private String arr_iata;
	private String airline_icao;
	private String aircraft_icao;
	private String updated;
	private String status;
	public String getHex() {
		return hex;
	}
	public void setHex(String hex) {
		this.hex = hex;
	}
	public String getReg_number() {
		return reg_number;
	}
	public void setReg_number(String reg_number) {
		this.reg_number = reg_number;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getAlt() {
		return alt;
	}
	public void setAlt(String alt) {
		this.alt = alt;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getV_speed() {
		return v_speed;
	}
	public void setV_speed(String v_speed) {
		this.v_speed = v_speed;
	}
	public String getSquawk() {
		return squawk;
	}
	public void setSquawk(String squawk) {
		this.squawk = squawk;
	}
	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}
	public String getFlight_icao() {
		return flight_icao;
	}
	public void setFlight_icao(String flight_icao) {
		this.flight_icao = flight_icao;
	}
	public String getFlight_iata() {
		return flight_iata;
	}
	public void setFlight_iata(String flight_iata) {
		this.flight_iata = flight_iata;
	}
	public String getDep_icao() {
		return dep_icao;
	}
	public void setDep_icao(String dep_icao) {
		this.dep_icao = dep_icao;
	}
	public String getDep_iata() {
		return dep_iata;
	}
	public void setDep_iata(String dep_iata) {
		this.dep_iata = dep_iata;
	}
	public String getArr_icao() {
		return arr_icao;
	}
	public void setArr_icao(String arr_icao) {
		this.arr_icao = arr_icao;
	}
	public String getArr_iata() {
		return arr_iata;
	}
	public void setArr_iata(String arr_iata) {
		this.arr_iata = arr_iata;
	}
	public String getAirline_icao() {
		return airline_icao;
	}
	public void setAirline_icao(String airline_icao) {
		this.airline_icao = airline_icao;
	}
	public String getAircraft_icao() {
		return aircraft_icao;
	}
	public void setAircraft_icao(String aircraft_icao) {
		this.aircraft_icao = aircraft_icao;
	}
	public String getUpdated() {
		return updated;
	}
	public void setUpdated(String updated) {
		this.updated = updated;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	

}