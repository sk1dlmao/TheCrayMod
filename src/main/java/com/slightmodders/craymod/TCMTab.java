package com.slightmodders.craymod;

import com.slightmodders.craymod.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TCMTab extends CreativeTabs {

    public TCMTab(String label) {super("TCMTab");}

    @Override
    public ItemStack getTabIconItem() {return new ItemStack(Item.getItemFromBlock(ModBlocks.exampleblock));}


}
