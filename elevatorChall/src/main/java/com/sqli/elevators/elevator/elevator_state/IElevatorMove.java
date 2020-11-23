package com.sqli.elevators.elevator.elevator_state;

public interface IElevatorMove extends IElevatorState{
	public IElevatorState up(); 
	public IElevatorState down(); 
}
