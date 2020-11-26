package com.sqli.train.wagon.imp;

import com.sqli.train.wagon.IWagon;

public class HeadWagon implements IWagon{
	private static String wagonRepresentation = "HHHH"; 
	private boolean isFirstWagon ; 

	public HeadWagon(boolean isFirstWagon) {
		this.isFirstWagon = isFirstWagon; 
	}


	public static String getWagonRepresentation() {
		return wagonRepresentation;
	}


	public static void setWagonRepresentation(String wagonRepresentation) {
		wagonRepresentation = wagonRepresentation;
	}


	public boolean isFirstWagon() {
		return isFirstWagon;
	}


	public void setFirstWagon(boolean isFirstWagon) {
		this.isFirstWagon = isFirstWagon;
	}


	@Override
	public String print() {
		if(isFirstWagon) {
			return "<" + wagonRepresentation; 
		}
		else { 
			return wagonRepresentation + ">"; 
		}
	}

}
