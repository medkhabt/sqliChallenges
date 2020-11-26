package com.sqli.train.wagon.imp.cargo_wagon_states.impl;

import com.sqli.train.wagon.imp.cargo_wagon_states.ICargoWagonState;

public class CargoStateLoaded implements ICargoWagonState{
	private static String wagonRepresentation = "^^^^"; 
	
	public CargoStateLoaded() {}

	@Override
	public String print() {
		return wagonRepresentation;
	}

	@Override
	public Boolean isCargoFull() {
		return true;
	}

}
