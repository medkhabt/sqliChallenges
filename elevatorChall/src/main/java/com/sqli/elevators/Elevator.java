package com.sqli.elevators;

public abstract class Elevator {
	enum ElevatorState {
		REST,
		UP,
		DOWN
	} 
	private String idElevator;
	private int level; 
	private ElevatorState state; 

	public Elevator(String elevatorIdAndCurrentLevel) { 
		String[] elevatorInfoSplited = elevatorIdAndCurrentLevel.split(":"); 
		this.idElevator = elevatorInfoSplited[0]; 
		this.level = Integer.getInteger(elevatorInfoSplited[1]); 
//		the elevator should be resting in the initial state. 
//		this.state = ElevatorState.REST; 
	}
	
	public Elevator(String elevatorId, int elevatorCurrentLevel) { 
		this.idElevator = elevatorId; 
		this.level = elevatorCurrentLevel; 
	}

	public String getIdElevator() {
		return idElevator;
	}

	public void setIdElevator(String idElevator) {
		this.idElevator = idElevator;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public ElevatorState getState() {
		return state;
	}
	
//	public List<Elevator> createElevatorsFromElevatorsInfo() { 
//		
//	}

	public void setState(ElevatorState state) {
		this.state = state;
	}
	
	abstract Elevator nextState(String nextState) throws Exception;
	
	
}
