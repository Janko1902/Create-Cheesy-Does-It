package com.janko.create_cheesy_does_it;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(CreateCheesyDoesIt.MOD_ID)
public class CreateCheesyDoesIt {
    public static final String MOD_ID = "cheesy_create";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation ID(String path) {
        return new ResourceLocation(MOD_ID,path);
    }

    public CreateCheesyDoesIt() {

    }
}
