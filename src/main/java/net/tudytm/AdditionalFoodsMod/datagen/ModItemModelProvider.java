package net.tudytm.AdditionalFoodsMod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.tudytm.AdditionalFoodsMod.AdditionalFoodsMod;
import net.tudytm.AdditionalFoodsMod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AdditionalFoodsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.AVOCADO);
        simpleItem(ModItems.BELL_PEPPER);
        simpleItem(ModItems.BELL_PEPPER_SEEDS);
        simpleItem(ModItems.CUCUMBER);
        simpleItem(ModItems.GARLIC);
        simpleItem(ModItems.LEMON);
        simpleItem(ModItems.ONION);
        simpleItem(ModItems.ORANGE);
        simpleItem(ModItems.PEAR);
        simpleItem(ModItems.PEACH);
        simpleItem(ModItems.PICKLES);
        simpleItem(ModItems.RICE);
        simpleItem(ModItems.STRAWBERRY);
        simpleItem(ModItems.STRAWBERRY_SEEDS);
        simpleItem(ModItems.TOMATO);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(AdditionalFoodsMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}