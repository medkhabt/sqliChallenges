package com.sqli.elevators;

import com.sqli.elevators.Elevator.ElevatorState;

public class ElevatorDown extends Elevator{

	public ElevatorDown(String elevatorIdAndCurrentLevel) {
		super(elevatorIdAndCurrentLevel);
		this.setState(ElevatorState.DOWN);
	}
	
	public ElevatorDown(String elevatorId, int elevatorCurrentLevel) {
		super(elevatorId,elevatorCurrentLevel);
		this.setState(ElevatorState.DOWN);
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
