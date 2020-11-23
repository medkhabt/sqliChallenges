package com.sqli.elevators.elevator.elevator_state;

public interface IElevatorStop extends IElevatorState{
	public IElevatorState rest(); 
	public IElevatorState stopAt(int level); 
}
