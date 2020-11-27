package com.sqli.nespresso.dishes.dish_calculator;

import com.sqli.nespresso.dishes.Dish;
import com.sqli.nespresso.dishes.Dishes;
import com.sqli.nespresso.dishes.Satellite;

public interface IDishCalculator {
	public String signalQuality(Dishes dishes, Satellite satellite);

	public void move(Dish dish, String dishDegreeAndDirection); 
}
