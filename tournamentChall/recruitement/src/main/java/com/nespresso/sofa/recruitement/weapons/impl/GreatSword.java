package com.nespresso.sofa.recruitement.weapons.impl;

import com.nespresso.sofa.recruitement.weapons.IWeapon2Handed;

public class GreatSword implements IWeapon2Handed{
	private static final String swordName = "great sword"; 
	private float basicDamage; 
	private float hitChancePercentage;
	

	public GreatSword() {
		this.basicDamage = 12;
		this.hitChancePercentage = 2/3;
	}
	
	/**
	 * 
	 * Getters and Setters
	 * 
	 */
	
	public float getBasicDamage() {
		return basicDamage;
	}


	public void setBasicDamage(float basicDamage) {
		this.basicDamage = basicDamage;
	}


	public float getHitChancePercentage() {
		return hitChancePercentage;
	}


	public void setHitChancePercentage(float hitChancePercentage) {
		this.hitChancePercentage = hitChancePercentage;
	}


	public static String getSwordname() {
		return swordName;
	}

	/**
	 * Override Methods
	 */
	@Override
	public void uniqueEffect() {
		// TODO Auto-generated method stub
		
	}

}
