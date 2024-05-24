package net.tudytm.AdditionalFoodsMod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.tudytm.AdditionalFoodsMod.block.ModBlocks;
import net.tudytm.AdditionalFoodsMod.item.ModItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RICE_BLOCK.get())
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', ModItems.RICE.get())
                .unlockedBy(getHasName(ModItems.RICE.get()),has(ModItems.RICE.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RICE.get(), 9)
                .requires(ModBlocks.RICE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RICE_BLOCK.get()),has(ModBlocks.RICE_BLOCK.get()))
                .save(pWriter);
    }
}
