package com.slightmodders.craymod.init;

import com.slightmodders.craymod.items.SubItems;
import com.slightmodders.craymod.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.LinkedList;
import java.util.List;

/**
 * Class created by MrCrayFish. Makes registering blocks easier
 * @author MrCrayFish
 */

public class RegistrationHandler {

    /**
     * Contains methods to register Blocks
     */
    @Mod.EventBusSubscriber(modid = Reference.MOD_ID)
    public static class Blocks {
        private static final List<Block> BLOCKS = new LinkedList<>();

        /**
         * Add block to BLOCKS to be registered
         * @param block
         */
        static void add(Block block) {
            BLOCKS.add(block);
        }

        /**
         * Register each block in BLOCKS
         * @param event
         */
        @SubscribeEvent
        public static void register(final RegistryEvent.Register<Block> event) {
            BLOCKS.forEach(block -> event.getRegistry().register(block));
        }
    }

    /**
     * Contains methods to register Items
     */
    @Mod.EventBusSubscriber(modid = Reference.MOD_ID)
    public static class Items {
        private static final List<Item> ITEMS = new LinkedList<>();

        /**
         * Add item to ITEMS to be registered
         * @param item
         */
        static void add(Item item) {
            ITEMS.add(item);
        }

        /**
         * Register each item in ITEMS
         * @param event
         */
        @SubscribeEvent
        public static void register(final RegistryEvent.Register<Item> event) {
            ITEMS.forEach(item -> event.getRegistry().register(item));
        }
    }

    /**
     * Contains methods to register Recipes
     */
    @Mod.EventBusSubscriber(modid = Reference.MOD_ID)
    public static class Recipes {
        private static final List<IRecipe> RECIPES = new LinkedList<>();

        /**
         * Add recipe to RECIPES to be registered
         * @param recipe
         */
        static void add(IRecipe recipe) {
            RECIPES.add(recipe);
        }

        /**
         * Register each recipe in RECIPES
         * @param event
         */
        @SubscribeEvent
        public static void register(final RegistryEvent.Register<IRecipe> event) {
            RECIPES.forEach(recipe -> event.getRegistry().register(recipe));
        }
    }

    /**
     * Contains methods to register models
     */
    @Mod.EventBusSubscriber(modid = Reference.MOD_ID, value = Side.CLIENT)
    public static class Models {
        /**
         * Register each model for items in RECIPES
         * @param event
         */
        @SubscribeEvent
        public static void register(ModelRegistryEvent event) {
            Items.ITEMS.forEach(Models::registerRender);
        }

        /**
         * Register render for item
         * @param item
         */
        private static void registerRender(Item item) {
            if(item instanceof SubItems) {
                NonNullList<ResourceLocation> modelLocations = ((SubItems) item).getModels();
                for(int i = 0; i < modelLocations.size(); i++) {
                    ModelLoader.setCustomModelResourceLocation(item, i, new ModelResourceLocation(modelLocations.get(i), "inventory"));
                }
            }
            else {
                ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
            }
        }
    }

    public static void init() {
        ModBlocks.register();
        ModItems.register();
    }

}
