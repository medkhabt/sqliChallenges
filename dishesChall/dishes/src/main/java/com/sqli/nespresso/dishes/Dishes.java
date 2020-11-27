package com.sqli.nespresso.dishes;

import java.util.ArrayList;
import java.util.List;

import com.sqli.nespresso.dishes.configuration.Configuration;
import com.sqli.nespresso.dishes.dish_calculator.IDishCalculator;
import com.sqli.nespresso.dishes.dish_calculator.impl.DishCalculator;
import com.sqli.nespresso.dishes.dish_factory.IDishFactory;
import com.sqli.nespresso.dishes.dish_factory.impl.DishConcreteFactory;
import com.sqli.nespresso.dishes.satellite_builder.ISatelliteBuilder;
import com.sqli.nespresso.dishes.satellite_builder.impl.SatelliteBuilder;

public class Dishes {
	private List<Dish> dishes = new ArrayList<>(); 
	private List<Satellite> satellites = new ArrayList<>(); 
	private IDishFactory df = DishConcreteFactory.getInstance(); 
	private IDishCalculator dc = DishCalculator.getInstance(); 
	/**
	 * 
	 * @param DishesIdAndDishesPosition : Array of Strings, each String represent
	 * the id and the position of particular dish. 
	 */
	public Dishes(String ...DishesIdAndDishesPosition) { 
		initiateSatellites(); 
		for(String singleDishIdAndPosition : DishesIdAndDishesPosition) {
			dishes.add(df.createDish(singleDishIdAndPosition));
		}
	}

	public void initiateSatellites() {
		ISatelliteBuilder sb = new SatelliteBuilder(); 
		sb.initiateSatellites(this.satellites);
	}
	public String signal(String string) {

		for(Satellite satellite : this.satellites) {
			if(satellite.getSatelliteRepresentation() == string.split(",")[1].charAt(1)) {
				return dc.signalQuality(this, satellite) ;
			}
		}
		/**
		 * Throw an exception
		 */
		return null; 
		
	}

	public void move(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}

	public List<Satellite> getSatellites() {
		return satellites;
	}

	public void setSatellites(List<Satellite> satellites) {
		this.satellites = satellites;
	}
	
	
	
}
