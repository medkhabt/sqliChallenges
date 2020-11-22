package com.sqli.elevators;

import java.util.List;

import com.sqli.elevators.Elevator.ElevatorState;

public class Building {
	
	private int numberOfFloors; 
	private List<Elevator> elevators; 
	
	public Building(int numberOfFloors, String ...elevatorIdAndCurrentPosition){ 
		this.numberOfFloors= numberOfFloors; 
//		creating and initiating elevators with a rest state. 
		for(String singleElevatorInfo: elevatorIdAndCurrentPosition) {
			elevators.add(new ElevatorRest(singleElevatorInfo)); 
		}
	}


	public int getNumberOfFloors() {
		return numberOfFloors;
	}


	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}


	public List<Elevator> getElevators() {
		return elevators;
	}

	public void setElevators(List<Elevator> elevators) {
		this.elevators = elevators;
	}
	

	public void move(String elevatorId, String state) throws Exception{
		
		for(Elevator elevator: elevators) { 
			if(elevator.getIdElevator() == elevatorId) {
				if(elevator.getState() == ElevatorState.REST) {
					elevator.nextState(state); 
				}
				else if (elevator.getState() != ElevatorState.REST) { 
					throw new Exception("Already moving!"); 
				}
				break; 
			}
//	TODO		if nothing is found Exception. 
			
		}
	}
//	
	public String requestElevator() {
		return null ; 
	}
	public String requestElevator(int level) {
		return null; 
	}
//	
//	public void stopAt(); 
}
