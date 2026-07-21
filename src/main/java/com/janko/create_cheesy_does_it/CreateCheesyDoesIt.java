package com.janko.create_cheesy_does_it;

import com.janko.create_cheesy_does_it.block.CheesyBlocks;
import com.janko.create_cheesy_does_it.item.CheesyItemGroups;
import com.janko.create_cheesy_does_it.item.CheesyItems;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(CreateCheesyDoesIt.MOD_ID)
public class CreateCheesyDoesIt {
    public static final String MOD_NAME = "Create: Cheesy Does It";
    public static final String MOD_ID = "cheesy_create";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateCheesyDoesIt(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        CheesyItems.registerCheesyItems(modEventBus);
        CheesyItemGroups.registerCheesyItemGroups(modEventBus);
        CheesyBlocks.registerCheesyBlocks(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
