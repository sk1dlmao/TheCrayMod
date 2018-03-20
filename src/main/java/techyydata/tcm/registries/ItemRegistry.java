package techyydata.tcm.registries;

import net.minecraft.item.Item;
import techyydata.tcm.Reference;
import techyydata.tcm.common.TMTab;
import techyydata.tcm.common.items.*;
import techyydata.tcm.handlers.RegistryHandler;

public class ItemRegistry {
    public static final Item MRCRAYFISH = new ItemMrCrayfish().setRegistryName(Reference.MOD_ID, "mrcrayfish").setUnlocalizedName(Reference.MOD_ID + ":mrcrayfish").setCreativeTab(TMTab.craymodTab);


    public static void init() {
        RegistryHandler.registerItem(MRCRAYFISH);
    }
}
