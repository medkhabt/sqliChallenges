package com.sqli.train.wagon;

public class HeadWagonDecorater extends WagonDecorater{
	private boolean firstWagon; 

	public HeadWagonDecorater(IWagon wagon, boolean firstWagon) {
		super(wagon); 
		this.firstWagon = firstWagon;
	}


	public void setFirstWagon(boolean firstWagon) {
		this.firstWagon = firstWagon;
	}

	@Override
	public String print(String seperator) {
		if(firstWagon) {
			return this.wagon.print("") + seperator + "<HHHH"; 
		}
		else {
			return this.wagon.print("") + "HHHH>";
		}
	}

}
