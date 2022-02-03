package com.danikvitek.rocketboots.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

class RocketBootsItem extends ArmorItem {
    public RocketBootsItem() {
        super(
                ArmorMaterials.IRON, EquipmentSlot.FEET,
                new FabricItemSettings()
                        .group(ItemGroup.TRANSPORTATION)
                        .rarity(Rarity.UNCOMMON)
        );
    }
}
