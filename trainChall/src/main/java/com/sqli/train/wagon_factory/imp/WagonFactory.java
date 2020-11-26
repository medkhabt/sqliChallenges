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
			return new HeadWagon(train.getWagons().isEmpty()); 
		case 'P':
			return new PassengerWagon(); 
		case 'R':
			return new RestaurentWagon(); 
		case 'C':
			return new CargoWagon();	
		}
		return null; 
	}

}
