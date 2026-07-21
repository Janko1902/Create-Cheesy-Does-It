package com.janko.create_cheesy_does_it.item;

import com.janko.create_cheesy_does_it.CreateCheesyDoesIt;
import com.janko.create_cheesy_does_it.helper.CheesyHelpers;
import com.janko.create_cheesy_does_it.item.custom.EnchantedGoldenCheeseItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BottleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MilkBucketItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.janko.create_cheesy_does_it.CreateCheesyDoesIt.MOD_ID;

public class CheesyItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredItem<Item> GEOTRICHUM_CANDIDUM = registerItem(() -> new Item(new Item.Properties()), "geotrichum_candidum");
    public static final DeferredItem<Item> MUCOR_LANCEOLATUS = registerItem(() -> new Item(new Item.Properties()), "mucor_lanceolatus");
    public static final DeferredItem<Item> MUCOREM_NUGRUM = registerItem(() -> new Item(new Item.Properties()), "mucorem_nigrum");
    public static final DeferredItem<Item> PENICILLIUM_CAMEMBERTI = registerItem(() -> new Item(new Item.Properties()), "penicillium_camemberti");
    public static final DeferredItem<Item> PENICILLIUM_RIQUEFORTI = registerItem(() -> new Item(new Item.Properties()), "penicillium_roqueforti");

    public static final DeferredItem<Item> BUFFALO_MILK_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "buffalo_milk_bottle");
    public static final DeferredItem<Item> COW_MILK_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "cow_milk_bottle");
    public static final DeferredItem<Item> GOAT_MILK_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "goat_milk_bottle");
    public static final DeferredItem<Item> STRIDER_MILK_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "strider_milk_bottle");
    public static final DeferredItem<Item> SHEEP_MILK_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "sheep_milk_bottle");
    public static final DeferredItem<Item> YAK_MILK_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "yak_milk_bottle");

    public static final DeferredItem<Item> RENNET_BOTTLE = registerItem(() -> new BottleItem(new Item.Properties()), "rennet_bottle");

    public static final DeferredItem<Item> BUFFALO_MILK_BUCKET = registerItem(() -> new MilkBucketItem(new Item.Properties()), "buffalo_milk_bucket");
    public static final DeferredItem<Item> GOAT_MILK_BUCKET = registerItem(() -> new MilkBucketItem(new Item.Properties()), "goat_milk_bucket");
    public static final DeferredItem<Item> PASTEURISED_MILK_BUCKET = registerItem(() -> new MilkBucketItem(new Item.Properties()), "pasteurised_milk_bucket");
    public static final DeferredItem<Item> SHEEP_MILK_BUCKET = registerItem(() -> new MilkBucketItem(new Item.Properties()), "sheep_milk_bucket");
    public static final DeferredItem<Item> STRIDER_MILK_BUCKET = registerItem(() -> new MilkBucketItem(new Item.Properties()), "strider_milk_bucket");
    public static final DeferredItem<Item> YAK_MILK_BUCKET = registerItem(() -> new MilkBucketItem(new Item.Properties()), "yak_milk_bucket");

    public static final DeferredItem<Item> BRINE_BUCKET = registerItem(() -> new Item(new Item.Properties()), "brine_bucket");
    public static final DeferredItem<Item> RENNET_BUCKET = registerItem(() -> new Item(new Item.Properties()), "rennet_bucket");
    public static final DeferredItem<Item> WHEY_BUCKET = registerItem(() -> new Item(new Item.Properties()), "whey_bucket");

    public static final DeferredItem<Item> ACTIVATED_ORANGE_COW_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "activated_orange_cow_cheese_curds");
    public static final DeferredItem<Item> BLACK_AND_BLUE_STRIDER_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "black_and_blue_strider_cheese_curds");
    public static final DeferredItem<Item> BLACK_STRIDER_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "black_strider_cheese_curds");
    public static final DeferredItem<Item> BLUE_COW_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "blue_cow_cheese_curds");
    public static final DeferredItem<Item> BLUE_SHEEP_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "blue_sheep_cheese_curds");
    public static final DeferredItem<Item> BRINED_BLACK_AND_BLUE_STRIDER_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "brined_black_and_blue_strider_cheese_curds");
    public static final DeferredItem<Item> BRINED_BLACK_STRIDER_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "brined_black_strider_cheese_curds");
    public static final DeferredItem<Item> BRINED_BLUE_SHEEP_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "brined_blue_sheep_cheese_curds");
    public static final DeferredItem<Item> BRINED_ORANGE_COW_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "brined_orange_cow_cheese_curds");
    public static final DeferredItem<Item> BRINED_STRIDER_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "brined_strider_cheese_curds");
    public static final DeferredItem<Item> BUFFALO_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "buffalo_cheese_curds");
    public static final DeferredItem<Item> COW_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "cow_cheese_curds");
    public static final DeferredItem<Item> CREAMY_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "creamy_cheese_curds");
    public static final DeferredItem<Item> GOAT_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "goat_cheese_curds");
    public static final DeferredItem<Item> JACK_MIX_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "jack_mix_cheese_curds");
    public static final DeferredItem<Item> MOLTEN_SHEEP_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "molten_sheep_cheese_curds");
    public static final DeferredItem<Item> ORANGE_COW_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "orange_cow_cheese_curds");
    public static final DeferredItem<Item> SHEEP_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "sheep_cheese_curds");
    public static final DeferredItem<Item> STRIDER_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "strider_cheese_curds");
    public static final DeferredItem<Item> YAK_CHEESE_CURDS = registerItem(() -> new Item(new Item.Properties()), "yak_cheese_curds");

    public static final DeferredItem<Item> WHEY_CURDS = registerItem(() -> new Item(new Item.Properties()), "whey_curds");

    public static final DeferredItem<Item> ACTIVATED_COAGULATED_ORANGE_COW_MILK = registerItem(() -> new Item(new Item.Properties()), "activated_coagulated_orange_cow_milk");
    public static final DeferredItem<Item> COAGULATED_BLACK_AND_BLUE_STRIDER_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_black_and_blue_strider_milk");
    public static final DeferredItem<Item> COAGULATED_BLACK_STRIDER_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_black_strider_milk");
    public static final DeferredItem<Item> COAGULATED_BLUE_COW_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_blue_cow_milk");
    public static final DeferredItem<Item> COAGULATED_BLUE_SHEEP_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_blue_sheep_milk");
    public static final DeferredItem<Item> COAGULATED_BUFFALO_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_buffalo_milk");
    public static final DeferredItem<Item> COAGULATED_COW_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_cow_milk");
    public static final DeferredItem<Item> COAGULATED_CREAMY_COW_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_creamy_milk");
    public static final DeferredItem<Item> COAGULATED_GOAT_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_goat_milk");
    public static final DeferredItem<Item> COAGULATED_ORANGE_COW_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_orange_cow_milk");
    public static final DeferredItem<Item> COAGULATED_SHEEP_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_sheep_milk");
    public static final DeferredItem<Item> COAGULATED_STRIDER_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_strider_milk");
    public static final DeferredItem<Item> COAGULATED_YAK_MILK = registerItem(() -> new Item(new Item.Properties()), "coagulated_yak_milk");

    public static final DeferredItem<Item> COAGULATED_JACK_MIX = registerItem(() -> new Item(new Item.Properties()), "coagulated_jack_mix");

    public static final DeferredItem<Item> ACTIVATED_ORANGE_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "activated_orange_cow_cheese_wheel");
    public static final DeferredItem<Item> BLACK_AND_BLUE_STRIDER_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "black_and_blue_strider_cheese_wheel");
    public static final DeferredItem<Item> BLACK_STRIDER_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "black_strider_cheese_wheel");
    public static final DeferredItem<Item> BLUE_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "blue_cow_cheese_wheel");
    public static final DeferredItem<Item> BLUE_SHEEP_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "blue_sheep_cheese_wheel");
    public static final DeferredItem<Item> BRINEWASHED_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "brinewashed_cow_cheese_wheel");
    public static final DeferredItem<Item> BUFFALO_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "buffalo_cheese_wheel");
    public static final DeferredItem<Item> COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "cow_cheese_wheel");
    public static final DeferredItem<Item> COW_CHEESE_WHEEL_MUCOR_LANCEOLATUS = registerItem(() -> new Item(new Item.Properties()), "cow_cheese_wheel_mucor_lanceolatus");
    public static final DeferredItem<Item> CREAMY_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "creamy_cheese_wheel");
    public static final DeferredItem<Item> DYED_BRINEWASHED_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "dyed_brinewashed_cow_cheese_wheel");
    public static final DeferredItem<Item> FERMENTED_BRINEWASHED_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "fermented_brinewashed_cow_cheese_wheel");
    public static final DeferredItem<Item> FETA_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "feta_cheese_wheel");
    public static final DeferredItem<Item> GLOW_INKED_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "glow_inked_cheese_wheel");
    public static final DeferredItem<Item> GOAT_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "goat_cheese_wheel");
    public static final DeferredItem<Item> GOAT_CHEESE_WHEEL_GEOTRICHUM_CANDIDUM = registerItem(() -> new Item(new Item.Properties()), "goat_cheese_wheel_geotrichum_candidum");
    public static final DeferredItem<Item> INFESTED_SHEEP_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "infested_sheep_cheese_wheel");
    public static final DeferredItem<Item> JACK_MIX_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "jack_mix_cheese_wheel");
    public static final DeferredItem<Item> LA_VACHE_QUI_RIT_WHEEL = registerItem(() -> new Item(new Item.Properties()), "la_vache_qui_rit_wheel");
    public static final DeferredItem<Item> MESOPHILIC_BRINEWASHED_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "mesophilic_brinewashed_cow_cheese_wheel");
    public static final DeferredItem<Item> ORANGE_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "orange_cow_cheese_wheel");
    public static final DeferredItem<Item> SALTED_BRINEWASHED_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "salted_brinewashed_cow_cheese_wheel");
    public static final DeferredItem<Item> SHEEP_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "sheep_cheese_wheel");
    public static final DeferredItem<Item> SOFT_CURD_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "soft_curd_cheese_wheel");
    public static final DeferredItem<Item> STRIDER_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "strider_cheese_wheel");
    public static final DeferredItem<Item> STRIDER_CHEESE_WHEEL_RIPE = registerItem(() -> new Item(new Item.Properties()), "strider_cheese_wheel_ripe");
    public static final DeferredItem<Item> WAXED_COW_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "waxed_cow_cheese_wheel");
    public static final DeferredItem<Item> WAXED_SHEEP_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "waxed_sheep_cheese_wheel");
    public static final DeferredItem<Item> YAK_CHEESE_WHEEL = registerItem(() -> new Item(new Item.Properties()), "yak_cheese_wheel");

    public static final DeferredItem<Item> BABYBEL = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(2, 1.0F))), "babybel");
    public static final DeferredItem<Item> BLACK_MOLD_CHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(10, 0.0F))), "black_mold_cheese");
    public static final DeferredItem<Item> BRIE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(8, 0.375F))), "brie");
    public static final DeferredItem<Item> BUFFALO_CHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(5, 0.3F))), "buffalo_cheese");
    public static final DeferredItem<Item> BURRATA = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(4, 0.25F))), "burrata");
    public static final DeferredItem<Item> CABRALES = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(10, 0.4F))), "cabrales");
    public static final DeferredItem<Item> CAMEMBERT = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(8, 0.375F))), "camembert");
    public static final DeferredItem<Item> CASU_MARZU = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.0F, new MobEffectInstance(MobEffects.HUNGER, 200), 1))), "casu_marzu");
    public static final DeferredItem<Item> CECIL = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(4, 0.75F))), "cecil");
    public static final DeferredItem<Item> CHEDDAR = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(2, 2.0F))), "cheddar");
    public static final DeferredItem<Item> CHESHIRE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "cheshire");
    public static final DeferredItem<Item> COLBY_JACK = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "colby_jack");
    public static final DeferredItem<Item> COMTE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "comte");
    public static final DeferredItem<Item> COW_CHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(5, 0.3F))), "cow_cheese");
    public static final DeferredItem<Item> CREAMY_CHEESE_BALLS = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(4, 1.25F))), "creamy_cheese_balls");
    public static final DeferredItem<Item> CRIMSON_CHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(8, 0.38F))), "crimson_cheese");
    public static final DeferredItem<Item> CROTTIN_DE_CHAVIGNOL = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "crottin_de_chavignol");
    public static final DeferredItem<Item> EDAM = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "edam");
    public static final DeferredItem<Item> EMMENTALER = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "emmentaler");
    public static final DeferredItem<Item> ENCHANTED_GOLDEN_CHEESE = registerItem(() -> new EnchantedGoldenCheeseItem(new Item.Properties().food(CheesyHelpers.food(20, 0.8F, new MobEffectInstance(MobEffects.REGENERATION, 600, 1), 1))), "enchanted_golden_cheese");
    public static final DeferredItem<Item> EPOISSES_DE_BOURGOGNE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "epoisses_de_bourgogne");
    public static final DeferredItem<Item> FETA = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(4, 0.25F))), "feta");
    public static final DeferredItem<Item> FROMAGE_FRAIS = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(4, 0.25F))), "fromage_frais");
    public static final DeferredItem<Item> GLOW_CHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(8, 0.38F, new MobEffectInstance(MobEffects.GLOWING, 300), 0.8F))), "glow_cheese");
    public static final DeferredItem<Item> GOAT_CHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(5, 0.3F))), "goat_cheese");
    public static final DeferredItem<Item> GORGONZOLA = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(10, 0.4F))), "gorgonzola");
    public static final DeferredItem<Item> GOUDA = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "gouda");
    public static final DeferredItem<Item> GRANA_PADANO = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(8, 0.38F))), "grana_padano");
    public static final DeferredItem<Item> GRIMCHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(10, 0.1F))), "grimcheese");
    public static final DeferredItem<Item> GOLDEN_CHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(8, 1.0F, new MobEffectInstance(MobEffects.REGENERATION, 600), 1))), "golden_cheese");
    public static final DeferredItem<Item> GRUYERE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "gruyere");
    public static final DeferredItem<Item> LA_VACHE_QUI_RIT = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(2, 0.5F))), "la_vache_qui_rit");
    public static final DeferredItem<Item> LOADED_GOAT_SKIN = registerItem(() -> new Item(new Item.Properties()), "loaded_goat_skin");
    public static final DeferredItem<Item> MANCHEGO = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "manchego");
    public static final DeferredItem<Item> MAROILLES = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "maroilles");
    public static final DeferredItem<Item> MASCARPONE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(3, 0.33F))), "mascarpone");
    public static final DeferredItem<Item> MIMOLETTE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "mimolette");
    public static final DeferredItem<Item> MOZZARELLA = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(4, 0.38F))), "mozzarella");
    public static final DeferredItem<Item> MUNSTER = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "munster");
    public static final DeferredItem<Item> PARMIGIANO_REGGIANO = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(10, 0.4F))), "parmigiano_reggiano");
    public static final DeferredItem<Item> PASTA_FILATA = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "pasta_filata");
    public static final DeferredItem<Item> PASTA_FILATA_BALL = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(10, 0.4F))), "pasta_filata_ball");
    public static final DeferredItem<Item> PECORINO_ROMANO = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(8, 0.38F))), "pecorino_romano");
    public static final DeferredItem<Item> PROVOLONE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "provolone");
    public static final DeferredItem<Item> RACLETTE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "raclette");
    public static final DeferredItem<Item> REBLOCHON = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "reblochon");
    public static final DeferredItem<Item> RICOTTA = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(4, 0.25F))), "ricotta");
    public static final DeferredItem<Item> ROPETIED_PASTA_FILATA = registerItem(() -> new Item(new Item.Properties()), "ropetied_pasta_filata");
    public static final DeferredItem<Item> ROQUEFORT = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(10, 0.4F))), "roquefort");
    public static final DeferredItem<Item> SHEEP_CHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(5, 0.3F))), "sheep_cheese");
    public static final DeferredItem<Item> SHROOMY_CHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(8, 0.38F))), "shroomy_cheese");
    public static final DeferredItem<Item> STILTON = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(8, 0.38F))), "stilton");
    public static final DeferredItem<Item> STRIDER_CHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "strider_cheese");
    public static final DeferredItem<Item> SWISS = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "swiss");
    public static final DeferredItem<Item> TALEGGIO = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "taleggio");
    public static final DeferredItem<Item> THREADED_SHEEP_CHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(4, 0.5F))), "threaded_sheep_cheese");
    public static final DeferredItem<Item> TOMME_DE_SAVOIE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(6, 0.33F))), "tomme_de_savoie");
    public static final DeferredItem<Item> TULUK = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(8, 0.38F))), "tuluk");
    public static final DeferredItem<Item> WARPED_CHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(8, 0.38F))), "warped_cheese");
    public static final DeferredItem<Item> YAK_CHEESE = registerItem(() -> new Item(new Item.Properties().food(CheesyHelpers.food(5, 0.3F))), "yak_cheese");

    public static final DeferredItem<Item> CHEDDAR_SHEET = registerItem(() -> new Item(new Item.Properties()), "cheddar_sheet");
    public static final DeferredItem<Item> WRAPPED_CHEDDAR_SHEET = registerItem(() -> new Item(new Item.Properties()), "wrapped_cheddar_sheet");
    public static final DeferredItem<Item> RAW_CHEDDAR = registerItem(() -> new Item(new Item.Properties()), "raw_cheddar");

    public static final DeferredItem<Item> ANNATO = registerItem(() -> new Item(new Item.Properties()), "annato");
    public static final DeferredItem<Item> CREAM = registerItem(() -> new Item(new Item.Properties()), "cream");
    public static final DeferredItem<Item> RENNET_GLAND = registerItem(() -> new Item(new Item.Properties()), "rennet_gland");
    public static final DeferredItem<Item> SALT = registerItem(() -> new Item(new Item.Properties()), "salt");
    public static final DeferredItem<Item> THISTLE = registerItem(() -> new Item(new Item.Properties()), "thistle");
    public static final DeferredItem<Item> YOGURT = registerItem(() -> new Item(new Item.Properties()), "yogurt");

    private static <I extends Item> DeferredItem<I> registerItem(Supplier<I> item, String name) {
        return ITEMS.register(name,(item));
    }
    public static void registerCheesyItems(IEventBus eventBus) {
        CreateCheesyDoesIt.LOGGER.info("Registering items for " + CreateCheesyDoesIt.MOD_NAME);
        ITEMS.register(eventBus);
    }
}
