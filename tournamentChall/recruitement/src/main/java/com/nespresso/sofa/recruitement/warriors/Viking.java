package com.nespresso.sofa.recruitement.warriors;

import com.nespresso.sofa.recruitement.weapons.impl.Axe;

public class Viking extends Warrior{

	
	public Viking() {
		super(); 
		this.hitPoints = 120;
		this.weapon = new Axe();
		this.damage = (int) (weapon.getBasicDamage() * weapon.getHitChancePercentage());
	}

	@Override
	public Warrior equip(String item) {
		return ief.createEquipedItem(this, item);
	}

	@Override
	public void uniqueEffect(int round) {
		// None for now. 
		
	}




}
