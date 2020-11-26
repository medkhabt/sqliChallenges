package com.sqli.train.wagon.cargo_wagon_state.impl;

import com.sqli.train.wagon.cargo_wagon_state.ICargoWagonState;

public class CargoWagonStateLoaded implements ICargoWagonState{

	@Override
	public String print() {
		return "|^^^^|";
	}

}
