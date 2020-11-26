package com.sqli.train.wagon;

public class DetachEndWagonDecorater extends WagonDecorater{

	public DetachEndWagonDecorater(IWagon wagon) {
		super(wagon);

	}

	@Override
	public String print() {
		int lastIndexSeparator = wagon.print().lastIndexOf(_separatorFormat);
		return wagon.print().substring(0, lastIndexSeparator );
	}

}
