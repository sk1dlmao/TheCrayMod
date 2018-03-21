package com.slightmodders.craymod.init;

import com.slightmodders.craymod.EnumModBlocks;

import com.slightmodders.craymod.Main;
import com.slightmodders.craymod.blocks.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.block.material.Material;

/**
 * Used for registering blocks -  public static Block blockID;
 * @author TyrellPlayz
 */
public class ModBlocks {

    public static Block exampleblock;

    /**
     * lowercaseBlockName = new ModBlock(Material.MATERIAL, EnumModBlocks.REGISTEREDBLOCKNAME).setCreativeTab(Main.TCMTab);
     */

    static {
        exampleblock = new ModBlock(Material.ROCK, EnumModBlocks.EXAMPLEBLOCK);
    }

    /**
     * Register blocks - registerBlock(blockID);
     */
    public static void register() {
        registerBlock(exampleblock);
    }

    private static void registerBlock(Block block) {
        registerBlock(block, new ItemBlock(block));
    }

    private static void registerBlock(Block block, ItemBlock item) {
        if(block.getRegistryName() == null)
            throw new IllegalArgumentException("A block being registered does not have a registry name and could be successfully registered.");
        RegistrationHandler.Blocks.add(block);
        item.setRegistryName(block.getRegistryName());
        RegistrationHandler.Items.add(item);
    }


}
