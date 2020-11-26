package com.sqli.train.wagon;

public abstract class WagonDecorater implements IWagon{
	protected final String _separatorFormat = "::"; 
	protected IWagon wagon; 
	protected String separator; 
	
	public WagonDecorater(IWagon wagon) {
		this.wagon = wagon;
		isFirstWagon(); 
	}

	@Override
	public abstract String print() ;
	
	
	public Boolean isFirstWagon() {
		if (wagon.print().equals("")) {
			this.separator = ""; 
			return true; 
		}
		else {
			this.separator = _separatorFormat; 
			return false ;
		}		
	}

}
