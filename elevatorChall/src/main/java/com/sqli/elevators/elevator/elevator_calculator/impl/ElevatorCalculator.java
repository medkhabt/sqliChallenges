package com.sqli.elevators.elevator.elevator_calculator.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.sqli.elevators.Elevator;
import com.sqli.elevators.elevator.elevator_calculator.IElevatorCalculator;
import com.sqli.elevators.elevator.elevator_state.IElevatorState;

public class ElevatorCalculator implements IElevatorCalculator{

	private List<Elevator> elevators; 
	
	public static ElevatorCalculator _instance = null; 
	
	private ElevatorCalculator() {}
	
	public static ElevatorCalculator getInstance() {
		if(_instance == null) { 
			return new ElevatorCalculator(); 
		}
		return _instance; 
	}

	
	@Override
	public void init(List<Elevator> elevators) {
		this.elevators = elevators; 
		
	}
	
	@Override
	public String getIdClosestElevatorToRequest(int requestLevel) {
		Comparator<Elevator> distanceElevatorComparator = new Comparator<Elevator>() {
			/*
			 * the comparator that i'm using to sort the Elevators by the distance
			 * btw request and elevator. 
			 */
			@Override
			public int compare (Elevator e1, Elevator e2) {
				int d1 = e1.getState().distanceBtwRequestAndElevator(requestLevel); 
				int d2 = e2.getState().distanceBtwRequestAndElevator(requestLevel); 
				return d1 - d2; 
			}
		};
		/*
		 * here, sorted first, than got rid of the "-1" cases representing stopping 
		 * Elevator state. after that mapping to get the ids, and than reduce until we
		 * only have the first element of the stream (which is the smallest one according
		 * to the sorted function) 
		 */
		return this.elevators.stream()
		.sorted(distanceElevatorComparator)
		.filter(elevator -> elevator.getState().distanceBtwRequestAndElevator(requestLevel)>=0)
		.map(elevator -> elevator.getIdElevator())
		.reduce((first, second) -> first).orElse(null); 
		
		
//		.map(elevator -> elevator
//				.getState()
//				.distanceBtwRequestAndElevator(requestLevel))
//		.filter(num -> num >= 0)
//		.sorted()
//		.reduce((first, second) -> first); 
	
	}

	

}
