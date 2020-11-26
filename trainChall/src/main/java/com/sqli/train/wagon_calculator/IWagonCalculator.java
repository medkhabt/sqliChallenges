package com.sqli.train.wagon_calculator;

import java.util.List;

import com.sqli.train.Train;
import com.sqli.train.wagon.IWagon;

public interface IWagonCalculator {
	public List<IWagon> detachHead(Train train); 
	public List<IWagon> detachEnd(Train train);
//	public boolean isFull(Train train); 
	public boolean fill(Train train);
}
