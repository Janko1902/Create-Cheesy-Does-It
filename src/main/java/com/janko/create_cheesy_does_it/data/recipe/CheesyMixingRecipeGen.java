package com.janko.create_cheesy_does_it.data.recipe;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.item.CheesyItems;
import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class CheesyMixingRecipeGen extends MixingRecipeGen {
    public CheesyMixingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCheesyDoesIt.MOD_ID);
    }

    GeneratedRecipe

    COAGULATED_BLACK_AND_BLUE_STRIDER_MILK = create(CheesyItems.COAGULATED_BLACK_AND_BLUE_STRIDER_MILK::get, b -> b.require(CheesyItems.RENNET_BOTTLE)
            .require(CheesyItems.PENICILLIUM_CAMEMBERTI)
            .require(CheesyItems.STRIDER_MILK_BUCKET)
            .require(CheesyItems.MUCOREM_NUGRUM)
            .output(CheesyItems.COAGULATED_BLACK_AND_BLUE_STRIDER_MILK)
            .requiresHeat(HeatCondition.HEATED)),

    COAGULATED_STRIDER_MILK = create(CheesyItems.COAGULATED_STRIDER_MILK::get, b -> b.require(CheesyItems.RENNET_BOTTLE)
            .require(CheesyItems.STRIDER_MILK_BUCKET)
            .output(CheesyItems.COAGULATED_STRIDER_MILK)
            .requiresHeat(HeatCondition.HEATED)),

    COAGULATED_JACK_MIX = create(CheesyItems.COAGULATED_JACK_MIX::get, b -> b.require(Items.ORANGE_DYE)
            .require(CheesyItems.ORANGE_COW_CHEESE_CURDS)
            .require(CheesyItems.COW_CHEESE_CURDS)
            .require(Fluids.WATER, 250)
            .output(CheesyItems.COAGULATED_JACK_MIX, 2)),

    MOLTEN_SHEEP_CHEESE_CURDS = create(CheesyItems.MOLTEN_SHEEP_CHEESE_CURDS::get, b -> b.require(CheesyItems.SHEEP_CHEESE_CURDS)
            .require(Fluids.WATER, 250)
            .output(CheesyItems.MOLTEN_SHEEP_CHEESE_CURDS)
            .requiresHeat(HeatCondition.HEATED)),

    LA_VACHE_QUI_RIT_WHEEL = create(CheesyItems.LA_VACHE_QUI_RIT_WHEEL::get, b -> b.require(CheesyItems.EMMENTALER)
            .require(CheesyItems.COMTE)
            .require(CheesyItems.CREAM)
            .require(CheesyItems.GOUDA)
            .require(CheesyItems.FROMAGE_FRAIS)
            .output(CheesyItems.LA_VACHE_QUI_RIT_WHEEL)
            .requiresHeat(HeatCondition.HEATED)),

    ACTIVATED_COAGULATED_ORANGE_COW_MILK = create(CheesyItems.ACTIVATED_COAGULATED_ORANGE_COW_MILK::get, b -> b.require(CheesyItems.YOGURT)
            .require(Tags.Fluids.MILK, 250)
            .require(CheesyItems.RENNET_BOTTLE)
            .require(CheesyItems.ANNATO)
            .output(CheesyItems.ACTIVATED_COAGULATED_ORANGE_COW_MILK, 4)
            .requiresHeat(HeatCondition.HEATED)),

    COAGULATED_BLACK_STRIDER_MILK = create(CheesyItems.COAGULATED_BLACK_STRIDER_MILK::get, b -> b.require(CheesyItems.RENNET_BOTTLE)
            .require(CheesyItems.STRIDER_MILK_BUCKET)
            .require(CheesyItems.MUCOREM_NUGRUM)
            .output(CheesyItems.COAGULATED_BLACK_STRIDER_MILK, 4)),

    COAGULATED_ORANGE_COW_MILK = create(CheesyItems.COAGULATED_ORANGE_COW_MILK::get, b -> b.require(CheesyItems.ANNATO)
            .require(Tags.Fluids.MILK, 1000)
            .require(CheesyItems.RENNET_BOTTLE)
            .output(CheesyItems.COAGULATED_ORANGE_COW_MILK, 4)),

    COAGULATED_BLUE_SHEEP_MILK = create(CheesyItems.COAGULATED_BLUE_SHEEP_MILK::get, b -> b.require(CheesyItems.PENICILLIUM_RIQUEFORTI)
            .require(CheesyItems.SHEEP_MILK_BUCKET)
            .require(CheesyItems.RENNET_BOTTLE)
            .output(CheesyItems.COAGULATED_BLUE_SHEEP_MILK, 4)),

    COAGULATED_CREAMY_COW_MILK = create(CheesyItems.COAGULATED_CREAMY_COW_MILK::get, b -> b.require(CheesyItems.CREAM)
            .require(Tags.Fluids.MILK, 1000)
            .require(CheesyItems.RENNET_BOTTLE)
            .output(CheesyItems.COAGULATED_CREAMY_COW_MILK, 4));

}
