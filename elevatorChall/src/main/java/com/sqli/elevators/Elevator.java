package com.sqli.elevators;

import com.sqli.elevators.elevator.elevator_calculator.IElevatorCalculator;
import com.sqli.elevators.elevator.elevator_state.IElevatorState;
import com.sqli.elevators.elevator.elevator_state.impl.ElevatorStateRest;


public class Elevator {
	
	private String idElevator;
	private int level; 
	private IElevatorState state; 
	private Building building; 


//	public Elevator() { 
//		String[] elevatorInfoSplited = elevatorIdAndCurrentLevel.split(":"); 
//		this.idElevator = elevatorInfoSplited[0]; 
//		this.level = Integer.getInteger(elevatorInfoSplited[1]); 
//		the elevator should be resting in the initial state. 
//		this.state = ElevatorState.REST; 
//	}
	
	public Elevator(Building building, String idElevator, int level) {
		this.idElevator = idElevator;
		this.level = level;
		this.building = building; 
		this.state = new ElevatorStateRest(this); 
//		TODO state = rest. 
	}

	public String getIdElevator() {
		return idElevator;
	}

	public void setIdElevator(String idElevator) {
		this.idElevator = idElevator;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public IElevatorState getState() {
		return state;
	}
	
//	public List<Elevator> createElevatorsFromElevatorsInfo() { 
//		
//	}

	public void setState(IElevatorState state) {
		this.state = state;
	}
	
	public boolean isElevator(String elevatorId) {
		return this.idElevator == elevatorId; 
	}
	
	
}
