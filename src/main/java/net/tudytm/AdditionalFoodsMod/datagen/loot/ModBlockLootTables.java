package net.tudytm.AdditionalFoodsMod.datagen.loot;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;
import net.tudytm.AdditionalFoodsMod.block.ModBlocks;
import net.tudytm.AdditionalFoodsMod.block.custom.StrawberryCropBlock;
import net.tudytm.AdditionalFoodsMod.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.RICE_BLOCK.get());

        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.STRAWBERRY_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(StrawberryCropBlock.AGE, 5));

        this.add(ModBlocks.STRAWBERRY_CROP.get(), createCropDrops(ModBlocks.STRAWBERRY_CROP.get(), ModItems.STRAWBERRY.get(),
                ModItems.STRAWBERRY_SEEDS.get(), lootitemcondition$builder));


        LootItemCondition.Builder lootitemcondition$builder1 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.BELL_PEPPER_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(StrawberryCropBlock.AGE, 5));

        this.add(ModBlocks.BELL_PEPPER_CROP.get(), createCropDrops(ModBlocks.BELL_PEPPER_CROP.get(), ModItems.BELL_PEPPER.get(),
                ModItems.BELL_PEPPER_SEEDS.get(), lootitemcondition$builder1));

        this.add(ModBlocks.AVOCADO_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.RICE_BLOCK.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: CHANGE TO SAPPLING
        this.add(ModBlocks.LEMON_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.RICE_BLOCK.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.ORANGE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.RICE_BLOCK.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.PEACH_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.RICE_BLOCK.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.PEAR_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.RICE_BLOCK.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
