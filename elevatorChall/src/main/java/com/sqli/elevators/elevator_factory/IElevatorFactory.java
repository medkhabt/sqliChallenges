package com.sqli.elevators.elevator_factory;

import com.sqli.elevators.Building;
import com.sqli.elevators.Elevator;

public interface IElevatorFactory {
	public Elevator createElevator(Building building, String elevatorInfo); 
}
