package com.sqli.elevators;

import java.util.ArrayList;
import java.util.List;

import com.sqli.elevators.elevator.elevator_calculator.IElevatorCalculator;
import com.sqli.elevators.elevator.elevator_calculator.impl.ElevatorCalculator;
import com.sqli.elevators.elevator.elevator_state.IElevatorMove;
import com.sqli.elevators.elevator.elevator_state.IElevatorState;
import com.sqli.elevators.elevator.elevator_state.IElevatorStop;
import com.sqli.elevators.elevator.elevator_state.impl.ElevatorStateDown;
import com.sqli.elevators.elevator.elevator_state.impl.ElevatorStateRest;
import com.sqli.elevators.elevator.elevator_state.impl.ElevatorStateStopping;
import com.sqli.elevators.elevator.elevator_state.impl.ElevatorStateUp;
import com.sqli.elevators.elevator_factory.IElevatorFactory;
import com.sqli.elevators.elevator_factory.impl.NormalElevatorFactory;





public class Building {
	
	private int numberOfFloors; 
	private List<Elevator> elevators = new ArrayList<>(); 
	
	private IElevatorFactory elevatorFactory = NormalElevatorFactory.getInstance(); 
	private IElevatorCalculator elevatorCalculator = ElevatorCalculator.getInstance(); 
	public Building(int numberOfFloors, String ...elevatorIdAndCurrentPosition){ 
		this.numberOfFloors= numberOfFloors; 
		
//		creating and initiating elevators with a rest state. 
		
		for(String singleElevatorInfo: elevatorIdAndCurrentPosition) {
			
//			I need to test this out, if it gonna give me acurate building infos after creating the building
			Elevator elevator = elevatorFactory.createElevator(this, singleElevatorInfo); 
			elevators.add(elevator); 
		}
		elevatorCalculator.init(elevators);
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
	

	public void move(String elevatorId, String state){
		for(Elevator elevator: elevators) {
			if(elevator.getIdElevator().equals(elevatorId)) {
				IElevatorMove es = new ElevatorStateRest(elevator); 
				if(state == "UP") {
					elevator.setState(es.up()); 	
				}
				else if(state == "DOWN") { 
					elevator.setState(es.down());
				}
			}
		}
	}
//	
	public String requestElevator() {
		
		return elevatorCalculator.getIdClosestElevatorToRequest(numberOfFloors); 
	}
	public String requestElevator(int level) {
		return elevatorCalculator.getIdClosestElevatorToRequest(level); 
	}
//	
	public void stopAt(String elevatorId, int level){
		
		for(Elevator elevator: elevators) { 
			if(elevator.getIdElevator().equals(elevatorId)) { 
				IElevatorStop es = new ElevatorStateDown(elevator); 
				if(elevator.getState().getClass().getName() == "ElevatorStateUp") 
					es =  new ElevatorStateUp(elevator); 
				else if(elevator.getState().getClass().getName() == "ElevatorStateDown")
					es = new ElevatorStateDown(elevator); 
				elevator.setState(es.stopAt(level)); 	
			}
		}
	}
}
