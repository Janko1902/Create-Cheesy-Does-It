package com.janko.create_cheesy_does_it.helper;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;

public class CheesyHelpers {
    public static FoodProperties food(int nutrition, float saturationMod) {
        return new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationMod(saturationMod)
                .build();
    }

    public static FoodProperties food(int nutrition, float saturationMod, boolean isFastFood) {
        return new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationMod(saturationMod)
                .fast()
                .build();
    }

    public static FoodProperties food(int nutrition, float saturationMod, MobEffectInstance effect, float probability) {
        return new FoodProperties.Builder()
                .nutrition(nutrition)
                .saturationMod(saturationMod)
                .effect(() -> effect, probability)
                .build();
    }
}
