package com.slightmodders.craymod.items;


import com.slightmodders.craymod.EnumModItems;

import net.minecraft.item.Item;

/**
 * Extend items with this class
 */
public class ModItem extends Item{

	public ModItem(EnumModItems name) {
		setUnlocalizedName(name.getUnlocalizedName());
		setRegistryName(name.getRegistryName());
	}
	
	
}
