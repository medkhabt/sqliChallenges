package com.sqli.train.wagon_factory;

import com.sqli.train.wagon.IWagon;

public interface IWagonFactory {
	public IWagon createWagon(IWagon wagon, char wagonCharRepresentation); 
	public IWagon initiateWagon(); 
}
