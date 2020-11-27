package com.sqli.nespresso.dishes.dish_calculator.impl;

import java.util.Comparator;

import com.sqli.nespresso.dishes.Dish;
import com.sqli.nespresso.dishes.Dishes;
import com.sqli.nespresso.dishes.Satellite;
import com.sqli.nespresso.dishes.dish_calculator.IDishCalculator;

public class DishCalculator implements IDishCalculator{
	private static DishCalculator _instance = null ; 
	
	private DishCalculator() {
		
	}
	
	public static DishCalculator getInstance() {
		if(_instance == null)
			_instance = new DishCalculator();
		return _instance; 
	}
	
	@Override
	public String signalQuality(Dishes dishes, Satellite satellite) {
		Dish theClosestDish = theClosestDishToTheSatellite(dishes, satellite); 
		String qualityRepresentation = "|**********|"; 
		int degreeDifference = degreeDifference(theClosestDish, satellite); 
		
		if(degreeDifference >=10) { 
			qualityRepresentation = "No signal !" ; 
		}
		else { 
			for(int i = 0; i < degreeDifference; i++) {
				qualityRepresentation = qualityRepresentation.replaceFirst("[*]", "."); 
			
			}
			StringBuilder sb = new StringBuilder(qualityRepresentation); 
			
			qualityRepresentation = sb.reverse().toString(); 
		}
		return qualityRepresentation; 
	}
	public int degreeDifference(Dish dish, Satellite satellite) { 
		return Math.abs(
				Math.round(
						(dish.getDegree() - satellite.getSatelliteDegree()) * 10)) ; 
	}
	public Dish theClosestDishToTheSatellite(Dishes dishes, Satellite satellite) { 
		Comparator<Dish> nearestDishToSatelliteComparator = new Comparator<Dish>() {
	
			public int compare(Dish d1, Dish d2) {
				float frequency1 = d1.getDegree(); 
				float frequency2 = d2.getDegree();
				return ((
						Math.abs(
								frequency1 - satellite.getSatelliteDegree()) 
						- Math.abs(
								frequency2 - satellite.getSatelliteDegree())
						) 
						< 0) ? -1 : 1;
			}
		};
		
		return dishes.getDishes().stream()
			.filter(dish -> dish.getDirection() == satellite.getSatelliteDirection())
			.sorted(nearestDishToSatelliteComparator)
			.reduce((first, second) -> first).orElse(null);
	}

}
