package com.sqli.elevators.elevator_factory.impl;

import com.sqli.elevators.Building;
import com.sqli.elevators.Elevator;
import com.sqli.elevators.elevator_factory.IElevatorFactory;

public class NormalElevatorFactory implements IElevatorFactory{

	public static NormalElevatorFactory _instance = null; 
	
	private NormalElevatorFactory(){}
	
	public static NormalElevatorFactory getInstance() {
		if(_instance == null)
			return new NormalElevatorFactory(); 
		return _instance;
	}
	 
	
	@Override
	public Elevator createElevator(Building building, String elevatorInfo) {
		String[] elevatorInfoSplited = elevatorInfo.split(":"); 
		String idElevator = elevatorInfoSplited[0]; 
		int level = Integer.valueOf(elevatorInfoSplited[1]); 
		return new Elevator(building, idElevator, level); 
	}
	

}
