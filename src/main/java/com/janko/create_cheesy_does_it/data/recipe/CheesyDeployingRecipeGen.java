package com.janko.create_cheesy_does_it.data.recipe;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.item.CheesyItems;
import com.simibubi.create.api.data.recipe.DeployingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class CheesyDeployingRecipeGen extends DeployingRecipeGen {
    public CheesyDeployingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCheesyDoesIt.MOD_ID);
    }

    GeneratedRecipe

    GLOW_INKED_CHEESE_WHEEL = create(CheesyItems.GLOW_INKED_CHEESE_WHEEL::get, b -> b.require(CheesyItems.BLUE_COW_CHEESE_WHEEL)
            .require(Items.GLOW_INK_SAC)
            .output(CheesyItems.GLOW_INKED_CHEESE_WHEEL)),

    INFESTED_SHEEP_CHEESE_WHEEL = create(CheesyItems.INFESTED_SHEEP_CHEESE_WHEEL::get, b -> b.require(CheesyItems.SHEEP_CHEESE_WHEEL)
            .require(Items.FERMENTED_SPIDER_EYE)
            .output(CheesyItems.INFESTED_SHEEP_CHEESE_WHEEL)),

    BABYBEL = create(CheesyItems.BABYBEL::get, b -> b.require(CheesyItems.CREAMY_CHEESE_BALLS)
            .require(Items.HONEYCOMB)
            .output(CheesyItems.BABYBEL)),

    SALTED_BRINEWASHED_COW_CHEESE_WHEEL = create(CheesyItems.SALTED_BRINEWASHED_COW_CHEESE_WHEEL::get, b -> b.require(CheesyItems.BRINEWASHED_COW_CHEESE_WHEEL)
            .require(CheesyItems.SALT)
            .output(CheesyItems.SALTED_BRINEWASHED_COW_CHEESE_WHEEL)),

    GOAT_CHEESE_WHEEL_GEOTRICHUM_CANDIDUM = create(CheesyItems.GOAT_CHEESE_WHEEL_GEOTRICHUM_CANDIDUM::get, b -> b.require(CheesyItems.GOAT_CHEESE_WHEEL)
            .require(CheesyItems.GEOTRICHUM_CANDIDUM)
            .output(CheesyItems.GOAT_CHEESE_WHEEL_GEOTRICHUM_CANDIDUM)),

    COW_CHEESE_WHEEL_MUCOR_LANCEOLATUS = create(CheesyItems.COW_CHEESE_WHEEL_MUCOR_LANCEOLATUS::get, b -> b.require(CheesyItems.COW_CHEESE_WHEEL)
            .require(CheesyItems.MUCOR_LANCEOLATUS)
            .output(CheesyItems.COW_CHEESE_WHEEL_MUCOR_LANCEOLATUS)),

    WAXED_COW_CHEESE_WHEEL = create(CheesyItems.WAXED_COW_CHEESE_WHEEL::get, b -> b.require(CheesyItems.COW_CHEESE_WHEEL)
            .require(Items.HONEYCOMB)
            .output(CheesyItems.WAXED_COW_CHEESE_WHEEL)),

    WAXED_SHEEP_CHEESE_WHEEL = create(CheesyItems.WAXED_SHEEP_CHEESE_WHEEL::get, b -> b.require(CheesyItems.SHEEP_CHEESE_WHEEL)
            .require(Items.HONEYCOMB)
            .output(CheesyItems.WAXED_SHEEP_CHEESE_WHEEL)),

    ROPETIED_PASTA_FILATA = create(CheesyItems.ROPETIED_PASTA_FILATA::get, b -> b.require(CheesyItems.PASTA_FILATA_BALL)
            .require(Items.STRING)
            .output(CheesyItems.ROPETIED_PASTA_FILATA));
}
