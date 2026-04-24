package com.janko.create_cheesy_does_it.data;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.block.CheesyBlocks;
import com.janko.create_cheesy_does_it.item.CheesyItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.LanguageProvider;

public class CheesyLangProvider extends LanguageProvider {
    public CheesyLangProvider(PackOutput output,  String locale) {
        super(output, CreateCheesyDoesIt.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add(Items.MILK_BUCKET, "Cow Milk Bucket");

        add("itemGroup.cheesy_create", "Create: Cheesy Does It");

        add(CheesyItems.GEOTRICHUM_CANDIDUM.get(), "Geotrichum Candidum");
        add(CheesyItems.MUCOR_LANCEOLATUS.get(), "Mucor Lanceolatus");
        add(CheesyItems.MUCOREM_NUGRUM.get(), "Mucorem Nigrum");
        add(CheesyItems.PENICILLIUM_CAMEMBERTI.get(), "Penicillium Camemberti");
        add(CheesyItems.PENICILLIUM_RIQUEFORTI.get(), "Penicillium Roqueforti");

        add(CheesyItems.BUFFALO_MILK_BOTTLE.get(), "Buffalo Milk Bottle");
        add(CheesyItems.COW_MILK_BOTTLE.get(), "Cow Milk Bottle");
        add(CheesyItems.GOAT_MILK_BOTTLE.get(), "Goat Milk Bottle");
        add(CheesyItems.SHEEP_MILK_BOTTLE.get(), "Sheep Milk Bottle");
        add(CheesyItems.YAK_MILK_BOTTLE.get(), "Yak Milk Bottle");

        add(CheesyItems.RENNET_BOTTLE.get(), "Rennet Bottle");

        add(CheesyItems.BUFFALO_MILK_BUCKET.get(), "Buffalo Milk Bucket");
        add(CheesyItems.GOAT_MILK_BUCKET.get(), "Goat Milk Bucket");
        add(CheesyItems.SHEEP_MILK_BUCKET.get(), "Sheep Milk Bucket");
        add(CheesyItems.YAK_MILK_BUCKET.get(), "Yak Milk Bucket");

        add(CheesyItems.BRINE_BUCKET.get(), "Brine Bucket");
        add(CheesyItems.RENNET_BUCKET.get(), "Rennet Bucket");
        add(CheesyItems.WHEY_BUCKET.get(), "Whey Bucket");

        add(CheesyItems.BLUE_COW_CHEESE_CURDS.get(), "Blue Cow Cheese Curds");
        add(CheesyItems.BLUE_SHEEP_CHEESE_CURDS.get(), "Blue Sheep Cheese Curds");
        add(CheesyItems.BUFFALO_CHEESE_CURDS.get(), "Buffalo Cheese Curds");
        add(CheesyItems.COW_CHEESE_CURDS.get(), "Cow Cheese Curds");
        add(CheesyItems.CREAMY_CHEESE_CURDS.get(), "Creamy Cheese Curds");
        add(CheesyItems.GOAT_CHEESE_CURDS.get(), "Goat Cheese Curds");
        add(CheesyItems.ORANGE_COW_CHEESE_CURDS.get(), "Orange Cow Cheese Curds");
        add(CheesyItems.SHEEP_CHEESE_CURDS.get(), "Sheep Cheese Curds");
        add(CheesyItems.YAK_CHEESE_CURDS.get(), "Yak Cheese Curds");

        add(CheesyItems.COAGULATED_BLUE_COW_MILK.get(), "Coagulated Blue Cow Milk");
        add(CheesyItems.COAGULATED_BLUE_SHEEP_MILK.get(), "Coagulated Blue Sheep Milk");
        add(CheesyItems.COAGULATED_BUFFALO_MILK.get(), "Coagulated Buffalo Milk");
        add(CheesyItems.COAGULATED_COW_MILK.get(), "Coagulated Cow Milk");
        add(CheesyItems.COAGULATED_CREAMY_COW_MILK.get(), "Coagulated Creamy Cow Milk");
        add(CheesyItems.COAGULATED_GOAT_MILK.get(), "Coagulated Goat Milk");
        add(CheesyItems.COAGULATED_ORANGE_COW_MILK.get(), "Coagulated Orange Cow Milk");
        add(CheesyItems.COAGULATED_SHEEP_MILK.get(), "Coagulated Sheep Milk");
        add(CheesyItems.COAGULATED_YAK_MILK.get(), "Coagulated Yak Milk");

        add(CheesyItems.BLUE_COW_CHEESE_WHEEL.get(), "Blue Cow Cheese Wheel");
        add(CheesyItems.BLUE_SHEEP_CHEESE_WHEEL.get(), "Blue Sheep Cheese Wheel");
        add(CheesyItems.BUFFALO_CHEESE_WHEEL.get(), "Buffalo Cheese Wheel");
        add(CheesyItems.COW_CHEESE_WHEEL.get(), "Cow Cheese Wheel");
        add(CheesyItems.CREAMY_CHEESE_WHEEL.get(), "Creamy Cheese Wheel");
        add(CheesyItems.GOAT_CHEESE_WHEEL.get(), "Goat Cheese Wheel");
        add(CheesyItems.LA_VACHE_QUI_RIT_WHEEL.get(), "La Vache qui Rit Wheel");
        add(CheesyItems.ORANGE_COW_CHEESE_WHEEL.get(), "Orange Cow Cheese Wheel");
        add(CheesyItems.SHEEP_CHEESE_WHEEL.get(), "Sheep Cheese Wheel");
        add(CheesyItems.SOFT_CURD_CHEESE_WHEEL.get(), "Soft Curd Cheese Wheel");
        add(CheesyItems.YAK_CHEESE_WHEEL.get(), "Yak Cheese Wheel");

        add(CheesyItems.BABYBEL.get(), "Babybel");
        add(CheesyItems.BLACK_MOLD_CHEESE.get(), "Black Mold Cheese");
        add(CheesyItems.BRIE.get(), "Brie");
        add(CheesyItems.BURRATA.get(), "Burrata");
        add(CheesyItems.CABRALES.get(), "Cabrales");
        add(CheesyItems.CAMEMBERT.get(), "Camembert");
        add(CheesyItems.CASU_MARZU.get(), "Casu Marzu");
        add(CheesyItems.CECIL.get(), "Çeçil");
        add(CheesyItems.CHEDDAR.get(), "Cheddar");
        add(CheesyItems.CHESHIRE.get(), "Cheshire");
        add(CheesyItems.COLBY_JACK.get(), "Colby Jack");
        add(CheesyItems.COMTE.get(), "Comté");
        add(CheesyItems.CROTTIN_DE_CHAVIGNOL.get(), "Crottin de Chavignol");
        add(CheesyItems.EDAM.get(), "Edam");
        add(CheesyItems.EMMENTALER.get(), "Emmentaler");
        add(CheesyItems.EPOISSES_DE_BOURGOGNE.get(), "Époisses de Bourgogne");
        add(CheesyItems.FETA.get(), "Feta");
        add(CheesyItems.FROMAGE_FRAIS.get(), "Fromage Frais");
        add(CheesyItems.GLOW_CHEESE.get(), "Glow Cheese");
        add(CheesyItems.GORGONZOLA.get(), "Gorgonzola");
        add(CheesyItems.GOUDA.get(), "Gouda");
        add(CheesyItems.GRANA_PADANO.get(), "Grana Padano");
        add(CheesyItems.GRUYERE.get(), "Gruyère");
        add(CheesyItems.LA_VACHE_QUI_RIT.get(), "La Vache qui Rit");
        add(CheesyItems.MANCHEGO.get(), "Manchego");
        add(CheesyItems.MAROILLES.get(), "Maroilles");
        add(CheesyItems.MASCARPONE.get(), "Mascarpone");
        add(CheesyItems.MIMOLETTE.get(), "Mimolette");
        add(CheesyItems.MOZZARELLA.get(), "Mozzarella");
        add(CheesyItems.MUNSTER.get(), "Munster");
        add(CheesyItems.PARMIGIANO_REGGIANO.get(), "Parmigiano Reggiano");
        add(CheesyItems.PECORINO_ROMANO.get(), "Pecorino Romano");
        add(CheesyItems.PROVOLONE.get(), "Provolone");
        add(CheesyItems.RACLETTE.get(), "Raclette");
        add(CheesyItems.REBLOCHON.get(), "Reblochon");
        add(CheesyItems.RICOTTA.get(), "Ricotta");
        add(CheesyItems.ROQUEFORT.get(), "Roquefort");
        add(CheesyItems.STILTON.get(), "Stilton");
        add(CheesyItems.SWISS.get(), "Swiss");
        add(CheesyItems.TALEGGIO.get(), "Taleggio");
        add(CheesyItems.TOMME_DE_SAVOIE.get(), "Tomme de Savoie");
        add(CheesyItems.TULUK.get(), "Tuluk");

        add(CheesyItems.CHEDDAR_SHEET.get(), "Cheddar Sheet");
        add(CheesyItems.WRAPPED_CHEDDAR_SHEET.get(), "Wrapped Cheddar Sheet");
        add(CheesyItems.RAW_CHEDDAR.get(), "Raw Cheddar");

        add(CheesyItems.CREAM.get(), "Cream");
        add(CheesyItems.SALT.get(), "Salt");

        add(CheesyBlocks.CHEDDAR_BLOCK.get(), "Block of Cheddar");
        add(CheesyBlocks.CHEDDAR_ORE.get(), "Cheedar Ore");
        add(CheesyBlocks.DEEPSLATE_CHEDDAR_ORE.get(), "Deepslate Cheddar Ore");

        add(CheesyBlocks.SWISS_BLOCK.get(), "Block of Swiss");
    }
}