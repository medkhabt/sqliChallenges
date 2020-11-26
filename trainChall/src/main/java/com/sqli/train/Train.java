package com.sqli.train;

import java.util.ArrayList;
import java.util.List;

import com.sqli.train.wagon.IWagon;
import com.sqli.train.wagon_calculator.IWagonCalculator;
import com.sqli.train.wagon_calculator.impl.WagonCalculator;
import com.sqli.train.wagon_factory.IWagonFactory;
import com.sqli.train.wagon_factory.imp.WagonFactory;

public class Train {
	private List<IWagon> wagons = new ArrayList<>(); 
	private static String separator = "::"; 
	private IWagonFactory wf = WagonFactory.getInstance(); 
	private IWagonCalculator wc = WagonCalculator.getInstance(); 
	public Train(String trainStringRepresentation) {
		for(char wagonCharRep : trainStringRepresentation.toCharArray()) {
			wagons.add(wf.createWagon(this, wagonCharRep)); 
			
		}
		
		
	}

	public List<IWagon> getWagons() {
		return wagons;
	}

	public void setWagons(List<IWagon> wagons) {
		this.wagons = wagons;
	}
	
	public String print() {
		String trainRepr = ""; 
		for(IWagon wagon: wagons) {
			if(wagons.indexOf(wagon) != 0) {
				trainRepr += separator; 
			}
			trainRepr+= wagon.print(); 
		}
//		System.out.println("trainRepr:  " + trainRepr);
		return trainRepr; 
		
	}

	public void detachHead() {
		this.wagons = wc.detachHead(this); 
	}
	
	public void detachEnd() {
		 this.wagons = wc.detachEnd(this); 
	}

	public boolean fill() {
		return wc.fill(this); 
		
	}

	
}
