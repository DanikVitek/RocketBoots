package com.danikvitek.rocketboots.client;

import com.danikvitek.rocketboots.RocketBoots;
import net.fabricmc.api.ClientModInitializer;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class RocketBootsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        RocketBoots.LOGGER.info("Client initialized");
    }
}
