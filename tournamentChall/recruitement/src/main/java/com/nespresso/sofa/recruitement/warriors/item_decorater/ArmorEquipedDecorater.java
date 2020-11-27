package com.nespresso.sofa.recruitement.warriors.item_decorater;

import com.nespresso.sofa.recruitement.warriors.ItemEquipedDecorater;
import com.nespresso.sofa.recruitement.warriors.Warrior;

public class ArmorEquipedDecorater extends ItemEquipedDecorater{

	public ArmorEquipedDecorater(Warrior warrior) {
		super(warrior); 
		this.itemName = "armor"; 
	}

	@Override
	public void statsChange() {
		this.warrior.setDamage(this.getDamage() - 1);
		this.warrior.setResistance(resistance + 3);
	}

	@Override
	public void uniqueEffect(int round) {
		/**
		 * has none , he can have some in the future , if we don't intend to do so , we can create 2 interferces,
		 * one for the uniqueEffect ones, and the other for the non-uniqueEffect ones. 
		 */
		
	}

	@Override
	public Warrior equip(String item) {
		return ief.createEquipedItem(this, item);
	}

}
