package com.janko.create_cheesy_does_it.data;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.item.CheesyItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class CheesyItemModelProvider extends ItemModelProvider {
    public CheesyItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateCheesyDoesIt.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(CheesyItems.GEOTRICHUM_CANDIDUM.get());
        basicItem(CheesyItems.MUCOR_LANCEOLATUS.get());
        basicItem(CheesyItems.MUCOREM_NUGRUM.get());
        basicItem(CheesyItems.PENICILLIUM_CAMEMBERTI.get());
        basicItem(CheesyItems.PENICILLIUM_RIQUEFORTI.get());

        basicItem(CheesyItems.BUFFALO_MILK_BOTTLE.get());
        basicItem(CheesyItems.COW_MILK_BOTTLE.get());
        basicItem(CheesyItems.GOAT_MILK_BOTTLE.get());
        basicItem(CheesyItems.STRIDER_MILK_BOTTLE.get());
        basicItem(CheesyItems.SHEEP_MILK_BOTTLE.get());
        basicItem(CheesyItems.YAK_MILK_BOTTLE.get());

        basicItem(CheesyItems.RENNET_BOTTLE.get());

        basicItem(CheesyItems.BUFFALO_MILK_BUCKET.get());
        basicItem(CheesyItems.GOAT_MILK_BUCKET.get());
        basicItem(CheesyItems.PASTEURISED_MILK_BUCKET.get());
        basicItem(CheesyItems.SHEEP_MILK_BUCKET.get());
        basicItem(CheesyItems.STRIDER_MILK_BUCKET.get());
        basicItem(CheesyItems.YAK_MILK_BUCKET.get());

        basicItem(CheesyItems.BRINE_BUCKET.get());
        basicItem(CheesyItems.RENNET_BUCKET.get());
        basicItem(CheesyItems.WHEY_BUCKET.get());

        basicItem(CheesyItems.ACTIVATED_ORANGE_COW_CHEESE_CURDS.get());
        basicItem(CheesyItems.BLACK_AND_BLUE_STRIDER_CHEESE_CURDS.get());
        basicItem(CheesyItems.BLACK_STRIDER_CHEESE_CURDS.get());
        basicItem(CheesyItems.BLUE_COW_CHEESE_CURDS.get());
        basicItem(CheesyItems.BLUE_SHEEP_CHEESE_CURDS.get());
        basicItem(CheesyItems.BRINED_BLACK_AND_BLUE_STRIDER_CHEESE_CURDS.get());
        basicItem(CheesyItems.BRINED_BLACK_STRIDER_CHEESE_CURDS.get());
        basicItem(CheesyItems.BRINED_BLUE_SHEEP_CHEESE_CURDS.get());
        basicItem(CheesyItems.BRINED_ORANGE_COW_CHEESE_CURDS.get());
        basicItem(CheesyItems.BRINED_STRIDER_CHEESE_CURDS.get());
        basicItem(CheesyItems.BUFFALO_CHEESE_CURDS.get());
        basicItem(CheesyItems.COW_CHEESE_CURDS.get());
        basicItem(CheesyItems.CREAMY_CHEESE_CURDS.get());
        basicItem(CheesyItems.GOAT_CHEESE_CURDS.get());
        basicItem(CheesyItems.JACK_MIX_CHEESE_CURDS.get());
        basicItem(CheesyItems.MOLTEN_SHEEP_CHEESE_CURDS.get());
        basicItem(CheesyItems.ORANGE_COW_CHEESE_CURDS.get());
        basicItem(CheesyItems.SHEEP_CHEESE_CURDS.get());
        basicItem(CheesyItems.STRIDER_CHEESE_CURDS.get());
        basicItem(CheesyItems.YAK_CHEESE_CURDS.get());

        basicItem(CheesyItems.WHEY_CURDS.get());

        basicItem(CheesyItems.ACTIVATED_COAGULATED_ORANGE_COW_MILK.get());
        basicItem(CheesyItems.COAGULATED_BLACK_AND_BLUE_STRIDER_MILK.get());
        basicItem(CheesyItems.COAGULATED_BLACK_STRIDER_MILK.get());
        basicItem(CheesyItems.COAGULATED_BLUE_COW_MILK.get());
        basicItem(CheesyItems.COAGULATED_BLUE_SHEEP_MILK.get());
        basicItem(CheesyItems.COAGULATED_BUFFALO_MILK.get());
        basicItem(CheesyItems.COAGULATED_COW_MILK.get());
        basicItem(CheesyItems.COAGULATED_CREAMY_COW_MILK.get());
        basicItem(CheesyItems.COAGULATED_GOAT_MILK.get());
        basicItem(CheesyItems.COAGULATED_ORANGE_COW_MILK.get());
        basicItem(CheesyItems.COAGULATED_SHEEP_MILK.get());
        basicItem(CheesyItems.COAGULATED_STRIDER_MILK.get());
        basicItem(CheesyItems.COAGULATED_YAK_MILK.get());

        basicItem(CheesyItems.COAGULATED_JACK_MIX.get());

        basicItem(CheesyItems.ACTIVATED_ORANGE_COW_CHEESE_WHEEL.get());
        basicItem(CheesyItems.BLACK_AND_BLUE_STRIDER_CHEESE_WHEEL.get());
        basicItem(CheesyItems.BLACK_STRIDER_CHEESE_WHEEL.get());
        basicItem(CheesyItems.BLUE_COW_CHEESE_WHEEL.get());
        basicItem(CheesyItems.BLUE_SHEEP_CHEESE_WHEEL.get());
        basicItem(CheesyItems.BRINEWASHED_COW_CHEESE_WHEEL.get());
        basicItem(CheesyItems.BUFFALO_CHEESE_WHEEL.get());
        basicItem(CheesyItems.COW_CHEESE_WHEEL.get());
        basicItem(CheesyItems.COW_CHEESE_WHEEL_MUCOR_LANCEOLATUS.get());
        basicItem(CheesyItems.CREAMY_CHEESE_WHEEL.get());
        basicItem(CheesyItems.DYED_BRINEWASHED_COW_CHEESE_WHEEL.get());
        basicItem(CheesyItems.FERMENTED_BRINEWASHED_COW_CHEESE_WHEEL.get());
        basicItem(CheesyItems.FETA_CHEESE_WHEEL.get());
        basicItem(CheesyItems.GLOW_INKED_CHEESE_WHEEL.get());
        basicItem(CheesyItems.GOAT_CHEESE_WHEEL.get());
        basicItem(CheesyItems.GOAT_CHEESE_WHEEL_GEOTRICHUM_CANDIDUM.get());
        basicItem(CheesyItems.INFESTED_SHEEP_CHEESE_WHEEL.get());
        basicItem(CheesyItems.JACK_MIX_CHEESE_WHEEL.get());
        basicItem(CheesyItems.LA_VACHE_QUI_RIT_WHEEL.get());
        basicItem(CheesyItems.MESOPHILIC_BRINEWASHED_COW_CHEESE_WHEEL.get());
        basicItem(CheesyItems.ORANGE_COW_CHEESE_WHEEL.get());
        basicItem(CheesyItems.SALTED_BRINEWASHED_COW_CHEESE_WHEEL.get());
        basicItem(CheesyItems.SHEEP_CHEESE_WHEEL.get());
        basicItem(CheesyItems.SOFT_CURD_CHEESE_WHEEL.get());
        basicItem(CheesyItems.STRIDER_CHEESE_WHEEL.get());
        basicItem(CheesyItems.STRIDER_CHEESE_WHEEL_RIPE.get());
        basicItem(CheesyItems.WAXED_COW_CHEESE_WHEEL.get());
        basicItem(CheesyItems.WAXED_SHEEP_CHEESE_WHEEL.get());
        basicItem(CheesyItems.YAK_CHEESE_WHEEL.get());

        basicItem(CheesyItems.BABYBEL.get());
        basicItem(CheesyItems.BLACK_MOLD_CHEESE.get());
        basicItem(CheesyItems.BRIE.get());
        basicItem(CheesyItems.BUFFALO_CHEESE.get());
        basicItem(CheesyItems.BURRATA.get());
        basicItem(CheesyItems.CABRALES.get());
        basicItem(CheesyItems.CAMEMBERT.get());
        basicItem(CheesyItems.CASU_MARZU.get());
        basicItem(CheesyItems.CECIL.get());
        basicItem(CheesyItems.CHEDDAR.get());
        basicItem(CheesyItems.CHESHIRE.get());
        basicItem(CheesyItems.COLBY_JACK.get());
        basicItem(CheesyItems.COMTE.get());
        basicItem(CheesyItems.COW_CHEESE.get());
        basicItem(CheesyItems.CREAMY_CHEESE_BALLS.get());
        basicItem(CheesyItems.CRIMSON_CHEESE.get());
        basicItem(CheesyItems.CROTTIN_DE_CHAVIGNOL.get());
        basicItem(CheesyItems.EDAM.get());
        basicItem(CheesyItems.EMMENTALER.get());
        basicItem(CheesyItems.ENCHANTED_GOLDEN_CHEESE.get());
        basicItem(CheesyItems.EPOISSES_DE_BOURGOGNE.get());
        basicItem(CheesyItems.FETA.get());
        basicItem(CheesyItems.FROMAGE_FRAIS.get());
        basicItem(CheesyItems.GLOW_CHEESE.get());
        basicItem(CheesyItems.GOAT_CHEESE.get());
        basicItem(CheesyItems.GORGONZOLA.get());
        basicItem(CheesyItems.GOUDA.get());
        basicItem(CheesyItems.GRANA_PADANO.get());
        basicItem(CheesyItems.GRIMCHEESE.get());
        basicItem(CheesyItems.GOLDEN_CHEESE.get());
        basicItem(CheesyItems.GRUYERE.get());
        basicItem(CheesyItems.LA_VACHE_QUI_RIT.get());
        basicItem(CheesyItems.LOADED_GOAT_SKIN.get());
        basicItem(CheesyItems.MANCHEGO.get());
        basicItem(CheesyItems.MAROILLES.get());
        basicItem(CheesyItems.MASCARPONE.get());
        basicItem(CheesyItems.MIMOLETTE.get());
        basicItem(CheesyItems.MOZZARELLA.get());
        basicItem(CheesyItems.MUNSTER.get());
        basicItem(CheesyItems.PARMIGIANO_REGGIANO.get());
        basicItem(CheesyItems.PASTA_FILATA.get());
        basicItem(CheesyItems.PASTA_FILATA_BALL.get());
        basicItem(CheesyItems.PECORINO_ROMANO.get());
        basicItem(CheesyItems.PROVOLONE.get());
        basicItem(CheesyItems.RACLETTE.get());
        basicItem(CheesyItems.REBLOCHON.get());
        basicItem(CheesyItems.RICOTTA.get());
        basicItem(CheesyItems.ROPETIED_PASTA_FILATA.get());
        basicItem(CheesyItems.ROQUEFORT.get());
        basicItem(CheesyItems.SHEEP_CHEESE.get());
        basicItem(CheesyItems.SHROOMY_CHEESE.get());
        basicItem(CheesyItems.STILTON.get());
        basicItem(CheesyItems.STRIDER_CHEESE.get());
        basicItem(CheesyItems.SWISS.get());
        basicItem(CheesyItems.TALEGGIO.get());
        basicItem(CheesyItems.THREADED_SHEEP_CHEESE.get());
        basicItem(CheesyItems.TOMME_DE_SAVOIE.get());
        basicItem(CheesyItems.TULUK.get());
        basicItem(CheesyItems.WARPED_CHEESE.get());
        basicItem(CheesyItems.YAK_CHEESE.get());

        basicItem(CheesyItems.CHEDDAR_SHEET.get());
        basicItem(CheesyItems.WRAPPED_CHEDDAR_SHEET.get());
        basicItem(CheesyItems.RAW_CHEDDAR.get());

        basicItem(CheesyItems.ANNATO.get());
        basicItem(CheesyItems.CREAM.get());
        basicItem(CheesyItems.RENNET_GLAND.get());
        basicItem(CheesyItems.SALT.get());
        basicItem(CheesyItems.THISTLE.get());
        basicItem(CheesyItems.YOGURT.get());
    }
}
