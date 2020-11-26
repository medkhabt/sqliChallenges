package com.sqli.train.wagon;

public class RestaurentWagonDecorater extends WagonDecorater{
	public RestaurentWagonDecorater(IWagon wagon) {
		super(wagon); 
	}
	@Override
	public String print() {
		return this.wagon.print() + this.separator+ "|hThT|";
	}

}
