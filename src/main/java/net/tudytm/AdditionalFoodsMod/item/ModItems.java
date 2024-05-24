package net.tudytm.AdditionalFoodsMod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tudytm.AdditionalFoodsMod.AdditionalFoodsMod;
import net.tudytm.AdditionalFoodsMod.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AdditionalFoodsMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber",
            () -> new Item(new Item.Properties().food(ModFoods.CUCUMBER)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoods.TOMATO)));
    public static final RegistryObject<Item> AVOCADO = ITEMS.register("avocado",
            () -> new Item(new Item.Properties().food(ModFoods.AVOCADO)));
    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new Item(new Item.Properties().food(ModFoods.ONION)));
    public static final RegistryObject<Item> BELL_PEPPER = ITEMS.register("bell_pepper",
            () -> new Item(new Item.Properties().food(ModFoods.BELL_PEPPER)));
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new Item(new Item.Properties().food(ModFoods.GARLIC)));
    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            () -> new Item(new Item.Properties().food(ModFoods.LEMON)));
    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().food(ModFoods.ORANGE)));
    public static final RegistryObject<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().food(ModFoods.PEACH)));
    public static final RegistryObject<Item> PEAR = ITEMS.register("pear",
            () -> new Item(new Item.Properties().food(ModFoods.PEAR)));
    public static final RegistryObject<Item> PICKLES = ITEMS.register("pickles",
            () -> new Item(new Item.Properties().food(ModFoods.PICKLES)));
    public static final RegistryObject<Item> RICE = ITEMS.register("rice",
            () -> new Item(new Item.Properties().food(ModFoods.RICE)));
    public static final RegistryObject<Item> STRAWBERRIES = ITEMS.register("strawberries",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));

    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));

    public static final RegistryObject<Item> AVOCADO_TREE_SAPPLING = ITEMS.register("avocado_tree_sappling",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));
    public static final RegistryObject<Item> BELL_PEPPER_SEEDS = ITEMS.register("bell_pepper_seeds",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));
    public static final RegistryObject<Item> CUCUMBER_SEEDS = ITEMS.register("cucumber_seeds",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));
    public static final RegistryObject<Item> GARLIC_SEEDS = ITEMS.register("garlic_seeds",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));
    public static final RegistryObject<Item> LEMON_TREE_SAPPLING = ITEMS.register("lemon_tree_sappling",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));
    public static final RegistryObject<Item> ONION_SEEDS = ITEMS.register("onion_seeds",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));
    public static final RegistryObject<Item> ORANGE_TREE_SAPPLING = ITEMS.register("orange_tree_sappling",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));
    public static final RegistryObject<Item> PEACH_TREE_SAPPLING = ITEMS.register("peach_tree_sappling",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));
    public static final RegistryObject<Item> PEAR_TREE_SAPPLING = ITEMS.register("pear_tree_sappling",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));
    public static final RegistryObject<Item> PICKLE_SEEDS = ITEMS.register("pickle_seeds",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));
    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_seeds",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));
    public static final RegistryObject<Item> STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_CROP.get(),new Item.Properties()));
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRIES)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
