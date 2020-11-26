package com.sqli.train.wagon_calculator.impl;

import java.util.List;

import com.sqli.train.Train;
import com.sqli.train.wagon.IWagon;
import com.sqli.train.wagon_calculator.IWagonCalculator;

public class WagonCalculator implements IWagonCalculator{
	private static WagonCalculator _instance = null; 
	private WagonCalculator() {}
	
	public static WagonCalculator getInstance() {
		if(_instance == null) {
			_instance = new WagonCalculator(); 
		}
		return _instance; 
	}

	@Override
	public List<IWagon> detachHead(Train train) {
		train.getWagons().remove(0);
		return train.getWagons(); 
	}

	@Override
	public List<IWagon> detachEnd(Train train) {
		// remove the last wagon of a train 
		train.getWagons().remove(train.getWagons().size() - 1); 
		return train.getWagons();
	}

}
