package com.sqli.train.wagon.imp;

import com.sqli.train.wagon.IWagon;

public class PassengerWagon implements IWagon{
	private static String wagonRepresentation = "|OOOO|";
	public PassengerWagon() {}
	
	//if you want to change the representation of Passengerwagons. 
	public static String getWagonRepresentation() {
		return wagonRepresentation;
	}

	public static void setWagonRepresentation(String wagonRepresentation) {
		PassengerWagon.wagonRepresentation = wagonRepresentation;
	}

	@Override
	public String print() {
		return wagonRepresentation;
	}
	
}
