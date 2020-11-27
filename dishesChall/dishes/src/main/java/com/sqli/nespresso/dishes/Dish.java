package com.sqli.nespresso.dishes;

public class Dish {
	private String dishId; 
	private float degree; 
	private char direction;
	
	public Dish(String dishId, float degree, char direction) {
		this.dishId = dishId;
		this.degree = degree;
		this.direction = direction;
	}

	public String getDishId() {
		return dishId;
	}

	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public float getDegree() {
		return degree;
	}

	public void setDegree(float degree) {
		this.degree = degree;
	}

	public char getDirection() {
		return direction;
	}

	public void setDirection(char direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", degree=" + degree + ", direction=" + direction + "]";
	} 
	 
	 
	
}
