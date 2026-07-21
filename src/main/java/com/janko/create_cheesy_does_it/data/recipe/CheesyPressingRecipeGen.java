package com.janko.create_cheesy_does_it.data.recipe;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.item.CheesyItems;
import com.simibubi.create.api.data.recipe.PressingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class CheesyPressingRecipeGen extends PressingRecipeGen {
    public CheesyPressingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCheesyDoesIt.MOD_ID);
    }

    GeneratedRecipe

    CHEDDAR_SHEET = create(CheesyItems.CHEDDAR_SHEET.getId(), b -> b.require(CheesyItems.CHEDDAR)
            .output(CheesyItems.CHEDDAR_SHEET));
}
