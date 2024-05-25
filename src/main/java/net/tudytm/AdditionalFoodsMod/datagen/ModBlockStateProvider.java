package net.tudytm.AdditionalFoodsMod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.tudytm.AdditionalFoodsMod.AdditionalFoodsMod;
import net.tudytm.AdditionalFoodsMod.block.ModBlocks;
import net.tudytm.AdditionalFoodsMod.block.custom.BellPepperCropBlock;
import net.tudytm.AdditionalFoodsMod.block.custom.StrawberryCropBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AdditionalFoodsMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RICE_BLOCK);

        makeStrawberryCrop((CropBlock) ModBlocks.STRAWBERRY_CROP.get(), "strawberry_stage", "strawberry_stage");
        makeBellPepperCrop((CropBlock) ModBlocks.BELL_PEPPER_CROP.get(), "bell_pepper_stage", "bell_pepper_stage");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    public void makeStrawberryCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> strawberryStates(state, block, modelName, textureName);
        getVariantBuilder(block).forAllStates(function);
    }


    private ConfiguredModel[] strawberryStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((StrawberryCropBlock) block).getAgeProperty()),
                new ResourceLocation(AdditionalFoodsMod.MOD_ID, "block/" + textureName + state.getValue(((StrawberryCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }
    public void makeBellPepperCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> bellPepperStates(state, block, modelName, textureName);
        getVariantBuilder(block).forAllStates(function);
    }


    private ConfiguredModel[] bellPepperStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((BellPepperCropBlock) block).getAgeProperty()),
                new ResourceLocation(AdditionalFoodsMod.MOD_ID, "block/" + textureName + state.getValue(((BellPepperCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }
}
