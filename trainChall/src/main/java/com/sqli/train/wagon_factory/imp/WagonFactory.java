package com.sqli.train.wagon_factory.imp;

import com.sqli.train.Train;
import com.sqli.train.wagon.IWagon;
import com.sqli.train.wagon.imp.CargoWagon;
import com.sqli.train.wagon.imp.HeadWagon;
import com.sqli.train.wagon.imp.PassengerWagon;
import com.sqli.train.wagon.imp.RestaurentWagon;
import com.sqli.train.wagon_factory.IWagonFactory;

public class WagonFactory implements IWagonFactory{
	private static WagonFactory _instance = null; 
	private WagonFactory() {}
	
	public static WagonFactory getInstance() {
		if(_instance == null) {
			_instance = new WagonFactory(); 
			return _instance ; 
		}
		return _instance ; 
	}
	
	@Override
	public IWagon createWagon(Train train, char wagonCharRepr) {
		switch(wagonCharRepr) {
		case 'H':
			return createHeadWagon(train); 
		case 'P':
			return new PassengerWagon(); 
		case 'R':
			return new RestaurentWagon(); 
		case 'C':
			return new CargoWagon();	
		}
		return null; 
	}

	@Override
	public IWagon createHeadWagon(Train train) {
		
		return new HeadWagon(train.getWagons().isEmpty());
	}

	@Override
	public IWagon createPassengerWagon(Train train) {
		return new PassengerWagon();
	}

	@Override
	public IWagon createRestaurantWagon(Train train) {
		return new RestaurentWagon();
	}

	@Override
	public IWagon createCargoWagon(Train train) {
		return new CargoWagon();
	}

}
