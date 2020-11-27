package com.sqli.train.wagon_factory;

import com.sqli.train.Train;
import com.sqli.train.wagon.IWagon;

public interface IWagonFactory {
	/**
	 * Maybe this createWagon method shouldn't be here, If we had a train with more wagon types, we need 
	 * to create a new WagonFactory with the train logic, and it would explode pretty quickly (different combinations)
	 * which isn't right, we should probably get that logic back to the train 
	 * and create an abstract class Train, with different subclasses, that can take different type range of wagons. 
	 * 
	 * 
	 * the question here is , what if we have new type of wagons, how do we implement this, knowing that we can't change 
	 * this interface after deploying it. 
	 * 
	 * @param WagonCharRep : char representation of wagon's type. 
	 * @return an IWagon 
	 */
	public IWagon createWagon(Train train, char WagonCharRep); 
	public IWagon createHeadWagon(Train train); 
	public IWagon createPassengerWagon(Train train); 
	public IWagon createRestaurantWagon(Train train); 
	public IWagon createCargoWagon(Train train); 
}
