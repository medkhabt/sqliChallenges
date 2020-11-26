package com.sqli.train.wagon_factory;

import com.sqli.train.wagon.IWagon;

public interface IWagonFactory {
	public IWagon createWagon(IWagon wagon, char wagonCharRepresentation); 
	public IWagon initiateWagon(); 
	public IWagon createDetachHeadWagonDecorater(IWagon wagon); 
	public IWagon createDetachEndWagonDecorater(IWagon wagon); 
}
