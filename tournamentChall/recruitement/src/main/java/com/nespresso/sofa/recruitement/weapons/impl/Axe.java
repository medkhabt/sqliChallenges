package com.nespresso.sofa.recruitement.weapons.impl;

import com.nespresso.sofa.recruitement.weapons.IWeapon1Handed;

public class Axe implements IWeapon1Handed{
	private static final String swordName = "axe"; 
	private float basicDamage; 
	private float hitChancePercentage;
	
	
	public Axe() {
		this.basicDamage = 6;
		this.hitChancePercentage = 1;
	}
	/**
	 * Getters and Setters 
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
	 * Overrided Methods
	 */
	
	
	@Override
	public void attachWeapon(IWeapon1Handed weapon1h) {
		weapon1h.attachWeapon(this);
	} 
	
	@Override
	public void uniqueEffect() {
		// TODO Auto-generated method stub
		
	}
	
}
