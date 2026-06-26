package com.janko.create_cheesy_does_it.block;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.item.CheesyItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.janko.create_cheesy_does_it.CreateCheesyDoesIt.MOD_ID;

public class CheesyBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    public static final DeferredBlock<Block> CHEDDAR_BLOCK = registerBlock("cheddar_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));
    public static final DeferredBlock<Block> CHEDDAR_ORE = registerBlock("cheddar_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE)));
    public static final DeferredBlock<Block> DEEPSLATE_CHEDDAR_ORE = registerBlock("deepslate_cheddar_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final DeferredBlock<Block> SWISS_BLOCK = registerBlock("swiss_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        CheesyItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void registerCheesyBlocks(IEventBus eventBus) {
        CreateCheesyDoesIt.LOGGER.info("Registering blocks for " + CreateCheesyDoesIt.MOD_NAME);
        BLOCKS.register(eventBus);
    }
}
