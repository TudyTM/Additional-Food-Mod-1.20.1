package net.tudytm.AdditionalFoodsMod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties AVOCADO = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build();
    public static final FoodProperties BELL_PEPPER = new FoodProperties.Builder().nutrition(3).saturationMod(0.1f).build();
    public static final FoodProperties CUCUMBER = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build();
    public static final FoodProperties GARLIC = new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 0.5f).build();
    public static final FoodProperties LEMON = new FoodProperties.Builder().nutrition(2).saturationMod(0.1f).build();
    public static final FoodProperties ONION = new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build();
    public static final FoodProperties ORANGE = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build();
    public static final FoodProperties PEACH = new FoodProperties.Builder().nutrition(1).saturationMod(0.2f).build();
    public static final FoodProperties PEAR = new FoodProperties.Builder().nutrition(1).saturationMod(0.2f).build();
    public static final FoodProperties PICKLES = new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build();
    public static final FoodProperties RICE = new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build();
    public static final FoodProperties STRAWBERRIES = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build();
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build();

}