package com.janko.create_cheesy_does_it.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class EnchantedGoldenCheeseItem extends Item {
    public EnchantedGoldenCheeseItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
