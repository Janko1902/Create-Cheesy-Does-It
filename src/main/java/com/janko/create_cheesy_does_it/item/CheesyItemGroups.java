package com.janko.create_cheesy_does_it.item;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.block.CheesyBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CheesyItemGroups {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateCheesyDoesIt.MOD_ID);

    public static final Supplier<CreativeModeTab> CHEESY_ITEM_GROUP = CREATIVE_MODE_TABS.register("cheese",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(CheesyItems.GOLDEN_CHEESE.get()))
                    .title(Component.translatable("itemGroup." + CreateCheesyDoesIt.MOD_ID))
                    .displayItems((params, entries) -> {
                        entries.accept(CheesyItems.GEOTRICHUM_CANDIDUM.get());
                        entries.accept(CheesyItems.MUCOR_LANCEOLATUS.get());
                        entries.accept(CheesyItems.MUCOREM_NUGRUM.get());
                        entries.accept(CheesyItems.PENICILLIUM_CAMEMBERTI.get());
                        entries.accept(CheesyItems.PENICILLIUM_RIQUEFORTI.get());

                        entries.accept(CheesyItems.BUFFALO_MILK_BOTTLE.get());
                        entries.accept(CheesyItems.COW_MILK_BOTTLE.get());
                        entries.accept(CheesyItems.GOAT_MILK_BOTTLE.get());
                        entries.accept(CheesyItems.STRIDER_MILK_BOTTLE.get());
                        entries.accept(CheesyItems.SHEEP_MILK_BOTTLE.get());
                        entries.accept(CheesyItems.YAK_MILK_BOTTLE.get());

                        entries.accept(CheesyItems.RENNET_BOTTLE.get());

                        entries.accept(CheesyItems.BUFFALO_MILK_BUCKET.get());
                        entries.accept(CheesyItems.GOAT_MILK_BUCKET.get());
                        entries.accept(CheesyItems.PASTEURISED_MILK_BUCKET.get());
                        entries.accept(CheesyItems.SHEEP_MILK_BUCKET.get());
                        entries.accept(CheesyItems.STRIDER_MILK_BUCKET.get());
                        entries.accept(CheesyItems.YAK_MILK_BUCKET.get());

                        entries.accept(CheesyItems.BRINE_BUCKET.get());
                        entries.accept(CheesyItems.RENNET_BUCKET.get());
                        entries.accept(CheesyItems.WHEY_BUCKET.get());

                        entries.accept(CheesyItems.ACTIVATED_ORANGE_COW_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.BLACK_AND_BLUE_STRIDER_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.BLACK_STRIDER_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.BLUE_COW_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.BLUE_SHEEP_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.BLACK_STRIDER_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.BRINED_BLACK_AND_BLUE_STRIDER_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.BRINED_BLUE_SHEEP_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.BRINED_ORANGE_COW_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.BUFFALO_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.BRINED_STRIDER_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.COW_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.CREAMY_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.GOAT_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.JACK_MIX_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.MOLTEN_SHEEP_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.ORANGE_COW_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.SHEEP_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.STRIDER_CHEESE_CURDS.get());
                        entries.accept(CheesyItems.YAK_CHEESE_CURDS.get());

                        entries.accept(CheesyItems.WHEY_CURDS.get());

                        entries.accept(CheesyItems.ACTIVATED_COAGULATED_ORANGE_COW_MILK.get());
                        entries.accept(CheesyItems.COAGULATED_BLACK_AND_BLUE_STRIDER_MILK.get());
                        entries.accept(CheesyItems.COAGULATED_BLACK_STRIDER_MILK.get());
                        entries.accept(CheesyItems.COAGULATED_BLUE_COW_MILK.get());
                        entries.accept(CheesyItems.COAGULATED_BLUE_SHEEP_MILK.get());
                        entries.accept(CheesyItems.COAGULATED_BUFFALO_MILK.get());
                        entries.accept(CheesyItems.COAGULATED_COW_MILK.get());
                        entries.accept(CheesyItems.COAGULATED_CREAMY_COW_MILK.get());
                        entries.accept(CheesyItems.COAGULATED_GOAT_MILK.get());
                        entries.accept(CheesyItems.COAGULATED_ORANGE_COW_MILK.get());
                        entries.accept(CheesyItems.COAGULATED_SHEEP_MILK.get());
                        entries.accept(CheesyItems.COAGULATED_STRIDER_MILK.get());
                        entries.accept(CheesyItems.COAGULATED_YAK_MILK.get());

                        entries.accept(CheesyItems.COAGULATED_JACK_MIX.get());

                        entries.accept(CheesyItems.ACTIVATED_ORANGE_COW_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.BLACK_AND_BLUE_STRIDER_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.BLACK_STRIDER_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.BLUE_COW_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.BLUE_SHEEP_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.BRINEWASHED_COW_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.BUFFALO_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.COW_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.COW_CHEESE_WHEEL_MUCOR_LANCEOLATUS.get());
                        entries.accept(CheesyItems.CREAMY_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.DYED_BRINEWASHED_COW_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.FERMENTED_BRINEWASHED_COW_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.FETA_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.GLOW_INKED_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.GOAT_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.GOAT_CHEESE_WHEEL_GEOTRICHUM_CANDIDUM.get());
                        entries.accept(CheesyItems.INFESTED_SHEEP_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.JACK_MIX_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.LA_VACHE_QUI_RIT_WHEEL.get());
                        entries.accept(CheesyItems.MESOPHILIC_BRINEWASHED_COW_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.ORANGE_COW_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.SALTED_BRINEWASHED_COW_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.SHEEP_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.SOFT_CURD_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.STRIDER_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.STRIDER_CHEESE_WHEEL_RIPE.get());
                        entries.accept(CheesyItems.WAXED_COW_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.WAXED_SHEEP_CHEESE_WHEEL.get());
                        entries.accept(CheesyItems.YAK_CHEESE_WHEEL.get());

                        entries.accept(CheesyItems.BABYBEL.get());
                        entries.accept(CheesyItems.BLACK_MOLD_CHEESE.get());
                        entries.accept(CheesyItems.BRIE.get());
                        entries.accept(CheesyItems.BUFFALO_CHEESE.get());
                        entries.accept(CheesyItems.BURRATA.get());
                        entries.accept(CheesyItems.CABRALES.get());
                        entries.accept(CheesyItems.CAMEMBERT.get());
                        entries.accept(CheesyItems.CASU_MARZU.get());
                        entries.accept(CheesyItems.CECIL.get());
                        entries.accept(CheesyItems.CHEDDAR.get());
                        entries.accept(CheesyItems.CHESHIRE.get());
                        entries.accept(CheesyItems.COLBY_JACK.get());
                        entries.accept(CheesyItems.COMTE.get());
                        entries.accept(CheesyItems.COW_CHEESE.get());
                        entries.accept(CheesyItems.CREAMY_CHEESE_BALLS.get());
                        entries.accept(CheesyItems.CRIMSON_CHEESE.get());
                        entries.accept(CheesyItems.CROTTIN_DE_CHAVIGNOL.get());
                        entries.accept(CheesyItems.EDAM.get());
                        entries.accept(CheesyItems.EMMENTALER.get());
                        entries.accept(CheesyItems.ENCHANTED_GOLDEN_CHEESE.get());
                        entries.accept(CheesyItems.EPOISSES_DE_BOURGOGNE.get());
                        entries.accept(CheesyItems.FETA.get());
                        entries.accept(CheesyItems.FROMAGE_FRAIS.get());
                        entries.accept(CheesyItems.GLOW_CHEESE.get());
                        entries.accept(CheesyItems.GOAT_CHEESE.get());
                        entries.accept(CheesyItems.GORGONZOLA.get());
                        entries.accept(CheesyItems.GOUDA.get());
                        entries.accept(CheesyItems.GRANA_PADANO.get());
                        entries.accept(CheesyItems.GRIMCHEESE.get());
                        entries.accept(CheesyItems.GOLDEN_CHEESE.get());
                        entries.accept(CheesyItems.GRUYERE.get());
                        entries.accept(CheesyItems.LA_VACHE_QUI_RIT.get());
                        entries.accept(CheesyItems.LOADED_GOAT_SKIN.get());
                        entries.accept(CheesyItems.MANCHEGO.get());
                        entries.accept(CheesyItems.MAROILLES.get());
                        entries.accept(CheesyItems.MASCARPONE.get());
                        entries.accept(CheesyItems.MIMOLETTE.get());
                        entries.accept(CheesyItems.MOZZARELLA.get());
                        entries.accept(CheesyItems.MUNSTER.get());
                        entries.accept(CheesyItems.PARMIGIANO_REGGIANO.get());
                        entries.accept(CheesyItems.PASTA_FILATA.get());
                        entries.accept(CheesyItems.PASTA_FILATA_BALL.get());
                        entries.accept(CheesyItems.PECORINO_ROMANO.get());
                        entries.accept(CheesyItems.PROVOLONE.get());
                        entries.accept(CheesyItems.RACLETTE.get());
                        entries.accept(CheesyItems.REBLOCHON.get());
                        entries.accept(CheesyItems.RICOTTA.get());
                        entries.accept(CheesyItems.ROPETIED_PASTA_FILATA.get());
                        entries.accept(CheesyItems.ROQUEFORT.get());
                        entries.accept(CheesyItems.SHEEP_CHEESE.get());
                        entries.accept(CheesyItems.SHROOMY_CHEESE.get());
                        entries.accept(CheesyItems.STILTON.get());
                        entries.accept(CheesyItems.STRIDER_CHEESE.get());
                        entries.accept(CheesyItems.SWISS.get());
                        entries.accept(CheesyItems.TALEGGIO.get());
                        entries.accept(CheesyItems.THREADED_SHEEP_CHEESE.get());
                        entries.accept(CheesyItems.TOMME_DE_SAVOIE.get());
                        entries.accept(CheesyItems.TULUK.get());
                        entries.accept(CheesyItems.WARPED_CHEESE.get());
                        entries.accept(CheesyItems.YAK_CHEESE.get());

                        entries.accept(CheesyItems.CHEDDAR_SHEET.get());
                        entries.accept(CheesyItems.WRAPPED_CHEDDAR_SHEET.get());
                        entries.accept(CheesyItems.RAW_CHEDDAR.get());

                        entries.accept(CheesyItems.ANNATO.get());
                        entries.accept(CheesyItems.CREAM.get());
                        entries.accept(CheesyItems.RENNET_GLAND.get());
                        entries.accept(CheesyItems.SALT.get());
                        entries.accept(CheesyItems.THISTLE.get());
                        entries.accept(CheesyItems.YOGURT.get());

                        entries.accept(CheesyBlocks.CHEDDAR_BLOCK.get());
                        entries.accept(CheesyBlocks.CHEDDAR_ORE.get());
                        entries.accept(CheesyBlocks.DEEPSLATE_CHEDDAR_ORE.get());

                        entries.accept(CheesyBlocks.SWISS_BLOCK.get());
                    })
                    .build());

    public static void registerCheesyItemGroups(IEventBus modEventBus) {
        CreateCheesyDoesIt.LOGGER.info("Registering item groups for " + CreateCheesyDoesIt.MOD_NAME);
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
