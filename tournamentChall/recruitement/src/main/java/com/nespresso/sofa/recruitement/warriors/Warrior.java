package com.nespresso.sofa.recruitement.warriors;

import com.nespresso.sofa.recruitement.warriors.ItemEuipedFactory.IItemEquipedFactory;
import com.nespresso.sofa.recruitement.warriors.ItemEuipedFactory.impl.ItemEquipedConcreteFactory;
import com.nespresso.sofa.recruitement.weapons.IWeapon;

public abstract class Warrior {
	protected int hitPoints; // hmm.. , in test it shows an integer. 
	protected int damage;
	protected int resistance;
	protected int damageTaken; 
	protected IWeapon weapon;
	protected IItemEquipedFactory ief = ItemEquipedConcreteFactory.getInstance(); 
	
	public Warrior() {
	}
	/**
	 * 
	 * Getters and Setters
	 * 
	 */
	
	
	public int getResistance() {
		return resistance; 
	}
	
	public int getDamageTaken() {
		return damageTaken;
	}
	public void setDamageTaken(int damageTaken) {
		this.damageTaken = damageTaken;
	}
	public void setResistance(int resistance) {
		this.resistance = resistance; 
	}
	
	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int f) {
		this.damage = f;
	}

	public IWeapon getWeapon() {
		return weapon;
	}

	public void setWeapon(IWeapon weapon) {
		this.weapon = weapon;
	}

	
	
	public int hitPoints() {
		return this.getHitPoints(); 
	}
	
	/**
	 * 
	 * Business Logic
	 *  this should be moved to a EngageCalculator class
	 */
	
	/**
	 * MOVE THIS ONE
	 * this engage first if he kills his enemy the engage is done
	 * if not the enemy counter attacks and if "this" hp is 0 the 
	 * engage ends. 
	 * if not we continue the sequence. 
	 * @param warrior
	 */
	
	public abstract void uniqueEffect(int round); 
	public void engage(Warrior warrior, int round) {
		do {
			this.attack(warrior, round); 
			if(warrior.isWarriorDead())
				break; 
			warrior.attack(this, round);		
		}while(!this.isWarriorDead()); 
	
	}
	/**
	 * MOVE THIS ONE
	 * if the hitPoints are less than 0 than we set them to 0. 
	 * @param warrior
	 */
	
	public boolean attack(Warrior warrior, int round) {
		this.uniqueEffect(round);
		int hitPointsLeft = warrior.hitPoints() - (int)this.damage; 
		warrior.setHitPoints( (hitPointsLeft > 0) ? hitPointsLeft : 0 );
		return warrior.isWarriorDead(); 
	}
	/**
	 * 
	 * @return : boolean that tests if a warrior is dead
	 */
	public boolean isWarriorDead() {
		return this.hitPoints == 0; 
	}
	/**
	 * 
	 * @param item : name of the item that the warrior will equipe
	 * @return A Warrior object with the new stats
	 */
	public abstract Warrior equip(String item);
	
	
}
