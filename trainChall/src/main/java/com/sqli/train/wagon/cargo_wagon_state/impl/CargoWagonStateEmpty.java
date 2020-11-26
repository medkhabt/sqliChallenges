package com.sqli.train.wagon.cargo_wagon_state.impl;

import com.sqli.train.wagon.cargo_wagon_state.ICargoWagonState;

public class CargoWagonStateEmpty implements ICargoWagonState{

	@Override
	public String print() {
		return "|____|";
	}

}
