package com.sqli.train.wagon;

public class HeadWagonDecorater extends WagonDecorater{
	private boolean firstWagon; 

	public HeadWagonDecorater(IWagon wagon) {
		super(wagon);
		setFirstWagon(); 
	}


	public void setFirstWagon() {
		this.firstWagon = isFirstWagon();
	}

	@Override
	public String print() {
		if(firstWagon) {
			return this.wagon.print() + this.separator + "<HHHH"; 
		}
		else {
			return this.wagon.print() + "HHHH>";
		}
	}

}
