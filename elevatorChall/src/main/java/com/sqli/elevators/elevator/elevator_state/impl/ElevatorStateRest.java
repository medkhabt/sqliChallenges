package com.sqli.elevators.elevator.elevator_state.impl;

import com.sqli.elevators.Elevator;
import com.sqli.elevators.elevator.elevator_state.IElevatorMove;
import com.sqli.elevators.elevator.elevator_state.IElevatorState;

public class ElevatorStateRest implements IElevatorMove{
	private Elevator elevator ;
	
	public ElevatorStateRest() {}
	public ElevatorStateRest(Elevator elevator) { 
		this.elevator = elevator; 
	}
	

	@Override
	public int distanceBtwRequestAndElevator(int requestLevel) {
		return Math.abs(elevator.getLevel() - requestLevel);
	}

	@Override
	public IElevatorState up() {
		return new ElevatorStateUp(elevator);
	}

	@Override
	public IElevatorState down() {
		return new ElevatorStateDown(elevator);		
	}

}
