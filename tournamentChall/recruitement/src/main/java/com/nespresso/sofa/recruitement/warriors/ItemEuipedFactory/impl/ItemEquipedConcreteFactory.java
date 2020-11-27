package com.nespresso.sofa.recruitement.warriors.ItemEuipedFactory.impl;

import com.nespresso.sofa.recruitement.warriors.ItemEquipedDecorater;
import com.nespresso.sofa.recruitement.warriors.Warrior;
import com.nespresso.sofa.recruitement.warriors.ItemEuipedFactory.IItemEquipedFactory;
import com.nespresso.sofa.recruitement.warriors.item_decorater.ArmorEquipedDecorater;
import com.nespresso.sofa.recruitement.warriors.item_decorater.BucklerEquipedDecorater;

public class ItemEquipedConcreteFactory implements IItemEquipedFactory{
	private static ItemEquipedConcreteFactory _instance = null; 
	
	private ItemEquipedConcreteFactory() {}
	
	public static ItemEquipedConcreteFactory getInstance() {
		if(_instance == null)
			_instance = new ItemEquipedConcreteFactory(); 
		return _instance; 
	}

	@Override
	public ItemEquipedDecorater createEquipedItem(Warrior warrior, String itemName) {
		switch(itemName) {
			case "buckler":
				return new BucklerEquipedDecorater(warrior); 
			case "armor":
				return new ArmorEquipedDecorater(warrior); 
			default:
				System.out.println("throw an UNKOWN_ITEM_NAME_EXCEPTION e");
				return null; 
		}
	}
	
}
