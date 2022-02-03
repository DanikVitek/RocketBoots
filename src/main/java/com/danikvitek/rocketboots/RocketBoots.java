package com.danikvitek.rocketboots;

import com.danikvitek.rocketboots.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RocketBoots implements ModInitializer {
    public static final String MOD_ID = "rocket-boots";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing RocketBoots");
        ModItems.registerItems();
    }
}
