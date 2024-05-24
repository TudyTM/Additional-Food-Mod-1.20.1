package net.tudytm.AdditionalFoodsMod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tudytm.AdditionalFoodsMod.AdditionalFoodsMod;
import net.tudytm.AdditionalFoodsMod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdditionalFoodsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ADDITIONAL_FOOD = CREATIVE_MODE_TABS.register("additional_food",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STRAWBERRIES.get()))
                    .title(Component.translatable("creativetab.additional_food"))
                    .displayItems(((pParameters, pOutput) ->{
                        pOutput.accept(ModItems.STRAWBERRIES.get());
                        pOutput.accept(ModItems.TOMATO.get());
                        pOutput.accept(ModItems.AVOCADO.get());
                        pOutput.accept(ModItems.BELL_PEPPER.get());
                        pOutput.accept(ModItems.CUCUMBER.get());
                        pOutput.accept(ModItems.GARLIC.get());
                        pOutput.accept(ModItems.LEMON.get());
                        pOutput.accept(ModItems.ONION.get());
                        pOutput.accept(ModItems.ORANGE.get());
                        pOutput.accept(ModItems.PEACH.get());
                        pOutput.accept(ModItems.PEAR.get());
                        pOutput.accept(ModItems.PICKLES.get());
                        pOutput.accept(ModItems.RICE.get());

                        pOutput.accept(ModItems.KNIFE.get());

                        pOutput.accept(ModItems.AVOCADO_TREE_SAPPLING.get());
                        pOutput.accept(ModItems.BELL_PEPPER_SEEDS.get());
                        pOutput.accept(ModItems.CUCUMBER_SEEDS.get());
                        pOutput.accept(ModItems.GARLIC_SEEDS.get());
                        pOutput.accept(ModItems.LEMON_TREE_SAPPLING.get());
                        pOutput.accept(ModItems.ONION_SEEDS.get());
                        pOutput.accept(ModItems.ORANGE_TREE_SAPPLING.get());
                        pOutput.accept(ModItems.PEACH_TREE_SAPPLING.get());
                        pOutput.accept(ModItems.PEAR_TREE_SAPPLING.get());
                        pOutput.accept(ModItems.PICKLE_SEEDS.get());
                        pOutput.accept(ModItems.RICE_SEEDS.get());
                        pOutput.accept(ModItems.STRAWBERRY_SEEDS.get());
                        pOutput.accept(ModItems.TOMATO_SEEDS.get());

                        pOutput.accept(ModBlocks.RICE_BLOCK.get());

                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
