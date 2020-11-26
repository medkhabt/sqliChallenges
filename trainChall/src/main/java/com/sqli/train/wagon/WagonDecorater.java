package com.sqli.train.wagon;

public abstract class WagonDecorater implements IWagon{
	IWagon wagon; 
	String separator; 
	
	public WagonDecorater(IWagon wagon) {
		this.wagon = wagon;
		isFirstWagon(); 
	}

	@Override
	public abstract String print(String seperator) ;
	
	public Boolean isFirstWagon() {
		if (wagon.print("").equals("")) {
			this.separator = ""; 
			return true; 
		}
		else {
			this.separator = "::"; 
			return false ;
		}		
	}

}
