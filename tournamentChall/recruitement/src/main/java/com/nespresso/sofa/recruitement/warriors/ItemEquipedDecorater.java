package com.nespresso.sofa.recruitement.warriors;

public abstract class ItemEquipedDecorater extends Warrior{
	protected String itemName; 
	protected Warrior warrior; 
	public ItemEquipedDecorater(Warrior warrior) {
		super(); 
		this.damage = warrior.getDamage(); 
		this.hitPoints = warrior.hitPoints(); 
		this.resistance = warrior.getResistance();
		this.warrior = warrior; 
		this.weapon = warrior.getWeapon(); 
	}
	public abstract void statsChange(); 
	public abstract void uniqueEffect(); 
}
