package com.sqli.train.wagon_calculator;

import com.sqli.train.wagon.IWagon;

public interface IWagonCalculator {
	public IWagon fillCargo(IWagon wagon);

	public boolean trainIsFull(IWagon wagon); 
}
