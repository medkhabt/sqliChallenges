package com.sqli.train.wagon;

public interface IWagon {
	public String print(); 
	/**
	 * maybe in the future we will take in consideration all wagons
	 * states. 
	 * @return boolean : if the wagon is full or not. 
	 */
	public Boolean isFull();
	
	/**
	 * same reasoning. 
	 */
	public void fill(); 
}
