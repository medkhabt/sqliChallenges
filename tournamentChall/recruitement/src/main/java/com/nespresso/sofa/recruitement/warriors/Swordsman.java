package com.nespresso.sofa.recruitement.warriors;

import com.nespresso.sofa.recruitement.weapons.impl.Sword;

public class Swordsman extends Warrior{
	
	public Swordsman() {
		super();
		this.hitPoints = 100;
		this.weapon = new Sword();
		this.damage = (int) (weapon.getBasicDamage() * weapon.getHitChancePercentage());
	}

	@Override
	public Warrior equip(String item) {
		return ief.createEquipedItem(this, item);
	}

	@Override
	public void uniqueEffect(int round) {
		// None for now
		
	}



	
	
}
