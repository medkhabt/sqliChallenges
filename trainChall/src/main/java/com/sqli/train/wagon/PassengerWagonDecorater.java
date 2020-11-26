package com.sqli.train.wagon;

public class PassengerWagonDecorater extends WagonDecorater{
	
	public PassengerWagonDecorater(IWagon wagon) {
		super(wagon); 
	}
	@Override
	public String print(String seperator) {
		return this.wagon.print("") + seperator + "|OOOO|";
	}

}


