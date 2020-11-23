package com.sqli.elevators.elevator.elevator_state.impl;

import com.sqli.elevators.Elevator;
import com.sqli.elevators.elevator.elevator_state.IElevatorState;
import com.sqli.elevators.elevator.elevator_state.IElevatorStop;

public class ElevatorStateUp implements IElevatorStop{

	private Elevator elevator; 
	public ElevatorStateUp() {}
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
	public IElevatorState rest() {
		return new ElevatorStateRest(elevator);	
	}

	@Override
	public IElevatorState stopAt(int stopLevel) {
		return new ElevatorStateStopping(elevator, stopLevel);		
	}


	

	
	
}
