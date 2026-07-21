package com.janko.create_cheesy_does_it.data.recipe;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.helper.CheesyHelpers;
import com.janko.create_cheesy_does_it.item.CheesyItems;
import com.simibubi.create.api.data.recipe.CompactingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class CheesyCompactingRecipeGen extends CompactingRecipeGen {
    public CheesyCompactingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCheesyDoesIt.MOD_ID);
    }

    GeneratedRecipe

    BLACK_AND_BLUE_STRIDER_CHEESE_WHEEL = create(CheesyItems.BLACK_AND_BLUE_STRIDER_CHEESE_WHEEL.getId(), b -> {
        CheesyHelpers.repeat(12, item -> b.require(item), CheesyItems.BRINED_BLACK_AND_BLUE_STRIDER_CHEESE_CURDS.get());
        b.output(CheesyItems.BLACK_AND_BLUE_STRIDER_CHEESE_WHEEL);
        return b;
    }),

    STRIDER_CHEESE_WHEEL = create(CheesyItems.STRIDER_CHEESE_WHEEL.getId(), b -> {
        CheesyHelpers.repeat(12, item -> b.require(item), CheesyItems.BRINED_STRIDER_CHEESE_CURDS.get());
        b.output(CheesyItems.STRIDER_CHEESE_WHEEL);
        return b;
    }),

    JACK_MIX_CHEESE_WHEEL = create(CheesyItems.JACK_MIX_CHEESE_WHEEL.getId(), b -> {
        CheesyHelpers.repeat(12, item -> b.require(item), CheesyItems.JACK_MIX_CHEESE_CURDS.get());
        b.output(CheesyItems.JACK_MIX_CHEESE_WHEEL);
        return b;
    }),

    ACTIVATED_ORANGE_COW_CHEESE_WHEEL = create(CheesyItems.ACTIVATED_ORANGE_COW_CHEESE_WHEEL.getId(), b -> {
        CheesyHelpers.repeat(12, item -> b.require(item), CheesyItems.ACTIVATED_ORANGE_COW_CHEESE_CURDS.get());
        b.output(CheesyItems.ACTIVATED_ORANGE_COW_CHEESE_WHEEL);
        return b;
    }),

    BLACK_STRIDER_CHEESE_WHEEL = create(CheesyItems.BLACK_STRIDER_CHEESE_WHEEL.getId(), b -> {
        CheesyHelpers.repeat(12, item -> b.require(item), CheesyItems.BRINED_BLACK_STRIDER_CHEESE_CURDS.get());
        b.output(CheesyItems.BLACK_STRIDER_CHEESE_WHEEL);
        return b;
    }),

    ORANGE_COW_CHEESE_WHEEL = create(CheesyItems.ORANGE_COW_CHEESE_WHEEL.getId(), b -> {
        CheesyHelpers.repeat(12, item -> b.require(item), CheesyItems.BRINED_ORANGE_COW_CHEESE_CURDS.get());
        b.output(CheesyItems.ORANGE_COW_CHEESE_WHEEL);
        return b;
    }),

    BLUE_SHEEP_CHEESE_WHEEL = create(CheesyItems.BLUE_SHEEP_CHEESE_WHEEL.getId(), b -> {
        CheesyHelpers.repeat(12, item -> b.require(item), CheesyItems.BRINED_BLUE_SHEEP_CHEESE_CURDS.get());
        b.output(CheesyItems.BLUE_SHEEP_CHEESE_WHEEL);
        return b;
    }),

    PASTA_FILATA_BALL = create(CheesyItems.PASTA_FILATA_BALL.getId(), b -> {
        CheesyHelpers.repeat(12, item -> b.require(item), CheesyItems.PASTA_FILATA.get());
        b.output(CheesyItems.PASTA_FILATA_BALL);
        return b;
    }),

    CREAMY_CHEESE_WHEEL = create(CheesyItems.CREAMY_CHEESE_WHEEL.getId(), b -> {
        CheesyHelpers.repeat(12, item -> b.require(item), CheesyItems.CREAMY_CHEESE_CURDS.get());
        b.output(CheesyItems.CREAMY_CHEESE_WHEEL);
        return b;
    });
}
