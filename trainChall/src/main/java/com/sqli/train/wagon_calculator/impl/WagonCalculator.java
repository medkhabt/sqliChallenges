package com.sqli.train.wagon_calculator.impl;

import com.sqli.train.wagon.IWagon;
import com.sqli.train.wagon_calculator.IWagonCalculator;
import com.sqli.train.wagon_factory.IWagonFactory;
import com.sqli.train.wagon_factory.impl.WagonFactory;

public class WagonCalculator implements IWagonCalculator{
	private static WagonCalculator _instance = null;
	private IWagonFactory wf = WagonFactory.getInstance(); 
	private WagonCalculator() {}
	
	public static WagonCalculator getInstance() {
		if(_instance == null) {
			_instance = new WagonCalculator(); 
			return _instance; 
		}
		return _instance; 
	}

//	TODO i stopped here ! 
	@Override
	public IWagon fillCargo(IWagon wagon) {
//		
		return null;
	}

	/**
	 * this is a cheap way of doing so, need a better solutin, but i don't really wanna strech anymore with the decorator solution
	 * version of this test. 
	 */
	@Override
	public boolean trainIsFull(IWagon wagon) {
		if(wagon.print().contains("|____|")) { 
			return false ; 
		}
		return true;
	}

}
