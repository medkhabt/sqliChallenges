package com.sqli.elevators.elevator.elevator_state;

public interface IElevatorStop extends IElevatorState{
	public void rest(); 
	public void stopAt(int level); 
}
