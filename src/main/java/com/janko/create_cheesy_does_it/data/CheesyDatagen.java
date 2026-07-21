package com.janko.create_cheesy_does_it.data;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.data.recipe.CheesyRecipeProvider;
import com.janko.create_cheesy_does_it.data.recipe.CheesyStandardRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = CreateCheesyDoesIt.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class CheesyDatagen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new CheesyItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new CheesyBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new CheesyLangProvider(packOutput, "en_us"));

        generator.addProvider(event.includeServer(), new CheesyStandardRecipeGen(packOutput, lookupProvider));
        if (event.includeServer()) {
            CheesyRecipeProvider.registerAllProcessing(generator, packOutput, lookupProvider);
        }

    }
}
