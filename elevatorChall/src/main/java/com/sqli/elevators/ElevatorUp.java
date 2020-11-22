package com.sqli.elevators;

import com.sqli.elevators.Elevator.ElevatorState;

public class ElevatorUp extends Elevator{

	public ElevatorUp(String elevatorIdAndCurrentLevel) {
		super(elevatorIdAndCurrentLevel);
		this.setState(ElevatorState.UP);
	}
	
	public ElevatorUp(String elevatorId, String elevatorCurrentLevel) {
		super(elevatorId,elevatorCurrentLevel);
		this.setState(ElevatorState.UP);
	}

	@Override
	Elevator nextState(String nextState) throws Exception {
		if(nextState == "Rest") {
			return new ElevatorRest(this.getIdElevator(), this.getLevel()); 
		}
		
		else { 
//			TODO explicit Exception messages. 
			throw new Exception("State Invalid"); 
		}
		
	}
	

}
