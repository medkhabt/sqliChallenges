package com.sqli.train.wagon_factory.impl;

import com.sqli.train.wagon.CargoWagonDecorater;
import com.sqli.train.wagon.DetachEndWagonDecorater;
import com.sqli.train.wagon.DetachHeadWagonDecorator;
import com.sqli.train.wagon.HeadWagonDecorater;
import com.sqli.train.wagon.IWagon;
import com.sqli.train.wagon.PassengerWagonDecorater;
import com.sqli.train.wagon.RestaurentWagonDecorater;
import com.sqli.train.wagon.impl.Wagon;
import com.sqli.train.wagon_factory.IWagonFactory;

public class WagonFactory implements IWagonFactory{
	public static WagonFactory _instance = null; 
	
	private WagonFactory() {}
	
	public static WagonFactory getInstance() {
		if(_instance == null) {
			return new WagonFactory(); 
		}
		return _instance;
	}
	
	@Override
	public IWagon createWagon(IWagon wagon, char wagonCharRepresentation) {
		/**
		 * No need to add breaks, (return do its job). 
		 */
		switch(wagonCharRepresentation) {
		case 'H':
			return new HeadWagonDecorater(wagon); 
		case 'P':
			return new PassengerWagonDecorater(wagon); 
		case 'R':
			return new RestaurentWagonDecorater(wagon); 
		case 'C':
			return new CargoWagonDecorater(wagon);
			
		}
		/**
		 * throw an Exception
		 */
		return null;
	}
	
	public IWagon createDetachHeadWagonDecorater(IWagon wagon) {
		return new DetachHeadWagonDecorator(wagon); 
	}
	
	public IWagon createDetachEndWagonDecorater(IWagon wagon) { 
		return new DetachEndWagonDecorater(wagon); 
	}
	@Override
	public IWagon initiateWagon() {
		return new Wagon(); 
	}

}
