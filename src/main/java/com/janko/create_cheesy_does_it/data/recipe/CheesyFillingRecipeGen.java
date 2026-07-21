package com.janko.create_cheesy_does_it.data.recipe;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.simibubi.create.api.data.recipe.FillingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class CheesyFillingRecipeGen extends FillingRecipeGen {
    public CheesyFillingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateCheesyDoesIt.MOD_ID);
    }
}
