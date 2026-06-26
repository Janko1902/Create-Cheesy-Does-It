package com.janko.create_cheesy_does_it.data;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.block.CheesyBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class CheesyBlockStateProvider extends BlockStateProvider {
    public CheesyBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateCheesyDoesIt.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(CheesyBlocks.CHEDDAR_BLOCK);
        blockWithItem(CheesyBlocks.CHEDDAR_ORE);
        blockWithItem(CheesyBlocks.DEEPSLATE_CHEDDAR_ORE);
        blockWithItem(CheesyBlocks.SWISS_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
