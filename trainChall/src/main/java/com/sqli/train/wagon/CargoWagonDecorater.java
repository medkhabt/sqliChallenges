package com.sqli.train.wagon;

import com.sqli.train.wagon.cargo_wagon_state.ICargoWagonState;
import com.sqli.train.wagon.cargo_wagon_state.impl.CargoWagonStateEmpty;

public class CargoWagonDecorater extends WagonDecorater{
	String separator ; 
	ICargoWagonState cws ; 
	public CargoWagonDecorater(IWagon wagon) {
		super(wagon); 
		this.cws = new CargoWagonStateEmpty();
	}
	
	public ICargoWagonState getCws() {
		return cws;
	}

	public void setCws(ICargoWagonState cws) {
		this.cws = cws;
	}

	public String fill() {
		return null; 
	}
	@Override
	public String print() {
		return this.wagon.print() + this.separator + cws.print(); 
	}


	

}
