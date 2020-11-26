package com.sqli.train.wagon.imp.cargo_wagon_states.impl;

import com.sqli.train.wagon.imp.CargoWagon;
import com.sqli.train.wagon.imp.cargo_wagon_states.ICargoWagonState;

public class CargoStateEmpty implements ICargoWagonState{
	private static String wagonRepresentation = "____"; 
	
	public CargoStateEmpty() { 
	}

	@Override
	public String print() {
		return wagonRepresentation;
	}

	@Override
	public Boolean isCargoFull() {
		return false;
	}
	
	
	
}
