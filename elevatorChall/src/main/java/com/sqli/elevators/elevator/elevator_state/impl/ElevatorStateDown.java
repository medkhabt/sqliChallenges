package com.sqli.elevators.elevator.elevator_state.impl;

import com.sqli.elevators.Elevator;
import com.sqli.elevators.elevator.elevator_state.IElevatorState;
import com.sqli.elevators.elevator.elevator_state.IElevatorStop;

public class ElevatorStateDown implements IElevatorStop{
	private Elevator elevator; 
	
	public ElevatorStateDown() {}
	public ElevatorStateDown(Elevator elevator) {
		this.elevator = elevator; 
	}

	/**
	 * 
	 * @param requestLevel is the floor where the request is triggered 
	 * @return the amount of floors that needs to be traveled for the elevator can reach the 
	 * request floor. 
	 * 
	 * in case distance > 0, the elevator need to reach the edge of the building which is 
	 * floor 1 , and than get back to the request floor 
	 */
	@Override
	public int distanceBtwRequestAndElevator(int requestLevel) {
		int distance = requestLevel - elevator.getLevel(); 
		return (distance <= 0) ? distance : requestLevel + elevator.getLevel() - 2;
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
