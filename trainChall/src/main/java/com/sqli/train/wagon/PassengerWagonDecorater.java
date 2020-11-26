package com.sqli.train.wagon;

public class PassengerWagonDecorater extends WagonDecorater{
	
	public PassengerWagonDecorater(IWagon wagon) {
		super(wagon); 
	}
	@Override
	public String print() {
		return this.wagon.print() + this.separator + "|OOOO|";
	}

}


