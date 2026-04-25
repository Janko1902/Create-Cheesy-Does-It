package com.janko.create_cheesy_does_it.item;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.item.custom.EnchantedGoldenCheeseItem;
import net.minecraft.world.item.BottleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MilkBucketItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.janko.create_cheesy_does_it.CreateCheesyDoesIt.MOD_ID;

public class CheesyItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> GEOTRICHUM_CANDIDUM = registerItem(() -> new Item(new Item.Properties()), "geotrichum_candidum");
    public static final RegistryObject<Item> MUCOR_LANCEOLATUS = registerItem(() -> new Item(new Item.Properties()), "mucor_lanceolatus");
    public static final RegistryObject<Item> MUCOREM_NUGRUM = registerItem(() -> new Item(new Item.Properties()), "mucorem_nigrum");
    public static final RegistryObject<Item> PENICILLIUM_CAMEMBERTI = registerItem(() -> new Item(new Item.Properties()), "penicillium_camemberti");
    public static final RegistryObject<Item> PENICILLIUM_RIQUEFORTI = registerItem(() -> new Item(new Item.Properties()), "penicillium_roqueforti");

    public static final RegistryObject<Item> BUFFALO_MILK_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "buffalo_milk_bottle");
    public static final RegistryObject<Item> COW_MILK_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "cow_milk_bottle");
    public static final RegistryObject<Item> GOAT_MILK_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "goat_milk_bottle");
    public static final RegistryObject<Item> STRIDER_MILK_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "strider_milk_bottle");
    public static final RegistryObject<Item> SHEEP_MILK_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "sheep_milk_bottle");
    public static final RegistryObject<Item> YAK_MILK_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "yak_milk_bottle");

    public static final RegistryObject<Item> RENNET_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "rennet_bottle");

    public static final RegistryObject<Item> BUFFALO_MILK_BUCKET = registerItem(() -> new MilkBucketItem(new Item.Properties()), "buffalo_milk_bucket");
    public static final RegistryObject<Item> GOAT_MILK_BUCKET = registerItem(() -> new MilkBucketItem(new Item.Properties()), "goat_milk_bucket");
    public static final RegistryObject<Item> PASTEURISED_MILK_BUCKET = registerItem(() -> new MilkBucketItem(new Item.Properties()), "pasteurised_milk_bucket");
    public static final RegistryObject<Item> SHEEP_MILK_BUCKET = registerItem(() -> new MilkBucketItem(new Item.Properties()), "sheep_milk_bucket");
    public static final RegistryObject<Item> STRIDER_MILK_BUCKET = registerItem(() -> new MilkBucketItem(new Item.Properties()), "strider_milk_bucket");
    public static final RegistryObject<Item> YAK_MILK_BUCKET = registerItem(() -> new MilkBucketItem(new Item.Properties()), "yak_milk_bucket");

    public static final RegistryObject<Item> BRINE_BUCKET = registerItem(() -> new Item(new Item.Properties()), "brine_bucket");
    public static final RegistryObject<Item> RENNET_BUCKET = registerItem(() -> new Item(new Item.Properties()), "rennet_bucket");
    public static final RegistryObject<Item> WHEY_BUCKET = registerItem(() -> new Item(new Item.Properties()), "whey_bucket");

    public static final RegistryObject<Item> ACTIVATED_ORANGE_COW_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "activated_orange_cow_cheese_curds");
    public static final RegistryObject<Item> BLACK_STRIDER_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "black_strider_cheese_curds");
    public static final RegistryObject<Item> BLUE_COW_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "blue_cow_cheese_curds");
    public static final RegistryObject<Item> BLUE_SHEEP_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "blue_sheep_cheese_curds");
    public static final RegistryObject<Item> BRINED_BLACK_STRIDER_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "brined_black_strider_cheese_curds");
    public static final RegistryObject<Item> BRINED_BLUE_SHEEP_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "brined_blue_sheep_cheese_curds");
    public static final RegistryObject<Item> BRINED_ORANGE_COW_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "brined_orange_cow_cheese_curds");
    public static final RegistryObject<Item> BUFFALO_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "buffalo_cheese_curds");
    public static final RegistryObject<Item> COW_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "cow_cheese_curds");
    public static final RegistryObject<Item> CREAMY_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "creamy_cheese_curds");
    public static final RegistryObject<Item> GOAT_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "goat_cheese_curds");
    public static final RegistryObject<Item> JACK_MIX_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "jack_mix_cheese_curds");
    public static final RegistryObject<Item> MOLTEN_SHEEP_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "molten_sheep_cheese_curds");
    public static final RegistryObject<Item> ORANGE_COW_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "orange_cow_cheese_curds");
    public static final RegistryObject<Item> SHEEP_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "sheep_cheese_curds");
    public static final RegistryObject<Item> STRIDER_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "strider_cheese_curds");
    public static final RegistryObject<Item> YAK_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "yak_cheese_curds");

    public static final RegistryObject<Item> WHEY_CURDS = registerItem(() -> new Item(new Item.Properties()), "whey_curds");

    public static final RegistryObject<Item> ACTIVATED_COAGULATED_ORANGE_COW_MILK = registerItem(() -> new Item(new Item.Properties()), "activated_coagulated_orange_cow_milk");
    public static final RegistryObject<Item> COAGULATED_BLACK_STRIDER_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_black_strider_milk");
    public static final RegistryObject<Item> COAGULATED_BLUE_COW_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_blue_cow_milk");
    public static final RegistryObject<Item> COAGULATED_BLUE_SHEEP_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_blue_sheep_milk");
    public static final RegistryObject<Item> COAGULATED_BUFFALO_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_buffalo_milk");
    public static final RegistryObject<Item> COAGULATED_COW_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_cow_milk");
    public static final RegistryObject<Item> COAGULATED_CREAMY_COW_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_creamy_milk");
    public static final RegistryObject<Item> COAGULATED_GOAT_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_goat_milk");
    public static final RegistryObject<Item> COAGULATED_ORANGE_COW_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_orange_cow_milk");
    public static final RegistryObject<Item> COAGULATED_SHEEP_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_sheep_milk");
    public static final RegistryObject<Item> COAGULATED_STRIDER_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_strider_milk");
    public static final RegistryObject<Item> COAGULATED_YAK_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_yak_milk");

    public static final RegistryObject<Item> COAGULATED_JACK_MIX = registerItem(() -> new Item(new Item.Properties()), "coagulated_jack_mix");

    public static final RegistryObject<Item> ACTIVATED_ORANGE_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "activated_orange_cow_cheese_wheel");
    public static final RegistryObject<Item> BLACK_STRIDER_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "black_strider_cheese_wheel");
    public static final RegistryObject<Item> BLUE_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "blue_cow_cheese_wheel");
    public static final RegistryObject<Item> BLUE_SHEEP_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "blue_sheep_cheese_wheel");
    public static final RegistryObject<Item> BRINEWASHED_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "brinewashed_cow_cheese_wheel");
    public static final RegistryObject<Item> BUFFALO_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "buffalo_cheese_wheel");
    public static final RegistryObject<Item> COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "cow_cheese_wheel");
    public static final RegistryObject<Item> COW_CHEESE_WHEEL_MUCOR_LANCEOLATUS = registerItem(() -> new Item(new Item.Properties()), "cow_cheese_wheel_mucor_lanceolatus");
    public static final RegistryObject<Item> CREAMY_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "creamy_cheese_wheel");
    public static final RegistryObject<Item> DYED_BRINEWASHED_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "dyed_brinewashed_cow_cheese_wheel");
    public static final RegistryObject<Item> FERMENTED_BRINEWASHED_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "fermented_brinewashed_cow_cheese_wheel");
    public static final RegistryObject<Item> FETA_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "feta_cheese_wheel");
    public static final RegistryObject<Item> GLOW_INKED_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "glow_inked_cheese_wheel");
    public static final RegistryObject<Item> GOAT_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "goat_cheese_wheel");
    public static final RegistryObject<Item> GOAT_CHEESE_WHEEL_GEOTRICHUM_CANDIDUM = registerItem(() -> new Item(new Item.Properties()), "goat_cheese_wheel_geotrichum_candidum");
    public static final RegistryObject<Item> INFESTED_SHEEP_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "infested_sheep_cheese_wheel");
    public static final RegistryObject<Item> JACK_MIX_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "jack_mix_cheese_wheel");
    public static final RegistryObject<Item> LA_VACHE_QUI_RIT_WHEEL = registerItem(() -> new Item(new Item.Properties()), "la_vache_qui_rit_wheel");
    public static final RegistryObject<Item> MESOPHILIC_BRINEWASHED_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "mesophilic_brinewashed_cow_cheese_wheel");
    public static final RegistryObject<Item> ORANGE_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "orange_cow_cheese_wheel");
    public static final RegistryObject<Item> SALTED_BRINEWASHED_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "salted_brinewashed_cow_cheese_wheel");
    public static final RegistryObject<Item> SHEEP_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "sheep_cheese_wheel");
    public static final RegistryObject<Item> SOFT_CURD_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "soft_curd_cheese_wheel");
    public static final RegistryObject<Item> STRIDER_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "strider_cheese_wheel");
    public static final RegistryObject<Item> STRIDER_CHEESE_WHEEL_RIPE = registerItem(() -> new Item(new Item.Properties()), "strider_cheese_wheel_ripe");
    public static final RegistryObject<Item> WAXED_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "waxed_cow_cheese_wheel");
    public static final RegistryObject<Item> WAXED_SHEEP_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "waxed_sheep_cheese_wheel");
    public static final RegistryObject<Item> YAK_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "yak_cheese_wheel");

    public static final RegistryObject<Item> BABYBEL = registerItem(() -> new Item(new Item.Properties()), "babybel");
    public static final RegistryObject<Item> BLACK_MOLD_CHEESE = registerItem(() -> new Item(new Item.Properties()), "black_mold_cheese");
    public static final RegistryObject<Item> BRIE = registerItem(() -> new Item(new Item.Properties()), "brie");
    public static final RegistryObject<Item> BUFFALO_CHEESE = registerItem(() -> new Item(new Item.Properties()), "buffalo_cheese");
    public static final RegistryObject<Item> BURRATA = registerItem(() -> new Item(new Item.Properties()), "burrata");
    public static final RegistryObject<Item> CABRALES = registerItem(() -> new Item(new Item.Properties()), "cabrales");
    public static final RegistryObject<Item> CAMEMBERT = registerItem(() -> new Item(new Item.Properties()), "camembert");
    public static final RegistryObject<Item> CASU_MARZU = registerItem(() -> new Item(new Item.Properties()), "casu_marzu");
    public static final RegistryObject<Item> CECIL = registerItem(() -> new Item(new Item.Properties()), "cecil");
    public static final RegistryObject<Item> CHEDDAR = registerItem(() -> new Item(new Item.Properties()), "cheddar");
    public static final RegistryObject<Item> CHESHIRE = registerItem(() -> new Item(new Item.Properties()), "cheshire");
    public static final RegistryObject<Item> COLBY_JACK = registerItem(() -> new Item(new Item.Properties()), "colby_jack");
    public static final RegistryObject<Item> COMTE = registerItem(() -> new Item(new Item.Properties()), "comte");
    public static final RegistryObject<Item> COW_CHEESE = registerItem(() -> new Item(new Item.Properties()), "cow_cheese");
    public static final RegistryObject<Item> CREAMY_CHEESE_BALLS = registerItem(() -> new Item(new Item.Properties()), "creamy_cheese_balls");
    public static final RegistryObject<Item> CRIMSON_CHEESE = registerItem(() -> new Item(new Item.Properties()), "crimson_cheese");
    public static final RegistryObject<Item> CROTTIN_DE_CHAVIGNOL = registerItem(() -> new Item(new Item.Properties()), "crottin_de_chavignol");
    public static final RegistryObject<Item> EDAM = registerItem(() -> new Item(new Item.Properties()), "edam");
    public static final RegistryObject<Item> EMMENTALER = registerItem(() -> new Item(new Item.Properties()), "emmentaler");
    public static final RegistryObject<Item> ENCHANTED_GOLDEN_CHEESE = registerItem(() -> new EnchantedGoldenCheeseItem(new Item.Properties()), "enchanted_golden_cheese");
    public static final RegistryObject<Item> EPOISSES_DE_BOURGOGNE = registerItem(() -> new Item(new Item.Properties()), "epoisses_de_bourgogne");
    public static final RegistryObject<Item> FETA = registerItem(() -> new Item(new Item.Properties()), "feta");
    public static final RegistryObject<Item> FROMAGE_FRAIS = registerItem(() -> new Item(new Item.Properties()), "fromage_frais");
    public static final RegistryObject<Item> GLOW_CHEESE = registerItem(() -> new Item(new Item.Properties()), "glow_cheese");
    public static final RegistryObject<Item> GOAT_CHEESE = registerItem(() -> new Item(new Item.Properties()), "goat_cheese");
    public static final RegistryObject<Item> GORGONZOLA = registerItem(() -> new Item(new Item.Properties()), "gorgonzola");
    public static final RegistryObject<Item> GOUDA = registerItem(() -> new Item(new Item.Properties()), "gouda");
    public static final RegistryObject<Item> GRANA_PADANO = registerItem(() -> new Item(new Item.Properties()), "grana_padano");
    public static final RegistryObject<Item> GRIMCHEESE = registerItem(() -> new Item(new Item.Properties()), "grimcheese");
    public static final RegistryObject<Item> GOLDEN_CHEESE = registerItem(() -> new Item(new Item.Properties()), "golden_cheese");
    public static final RegistryObject<Item> GRUYERE = registerItem(() -> new Item(new Item.Properties()), "gruyere");
    public static final RegistryObject<Item> LA_VACHE_QUI_RIT = registerItem(() -> new Item(new Item.Properties()), "la_vache_qui_rit");
    public static final RegistryObject<Item> LOADED_GOAT_SKIN = registerItem(() -> new Item(new Item.Properties()), "loaded_goat_skin");
    public static final RegistryObject<Item> MANCHEGO = registerItem(() -> new Item(new Item.Properties()), "manchego");
    public static final RegistryObject<Item> MAROILLES = registerItem(() -> new Item(new Item.Properties()), "maroilles");
    public static final RegistryObject<Item> MASCARPONE = registerItem(() -> new Item(new Item.Properties()), "mascarpone");
    public static final RegistryObject<Item> MIMOLETTE = registerItem(() -> new Item(new Item.Properties()), "mimolette");
    public static final RegistryObject<Item> MOZZARELLA = registerItem(() -> new Item(new Item.Properties()), "mozzarella");
    public static final RegistryObject<Item> MUNSTER = registerItem(() -> new Item(new Item.Properties()), "munster");
    public static final RegistryObject<Item> PARMIGIANO_REGGIANO = registerItem(() -> new Item(new Item.Properties()), "parmigiano_reggiano");
    public static final RegistryObject<Item> PASTA_FILATA = registerItem(() -> new Item(new Item.Properties()), "pasta_filata");
    public static final RegistryObject<Item> PASTA_FILATA_BALL = registerItem(() -> new Item(new Item.Properties()), "pasta_filata_ball");
    public static final RegistryObject<Item> PECORINO_ROMANO = registerItem(() -> new Item(new Item.Properties()), "pecorino_romano");
    public static final RegistryObject<Item> PROVOLONE = registerItem(() -> new Item(new Item.Properties()), "provolone");
    public static final RegistryObject<Item> RACLETTE = registerItem(() -> new Item(new Item.Properties()), "raclette");
    public static final RegistryObject<Item> REBLOCHON = registerItem(() -> new Item(new Item.Properties()), "reblochon");
    public static final RegistryObject<Item> RICOTTA = registerItem(() -> new Item(new Item.Properties()), "ricotta");
    public static final RegistryObject<Item> ROPETIED_PASTA_FILATA = registerItem(() -> new Item(new Item.Properties()), "ropetied_pasta_filata");
    public static final RegistryObject<Item> ROQUEFORT = registerItem(() -> new Item(new Item.Properties()), "roquefort");
    public static final RegistryObject<Item> SHEEP_CHEESE = registerItem(() -> new Item(new Item.Properties()), "sheep_cheese");
    public static final RegistryObject<Item> SHROOMY_CHEESE = registerItem(() -> new Item(new Item.Properties()), "shroomy_cheese");
    public static final RegistryObject<Item> STILTON = registerItem(() -> new Item(new Item.Properties()), "stilton");
    public static final RegistryObject<Item> STRIDER_CHEESE = registerItem(() -> new Item(new Item.Properties()), "strider_cheese");
    public static final RegistryObject<Item> SWISS = registerItem(() -> new Item(new Item.Properties()), "swiss");
    public static final RegistryObject<Item> TALEGGIO = registerItem(() -> new Item(new Item.Properties()), "taleggio");
    public static final RegistryObject<Item> THREADED_SHEEP_CHEESE = registerItem(() -> new Item(new Item.Properties()), "threaded_sheep_cheese");
    public static final RegistryObject<Item> TOMME_DE_SAVOIE = registerItem(() -> new Item(new Item.Properties()), "tomme_de_savoie");
    public static final RegistryObject<Item> TULUK = registerItem(() -> new Item(new Item.Properties()), "tuluk");
    public static final RegistryObject<Item> WARPED_CHEESE = registerItem(() -> new Item(new Item.Properties()), "warped_cheese");
    public static final RegistryObject<Item> YAK_CHEESE = registerItem(() -> new Item(new Item.Properties()), "yak_cheese");

    public static final RegistryObject<Item> CHEDDAR_SHEET = registerItem(() -> new Item(new Item.Properties()), "cheddar_sheet");
    public static final RegistryObject<Item> WRAPPED_CHEDDAR_SHEET = registerItem(() -> new Item(new Item.Properties()), "wrapped_cheddar_sheet");
    public static final RegistryObject<Item> RAW_CHEDDAR = registerItem(() -> new Item(new Item.Properties()), "raw_cheddar");

    public static final RegistryObject<Item> ANNATO = registerItem(() -> new Item(new Item.Properties()), "annato");
    public static final RegistryObject<Item> CREAM = registerItem(() -> new Item(new Item.Properties()), "cream");
    public static final RegistryObject<Item> RENNET_GLAND = registerItem(() -> new Item(new Item.Properties()), "rennet_gland");
    public static final RegistryObject<Item> SALT = registerItem(() -> new Item(new Item.Properties()), "salt");
    public static final RegistryObject<Item> THISTLE = registerItem(() -> new Item(new Item.Properties()), "thistle");
    public static final RegistryObject<Item> YOGURT = registerItem(() -> new Item(new Item.Properties()), "yogurt");

    private static <I extends Item> RegistryObject<I> registerItem(Supplier<I> item, String name) {
        return ITEMS.register(name,(item));
    }
    public static void registerCheesyItems(IEventBus modEventBus) {
        CreateCheesyDoesIt.LOGGER.info("Registering items for " + CreateCheesyDoesIt.MOD_NAME);
        ITEMS.register(modEventBus);
    }
}
