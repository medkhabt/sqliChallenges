package com.nespresso.sofa.recruitement.weapons;
	/**
	 * if we have diffrent kind of weapons: 
	 * 	-melee weapons.
	 * 	-ranged weaopns.
	 * 	-aeo weapons. 
	 * 	-physical dmg. weapons 
	 * 	-magical dmg. weapons. 
	 * 
	 * THIS SHOULD BE AN ABSTRACT CLASS 
	 * 
	 * 
	 * @author medkhalil
	 * 
	 * 
	 * fuck i should've really changed this into an abstract class. 
	 *
	 */
public interface IWeapon {
	public void uniqueEffect(); 
	public float getBasicDamage(); 
	public float getHitChancePercentage(); 
	public void setBasicDamage(float damage); 
	public void setHitChancePercentage(float hitChancePercentage); 
}
