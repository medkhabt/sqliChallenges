package com.nespresso.sofa.recruitement.weapons.impl;

import com.nespresso.sofa.recruitement.weapons.IWeapon;
import com.nespresso.sofa.recruitement.weapons.IWeapon1Handed;

/**
 * I should name this class differently, as the project get bigger, we will have surely different kind of swords, and 1 hand swords. 
 * @author medkhalil
 *
 */
public class Sword implements IWeapon1Handed{
	private static final String swordName = "sword"; 
	private float basicDamage; 
	private float hitChancePercentage; 
	

	public Sword() {
		this.basicDamage = 5;
		this.hitChancePercentage = 1;
	}
	
	/**
	 * 
	 * SETTER AND GETTERS 
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
	 * 
	 * OVERRIDED METHODS
	 * 
	 */
	
	@Override
	public void uniqueEffect() {
				
	}
	@Override
	public void attachWeapon(IWeapon1Handed weapon1h) {
		weapon1h.attachWeapon(this);
	}

}
