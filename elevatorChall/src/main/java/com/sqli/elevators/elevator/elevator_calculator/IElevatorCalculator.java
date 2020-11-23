package com.sqli.elevators.elevator.elevator_calculator;

import java.util.List;

import com.sqli.elevators.Elevator;

public interface IElevatorCalculator {
	public String getIdClosestElevatorToRequest(int requestLevel);
	public void init(List<Elevator> elevators); 
}

