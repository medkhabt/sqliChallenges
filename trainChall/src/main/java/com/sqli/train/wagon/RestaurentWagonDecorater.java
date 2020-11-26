package com.sqli.train.wagon;

public class RestaurentWagonDecorater extends WagonDecorater{
	public RestaurentWagonDecorater(IWagon wagon) {
		super(wagon); 
	}
	@Override
	public String print(String seperator) {
		return this.wagon.print("") + seperator + "|hThT|";
	}

}
