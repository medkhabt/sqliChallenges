package com.sqli.nespresso.dishes.satellite_builder.impl;

import java.util.List;

import com.sqli.nespresso.dishes.Dish;
import com.sqli.nespresso.dishes.Dishes;
import com.sqli.nespresso.dishes.Satellite;
import com.sqli.nespresso.dishes.configuration.Configuration;
import com.sqli.nespresso.dishes.satellite_builder.ISatelliteBuilder;

public class SatelliteBuilder implements ISatelliteBuilder{
	public Satellite satellite;  
	public SatelliteBuilder() {
		this.satellite = new Satellite();
	}
	@Override
	public ISatelliteBuilder hasName(String name) {
		satellite.setSatelliteName(name); 
		return this;
	}
	@Override
	public ISatelliteBuilder hasdegree(float degree) {
		satellite.setSatelliteDegree(degree); 
		return this;
	}
	@Override
	public ISatelliteBuilder hasDirection(char directionRepresentation) {
		satellite.setSatelliteDirection(directionRepresentation); 
		return this;
	}
	@Override
	public ISatelliteBuilder hasNameRepresentation(char nameRepresentation) {
		satellite.setSatelliteRepresentation(nameRepresentation) ; 
		return this;
	}
	@Override
	public Satellite build() {
		return satellite;
	}
	
	/**
	 * Initiate the satellite we have in the configuration file.
	 * @param satellites
	 */
	public void initiateSatellites(List<Satellite> satellites) { 
		for(String satelliteInfo : Configuration.__SATELLITES__) {
			String[] splittedSatelliteInfo = satelliteInfo.split(":"); 
			ISatelliteBuilder sb = new SatelliteBuilder(); 
			satellites.add(sb
							.hasName(splittedSatelliteInfo[0])
							.hasNameRepresentation(splittedSatelliteInfo[1].charAt(0))
							.hasdegree(Float.parseFloat(splittedSatelliteInfo[2]))
							.hasDirection(splittedSatelliteInfo[3].charAt(0))
							.build()
			);
			
		}
	}
	

}
