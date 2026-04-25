package com.janko.create_cheesy_does_it.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class EnchantedGoldenCheeseItem extends Item {
    public EnchantedGoldenCheeseItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
