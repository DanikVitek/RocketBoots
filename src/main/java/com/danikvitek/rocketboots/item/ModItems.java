package com.danikvitek.rocketboots.item;

import com.danikvitek.rocketboots.RocketBoots;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final RocketBootsItem ROCKET_BOOTS = registerItem("rocket_boots", new RocketBootsItem());

    private static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registry.ITEM, new Identifier(RocketBoots.MOD_ID, name), item);
    }

    public static void registerItems() {
        RocketBoots.LOGGER.info("Registering mod items for " + RocketBoots.MOD_ID);
    }
}
