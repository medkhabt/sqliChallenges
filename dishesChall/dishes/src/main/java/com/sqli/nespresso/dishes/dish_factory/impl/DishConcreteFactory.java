package com.sqli.nespresso.dishes.dish_factory.impl;

import com.sqli.nespresso.dishes.Dish;
import com.sqli.nespresso.dishes.dish_factory.IDishFactory;

public class DishConcreteFactory implements IDishFactory{
	private static DishConcreteFactory _instance = null; 
	private DishConcreteFactory() {}
	
	public static DishConcreteFactory getInstance() {
		if(_instance == null) { 
			_instance = new DishConcreteFactory(); 
		}
			return _instance; 
	}

	@Override
	public Dish createDish(String dishIdAndPosition) {
		String dishId = dishIdAndPosition.split(",")[0];
		String dishDegreeAndDirection = dishIdAndPosition.split(",")[1];
		int dishDegreeAndDirectionLength = dishDegreeAndDirection.length();
		
		float dishDegree = Float.parseFloat(dishDegreeAndDirection.substring(0,dishDegreeAndDirectionLength - 1)); 
		char dishDirection = dishDegreeAndDirection.charAt(dishDegreeAndDirectionLength - 1); 
		return new Dish(
				dishId,
				dishDegree,
				dishDirection);
	}

}
