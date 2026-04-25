package com.janko.create_cheesy_does_it.data;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.item.CheesyItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class CheesyItemModelProvider extends ItemModelProvider {
    public CheesyItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateCheesyDoesIt.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(CheesyItems.GEOTRICHUM_CANDIDUM);
        simpleItem(CheesyItems.MUCOR_LANCEOLATUS);
        simpleItem(CheesyItems.MUCOREM_NUGRUM);
        simpleItem(CheesyItems.PENICILLIUM_CAMEMBERTI);
        simpleItem(CheesyItems.PENICILLIUM_RIQUEFORTI);

        simpleItem(CheesyItems.BUFFALO_MILK_BOTTLE);
        simpleItem(CheesyItems.COW_MILK_BOTTLE);
        simpleItem(CheesyItems.GOAT_MILK_BOTTLE);
        simpleItem(CheesyItems.STRIDER_MILK_BOTTLE);
        simpleItem(CheesyItems.SHEEP_MILK_BOTTLE);
        simpleItem(CheesyItems.YAK_MILK_BOTTLE);

        simpleItem(CheesyItems.RENNET_BOTTLE);

        simpleItem(CheesyItems.BUFFALO_MILK_BUCKET);
        simpleItem(CheesyItems.GOAT_MILK_BUCKET);
        simpleItem(CheesyItems.PASTEURISED_MILK_BUCKET);
        simpleItem(CheesyItems.SHEEP_MILK_BUCKET);
        simpleItem(CheesyItems.STRIDER_MILK_BUCKET);
        simpleItem(CheesyItems.YAK_MILK_BUCKET);

        simpleItem(CheesyItems.BRINE_BUCKET);
        simpleItem(CheesyItems.RENNET_BUCKET);
        simpleItem(CheesyItems.WHEY_BUCKET);

        simpleItem(CheesyItems.ACTIVATED_ORANGE_COW_CHEESE_CURDS);
        simpleItem(CheesyItems.BLACK_STRIDER_CHEESE_CURDS);
        simpleItem(CheesyItems.BLUE_COW_CHEESE_CURDS);
        simpleItem(CheesyItems.BLUE_SHEEP_CHEESE_CURDS);
        simpleItem(CheesyItems.BRINED_BLACK_STRIDER_CHEESE_CURDS);
        simpleItem(CheesyItems.BRINED_BLUE_SHEEP_CHEESE_CURDS);
        simpleItem(CheesyItems.BRINED_ORANGE_COW_CHEESE_CURDS);
        simpleItem(CheesyItems.BUFFALO_CHEESE_CURDS);
        simpleItem(CheesyItems.COW_CHEESE_CURDS);
        simpleItem(CheesyItems.CREAMY_CHEESE_CURDS);
        simpleItem(CheesyItems.GOAT_CHEESE_CURDS);
        simpleItem(CheesyItems.JACK_MIX_CHEESE_CURDS);
        simpleItem(CheesyItems.MOLTEN_SHEEP_CHEESE_CURDS);
        simpleItem(CheesyItems.ORANGE_COW_CHEESE_CURDS);
        simpleItem(CheesyItems.SHEEP_CHEESE_CURDS);
        simpleItem(CheesyItems.STRIDER_CHEESE_CURDS);
        simpleItem(CheesyItems.YAK_CHEESE_CURDS);

        simpleItem(CheesyItems.WHEY_CURDS);

        simpleItem(CheesyItems.ACTIVATED_COAGULATED_ORANGE_COW_MILK);
        simpleItem(CheesyItems.COAGULATED_BLACK_STRIDER_MILK);
        simpleItem(CheesyItems.COAGULATED_BLUE_COW_MILK);
        simpleItem(CheesyItems.COAGULATED_BLUE_SHEEP_MILK);
        simpleItem(CheesyItems.COAGULATED_BUFFALO_MILK);
        simpleItem(CheesyItems.COAGULATED_COW_MILK);
        simpleItem(CheesyItems.COAGULATED_CREAMY_COW_MILK);
        simpleItem(CheesyItems.COAGULATED_GOAT_MILK);
        simpleItem(CheesyItems.COAGULATED_ORANGE_COW_MILK);
        simpleItem(CheesyItems.COAGULATED_SHEEP_MILK);
        simpleItem(CheesyItems.COAGULATED_STRIDER_MILK);
        simpleItem(CheesyItems.COAGULATED_YAK_MILK);

        simpleItem(CheesyItems.COAGULATED_JACK_MIX);

        simpleItem(CheesyItems.ACTIVATED_ORANGE_COW_CHEESE_WHEEL);
        simpleItem(CheesyItems.BLACK_STRIDER_CHEESE_WHEEL);
        simpleItem(CheesyItems.BLUE_COW_CHEESE_WHEEL);
        simpleItem(CheesyItems.BLUE_SHEEP_CHEESE_WHEEL);
        simpleItem(CheesyItems.BRINEWASHED_COW_CHEESE_WHEEL);
        simpleItem(CheesyItems.BUFFALO_CHEESE_WHEEL);
        simpleItem(CheesyItems.COW_CHEESE_WHEEL);
        simpleItem(CheesyItems.COW_CHEESE_WHEEL_MUCOR_LANCEOLATUS);
        simpleItem(CheesyItems.CREAMY_CHEESE_WHEEL);
        simpleItem(CheesyItems.DYED_BRINEWASHED_COW_CHEESE_WHEEL);
        simpleItem(CheesyItems.FERMENTED_BRINEWASHED_COW_CHEESE_WHEEL);
        simpleItem(CheesyItems.FETA_CHEESE_WHEEL);
        simpleItem(CheesyItems.GLOW_INKED_CHEESE_WHEEL);
        simpleItem(CheesyItems.GOAT_CHEESE_WHEEL);
        simpleItem(CheesyItems.GOAT_CHEESE_WHEEL_GEOTRICHUM_CANDIDUM);
        simpleItem(CheesyItems.INFESTED_SHEEP_CHEESE_WHEEL);
        simpleItem(CheesyItems.JACK_MIX_CHEESE_WHEEL);
        simpleItem(CheesyItems.LA_VACHE_QUI_RIT_WHEEL);
        simpleItem(CheesyItems.MESOPHILIC_BRINEWASHED_COW_CHEESE_WHEEL);
        simpleItem(CheesyItems.ORANGE_COW_CHEESE_WHEEL);
        simpleItem(CheesyItems.SALTED_BRINEWASHED_COW_CHEESE_WHEEL);
        simpleItem(CheesyItems.SHEEP_CHEESE_WHEEL);
        simpleItem(CheesyItems.SOFT_CURD_CHEESE_WHEEL);
        simpleItem(CheesyItems.STRIDER_CHEESE_WHEEL);
        simpleItem(CheesyItems.STRIDER_CHEESE_WHEEL_RIPE);
        simpleItem(CheesyItems.WAXED_COW_CHEESE_WHEEL);
        simpleItem(CheesyItems.WAXED_SHEEP_CHEESE_WHEEL);
        simpleItem(CheesyItems.YAK_CHEESE_WHEEL);

        simpleItem(CheesyItems.BABYBEL);
        simpleItem(CheesyItems.BLACK_MOLD_CHEESE);
        simpleItem(CheesyItems.BRIE);
        simpleItem(CheesyItems.BUFFALO_CHEESE);
        simpleItem(CheesyItems.BURRATA);
        simpleItem(CheesyItems.CABRALES);
        simpleItem(CheesyItems.CAMEMBERT);
        simpleItem(CheesyItems.CASU_MARZU);
        simpleItem(CheesyItems.CECIL);
        simpleItem(CheesyItems.CHEDDAR);
        simpleItem(CheesyItems.CHESHIRE);
        simpleItem(CheesyItems.COLBY_JACK);
        simpleItem(CheesyItems.COMTE);
        simpleItem(CheesyItems.COW_CHEESE);
        simpleItem(CheesyItems.CREAMY_CHEESE_BALLS);
        simpleItem(CheesyItems.CRIMSON_CHEESE);
        simpleItem(CheesyItems.CROTTIN_DE_CHAVIGNOL);
        simpleItem(CheesyItems.EDAM);
        simpleItem(CheesyItems.EMMENTALER);
        simpleItem(CheesyItems.EPOISSES_DE_BOURGOGNE);
        simpleItem(CheesyItems.FETA);
        simpleItem(CheesyItems.FROMAGE_FRAIS);
        simpleItem(CheesyItems.GLOW_CHEESE);
        simpleItem(CheesyItems.GOAT_CHEESE);
        simpleItem(CheesyItems.GORGONZOLA);
        simpleItem(CheesyItems.GOUDA);
        simpleItem(CheesyItems.GRANA_PADANO);
        simpleItem(CheesyItems.GRIMCHEESE);
        simpleItem(CheesyItems.GOLDEN_CHEESE);
        simpleItem(CheesyItems.GRUYERE);
        simpleItem(CheesyItems.LA_VACHE_QUI_RIT);
        simpleItem(CheesyItems.LOADED_GOAT_SKIN);
        simpleItem(CheesyItems.MANCHEGO);
        simpleItem(CheesyItems.MAROILLES);
        simpleItem(CheesyItems.MASCARPONE);
        simpleItem(CheesyItems.MIMOLETTE);
        simpleItem(CheesyItems.MOZZARELLA);
        simpleItem(CheesyItems.MUNSTER);
        simpleItem(CheesyItems.PARMIGIANO_REGGIANO);
        simpleItem(CheesyItems.PASTA_FILATA);
        simpleItem(CheesyItems.PASTA_FILATA_BALL);
        simpleItem(CheesyItems.PECORINO_ROMANO);
        simpleItem(CheesyItems.PROVOLONE);
        simpleItem(CheesyItems.RACLETTE);
        simpleItem(CheesyItems.REBLOCHON);
        simpleItem(CheesyItems.RICOTTA);
        simpleItem(CheesyItems.ROPETIED_PASTA_FILATA);
        simpleItem(CheesyItems.ROQUEFORT);
        simpleItem(CheesyItems.SHEEP_CHEESE);
        simpleItem(CheesyItems.SHROOMY_CHEESE);
        simpleItem(CheesyItems.STILTON);
        simpleItem(CheesyItems.STRIDER_CHEESE);
        simpleItem(CheesyItems.SWISS);
        simpleItem(CheesyItems.TALEGGIO);
        simpleItem(CheesyItems.THREADED_SHEEP_CHEESE);
        simpleItem(CheesyItems.TOMME_DE_SAVOIE);
        simpleItem(CheesyItems.TULUK);
        simpleItem(CheesyItems.WARPED_CHEESE);
        simpleItem(CheesyItems.YAK_CHEESE);

        simpleItem(CheesyItems.CHEDDAR_SHEET);
        simpleItem(CheesyItems.WRAPPED_CHEDDAR_SHEET);
        simpleItem(CheesyItems.RAW_CHEDDAR);

        simpleItem(CheesyItems.ANNATO);
        simpleItem(CheesyItems.CREAM);
        simpleItem(CheesyItems.RENNET_GLAND);
        simpleItem(CheesyItems.SALT);
        simpleItem(CheesyItems.THISTLE);
        simpleItem(CheesyItems.YOGURT);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(CreateCheesyDoesIt.MOD_ID,"item/" + item.getId().getPath()));
    }
}
