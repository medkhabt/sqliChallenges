package com.sqli.train.wagon.cargo_wagon_state;
/**
 * We can have multiple states in the future, like half full cargo, or with filled with different objects
 * and different amounts. 
 * 
 * @author medkhalil
 *
 */
public interface ICargoWagonState {
	public String print(String seperator); 
}
