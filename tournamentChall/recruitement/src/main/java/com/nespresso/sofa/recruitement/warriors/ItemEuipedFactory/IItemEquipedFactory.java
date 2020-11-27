package com.nespresso.sofa.recruitement.warriors.ItemEuipedFactory;

import com.nespresso.sofa.recruitement.warriors.ItemEquipedDecorater;
import com.nespresso.sofa.recruitement.warriors.Warrior;

public interface IItemEquipedFactory {
	public ItemEquipedDecorater createEquipedItem(Warrior warrior, String itemName); 
}
