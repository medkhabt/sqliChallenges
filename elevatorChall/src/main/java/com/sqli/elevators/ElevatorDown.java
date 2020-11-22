package com.sqli.elevators;

import com.sqli.elevators.Elevator.ElevatorState;

public class ElevatorDown extends Elevator{

	public ElevatorDown(String elevatorIdAndCurrentLevel) {
		super(elevatorIdAndCurrentLevel);
		this.setState(ElevatorState.DOWN);
	}
	
	public ElevatorDown(String elevatorId, String elevatorCurrentLevel) {
		super(elevatorId,elevatorCurrentLevel);
		this.setState(ElevatorState.DOWN);
	}

	@Override
	Elevator nextState(String nextState) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
