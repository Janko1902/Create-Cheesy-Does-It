package com.janko.create_cheesy_does_it.data;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.block.CheesyBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class CheesyBlockStateProvider extends BlockStateProvider {
    public CheesyBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CreateCheesyDoesIt.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(CheesyBlocks.CHEDDAR_BLOCK);
        blockWithItem(CheesyBlocks.CHEDDAR_ORE);
        blockWithItem(CheesyBlocks.DEEPSLATE_CHEDDAR_ORE);
        blockWithItem(CheesyBlocks.SWISS_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
