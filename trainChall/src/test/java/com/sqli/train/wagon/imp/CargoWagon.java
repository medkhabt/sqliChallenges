package com.sqli.train.wagon.imp;

import com.sqli.train.wagon.IWagon;
import com.sqli.train.wagon.imp.cargo_wagon_states.ICargoWagonState;
import com.sqli.train.wagon.imp.cargo_wagon_states.impl.CargoStateEmpty;

public class CargoWagon implements IWagon{
	private static String wagonRepresentation = "|"; 
	private ICargoWagonState cws; 
	
	public CargoWagon() {
		this.cws = new CargoStateEmpty(); 
	}
	
	
	@Override
	public String print() {
		return wagonRepresentation + cws.print() + wagonRepresentation; 
	}

}
