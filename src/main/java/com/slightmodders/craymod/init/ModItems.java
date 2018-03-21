package com.slightmodders.craymod.init;

import net.minecraft.item.Item;

/**
 * Used for registering items
 * @author TyrellPlayz
 */
public class ModItems {

    //public static Item example;

    static{
        //example = new ItemExample();
    }

    /**
     * Register the item
     */
    public static void register() {
        //registerItem(example);
    }

    private static void registerItem(Item item) {
        if(item.getRegistryName() == null)
            throw new IllegalArgumentException("A item being registered does not have a registry name and could be successfully registered.");
        RegistrationHandler.Items.add(item);
    }


}
