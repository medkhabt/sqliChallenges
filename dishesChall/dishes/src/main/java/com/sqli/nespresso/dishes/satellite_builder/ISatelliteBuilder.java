package com.sqli.nespresso.dishes.satellite_builder;

import java.util.List;

import com.sqli.nespresso.dishes.Satellite;

/**
 * Such a stretch with all this builder shenanigans. 
 * @author medkhalil
 *
 */
public interface ISatelliteBuilder {
	public ISatelliteBuilder hasName(String name);
	public ISatelliteBuilder hasdegree(float degree); 
	public ISatelliteBuilder hasDirection(char directionRepresentation);
	public ISatelliteBuilder hasNameRepresentation(char nameRepresentation); 
	public void initiateSatellites(List<Satellite> satellites); 
	public Satellite build(); 
}
