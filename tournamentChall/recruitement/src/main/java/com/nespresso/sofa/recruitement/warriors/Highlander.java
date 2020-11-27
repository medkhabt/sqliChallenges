package com.nespresso.sofa.recruitement.warriors;

import com.nespresso.sofa.recruitement.weapons.impl.GreatSword;

public class Highlander extends Warrior{

	
	public Highlander() {
		super();
		this.hitPoints = 150;
		this.weapon = new GreatSword();
		this.damage = (int) (weapon.getBasicDamage() * weapon.getHitChancePercentage());
	}

	@Override
	public Warrior equip(String item) {
		return ief.createEquipedItem(this, item);
	}

	@Override
	public void uniqueEffect() {
		// None for now. 
		
	}

	
	

	

}
