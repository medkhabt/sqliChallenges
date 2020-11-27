package com.nespresso.sofa.recruitement.warriors.item_decorater;

import com.nespresso.sofa.recruitement.warriors.ItemEquipedDecorater;
import com.nespresso.sofa.recruitement.warriors.Warrior;

public class BucklerEquipedDecorater extends ItemEquipedDecorater{

	public BucklerEquipedDecorater(Warrior warrior) {
		super(warrior);
		this.itemName = "buckler"; 
		
	}

	@Override
	public void statsChange() {
		/**
		 * changes nothing; 
		 */
		
	}

	@Override
	public void uniqueEffect() {
		warrior.uniqueEffect(); 
		
	}

	@Override
	public Warrior equip(String item) {
		return ief.createEquipedItem(this, item);
	}

}
