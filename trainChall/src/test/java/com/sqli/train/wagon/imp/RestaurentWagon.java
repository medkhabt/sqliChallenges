package com.sqli.train.wagon.imp;

import com.sqli.train.wagon.IWagon;

public class RestaurentWagon implements IWagon{
	private static String wagonRepresentation = "|hThT|";
	public RestaurentWagon() {
	}
	
	
	public static String getWagonRepresentation() {
		return wagonRepresentation;
	}


	public static void setWagonRepresentation(String wagonRepresentation) {
		RestaurentWagon.wagonRepresentation = wagonRepresentation;
	}


	@Override
	public String print() {
		return wagonRepresentation;
	}

}
