package com.sqli.nespresso.dishes.dish_factory;

import com.sqli.nespresso.dishes.Dish;

public interface IDishFactory {
	public Dish createDish(String dishIdAndPosition); 
}
