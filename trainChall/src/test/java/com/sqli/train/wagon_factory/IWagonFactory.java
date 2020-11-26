package com.sqli.train.wagon_factory;

import com.sqli.train.Train;
import com.sqli.train.wagon.IWagon;

public interface IWagonFactory {
	/**
	 * 
	 * @param WagonCharRep : char representation of wagon's type. 
	 * @return an IWagon 
	 */
	public IWagon createWagon(Train train, char WagonCharRep); 
}
