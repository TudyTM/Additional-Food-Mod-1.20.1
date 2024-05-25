package net.tudytm.AdditionalFoodsMod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.tudytm.AdditionalFoodsMod.AdditionalFoodsMod;
import net.tudytm.AdditionalFoodsMod.item.ModItems;
import net.tudytm.AdditionalFoodsMod.loot.AddItemModifier;

public class ModGlobalModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalModifiersProvider(PackOutput output) {
        super(output, AdditionalFoodsMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("bell_pepper_seeds_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.BELL_PEPPER_SEEDS.get()));
        add("strawberry_seeds_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.STRAWBERRY_SEEDS.get()));

    }
}
