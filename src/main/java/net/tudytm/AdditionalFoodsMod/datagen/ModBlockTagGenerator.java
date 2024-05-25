package net.tudytm.AdditionalFoodsMod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.tudytm.AdditionalFoodsMod.AdditionalFoodsMod;
import net.tudytm.AdditionalFoodsMod.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, AdditionalFoodsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.RICE_BLOCK.get())
                .add(ModBlocks.STRAWBERRY_CROP.get())
                .add(ModBlocks.BELL_PEPPER_CROP.get());
    }
}
