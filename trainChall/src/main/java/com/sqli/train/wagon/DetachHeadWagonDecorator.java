package com.sqli.train.wagon;

public class DetachHeadWagonDecorator extends WagonDecorater{

	public DetachHeadWagonDecorator(IWagon wagon) {
		super(wagon);
	}

	/**
	 * Here we look for the first occurence of the separator and than start our string from whats in front 
	 * of it, and taking in consideration what's the separator lenght while doing that. 
	 */
	@Override
	public String print() {
		int indexSeparator = wagon.print().indexOf(_separatorFormat); 
		return 	wagon.print().substring(indexSeparator + _separatorFormat.length());
	}

}
