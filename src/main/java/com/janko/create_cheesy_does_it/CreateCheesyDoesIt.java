package com.janko.create_cheesy_does_it;

import com.janko.create_cheesy_does_it.block.CheesyBlocks;
import com.janko.create_cheesy_does_it.creative.CheesyCreativeSections;
import com.janko.create_cheesy_does_it.item.CheesyItemGroups;
import com.janko.create_cheesy_does_it.item.CheesyItems;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CreateCheesyDoesIt.MOD_ID)
public class CreateCheesyDoesIt {
    public static final String MOD_NAME = "Create: Cheese Does It";
    public static final String MOD_ID = "cheesy_create";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation ID(String path) {
        return new ResourceLocation(MOD_ID,path);
    }

    public CreateCheesyDoesIt() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CheesyItems.registerCheesyItems(modEventBus);
        CheesyItemGroups.registerCheesyItemGroups(modEventBus);
        CheesyBlocks.registerCheesyBlocks(modEventBus);

    }
}
