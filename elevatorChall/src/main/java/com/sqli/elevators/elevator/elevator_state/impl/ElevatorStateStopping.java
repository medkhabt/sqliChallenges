package com.sqli.elevators.elevator.elevator_state.impl;

import com.sqli.elevators.Elevator;
import com.sqli.elevators.elevator.elevator_state.IElevatorMove;
import com.sqli.elevators.elevator.elevator_state.IElevatorState;

public class ElevatorStateStopping implements IElevatorState{
	private Elevator elevator; 
	private int stopLevel; 
	
	public ElevatorStateStopping() {}
	public ElevatorStateStopping(Elevator elevator,int stopLevel) {
		this.elevator = elevator; 
		this.stopLevel = stopLevel; 
	}
/*
 * here i don't want to implement this one for now, because we don't know what's the
 * destination of the person requesting the elevator, maybe if he has a stop before 
 * the elevator stop floor, it would possible to get into the elevator. 
 */
	@Override
	public int distanceBtwRequestAndElevator(int requestLevel) {
		return -1;
	}

}
