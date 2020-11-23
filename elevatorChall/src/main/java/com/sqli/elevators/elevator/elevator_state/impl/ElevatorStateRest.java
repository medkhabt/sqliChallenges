package com.sqli.elevators.elevator.elevator_state.impl;

import com.sqli.elevators.Elevator;
import com.sqli.elevators.elevator.elevator_state.IElevatorMove;

public class ElevatorStateRest implements IElevatorMove{
	private Elevator elevator ;
	
	public ElevatorStateRest(Elevator elevator) { 
		this.elevator = elevator; 
	}
	

	@Override
	public int distanceBtwRequestAndElevator(int requestLevel) {
		return Math.abs(elevator.getLevel() - requestLevel);
	}

	@Override
	public void up() {
		elevator.setState(new ElevatorStateUp(elevator));
	}

	@Override
	public void down() {
		elevator.setState(new ElevatorStateDown(elevator));		
	}

}
