package com.sqli.elevators;

public class ElevatorRest extends Elevator{

	public ElevatorRest(String elevatorIdAndCurrentLevel) {
		super(elevatorIdAndCurrentLevel);
		this.setState(ElevatorState.REST);
	}
	public ElevatorRest(String elevatorId, String elevatorCurrentLevel) {
		super(elevatorId,elevatorCurrentLevel);
		this.setState(ElevatorState.REST);
	}

	
//	this needs some work, to make it more dynamic, but i don't think it's the case in this challenge.
	@Override
	Elevator nextState(String nextState) throws Exception {	
		if(nextState == "UP") {
			return new ElevatorUp(this.getIdElevator(), this.getLevel()); 
		}
		else if(nextState == "DOWN") { 
			return new ElevatorDown(this.getIdElevator(), this.getLevel()); 
		}
		else { 
			throw new Exception("State Invalid"); 
		}
	}

}
