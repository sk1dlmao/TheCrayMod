package techyydata.tcm.handlers;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import techyydata.tcm.Reference;
import net.minecraftforge.common.config.Configuration;

import java.io.File;


public class ConfigurationHandler {
    private static final String CATEGORY_GENERAL = "general";
    private static boolean debugConfig = false;

    private static Configuration config;

    public static void load(File file) {
        config = new Configuration(file);
        init();
    }

    private static void init() {
        debugConfig = config.get(CATEGORY_GENERAL, "debugConfig", false, "Just a debug value, it does nothing.").getBoolean();

        config.save();
    }

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.getModID().equals(Reference.MOD_ID)) {
            init();
        }
    }
}
