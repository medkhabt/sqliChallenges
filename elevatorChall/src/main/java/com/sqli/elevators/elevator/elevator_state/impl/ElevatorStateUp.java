package com.sqli.elevators.elevator.elevator_state.impl;

import com.sqli.elevators.Elevator;
import com.sqli.elevators.elevator.elevator_state.IElevatorStop;

public class ElevatorStateUp implements IElevatorStop{

	private Elevator elevator; 
	
	public ElevatorStateUp(Elevator elevator) {
		this.elevator = elevator; 
	}

	@Override
	public int distanceBtwRequestAndElevator(int requestLevel) {
		int distance = requestLevel - elevator.getLevel(); 
		int maxfloor = elevator.getBuilding().getNumberOfFloors(); 
		return (distance >= 0) ? distance : 2 * maxfloor - (requestLevel + elevator.getLevel()) ;
	}
	
	@Override
	public void rest() {
		this.elevator.setState(new ElevatorStateRest(elevator));	
	}

	@Override
	public void stopAt(int stopLevel) {
		this.elevator.setState(new ElevatorStateStopping(elevator, stopLevel));
		
	}


	

	
	
}
