package com.sqli.nespresso.dishes;

public class Satellite {
	
	private char satelliteRepresentation; 
	private String satelliteName; 
	private float satelliteDegree; 
	private char satelliteDirection;
	
	public Satellite() {}
	
	public Satellite(char satelliteRepresentation, String satelliteName, float satelliteDegree,
			char satelliteDirection) {
		this.satelliteRepresentation = satelliteRepresentation;
		this.satelliteName = satelliteName;
		this.satelliteDegree = satelliteDegree;
		this.satelliteDirection = satelliteDirection;
	}

	public char getSatelliteRepresentation() {
		return satelliteRepresentation;
	}

	public void setSatelliteRepresentation(char satelliteRepresentation) {
		this.satelliteRepresentation = satelliteRepresentation;
	}

	public String getSatelliteName() {
		return satelliteName;
	}

	public void setSatelliteName(String satelliteName) {
		this.satelliteName = satelliteName;
	}

	public float getSatelliteDegree() {
		return satelliteDegree;
	}

	public void setSatelliteDegree(float satelliteDegree) {
		this.satelliteDegree = satelliteDegree;
	}

	public char getSatelliteDirection() {
		return satelliteDirection;
	}

	public void setSatelliteDirection(char satelliteDirection) {
		this.satelliteDirection = satelliteDirection;
	} 
	
	
}
