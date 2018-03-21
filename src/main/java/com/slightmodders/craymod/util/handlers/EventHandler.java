package com.slightmodders.craymod.util.handlers;

import net.minecraftforge.event.entity.player.PlayerContainerEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EventHandler {

    @SubscribeEvent
    public static void onInventoryOpen(PlayerContainerEvent event){

        event.setCanceled(true);

    }

}
