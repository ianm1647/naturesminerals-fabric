package com.ianm1647.naturesminerals.data;

import com.ianm1647.naturesminerals.block.BlockList;
import com.ianm1647.naturesminerals.item.ItemList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.NETHERITE_BRICKS);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.SCORCHED_COAL_BLOCK);

        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.UVAROVITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.RAW_UVAROVITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.UVAROVITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.DEEPSLATE_UVAROVITE_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.KUNZITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.RAW_KUNZITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.KUNZITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.DEEPSLATE_KUNZITE_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.STIBNITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.RAW_STIBNITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.STIBNITE_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.ASTRITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.RAW_ASTRITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.ASTRITE_ORE);

        blockStateModelGenerator.registerCubeAllModelTexturePool(BlockList.THOUNITE_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemList.SCORCHED_COAL, Models.GENERATED);

        itemModelGenerator.register(ItemList.RAW_UVAROVITE, Models.GENERATED);
        itemModelGenerator.register(ItemList.UVAROVITE_APPLE, Models.GENERATED);
        itemModelGenerator.register(ItemList.UVAROVITE_AXE, Models.GENERATED);
        itemModelGenerator.register(ItemList.UVAROVITE_CHEST, Models.GENERATED);
        itemModelGenerator.register(ItemList.UVAROVITE_FEET, Models.GENERATED);
        //itemModelGenerator.register(ItemList.UVAROVITE_EXCAVATOR, Models.GENERATED);
        //itemModelGenerator.register(ItemList.UVAROVITE_HAMMER, Models.GENERATED);
        itemModelGenerator.register(ItemList.UVAROVITE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ItemList.UVAROVITE_HOE, Models.GENERATED);
        itemModelGenerator.register(ItemList.UVAROVITE_INGOT, Models.GENERATED);
        //itemModelGenerator.register(ItemList.UVAROVITE_KNIFE, Models.GENERATED);
        itemModelGenerator.register(ItemList.UVAROVITE_LEGS, Models.GENERATED);
        itemModelGenerator.register(ItemList.UVAROVITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemList.UVAROVITE_PAXEL, Models.GENERATED);
        itemModelGenerator.register(ItemList.UVAROVITE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ItemList.UVAROVITE_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ItemList.UVAROVITE_SWORD, Models.GENERATED);

        itemModelGenerator.register(ItemList.RAW_KUNZITE, Models.GENERATED);
        itemModelGenerator.register(ItemList.KUNZITE_APPLE, Models.GENERATED);
        itemModelGenerator.register(ItemList.KUNZITE_AXE, Models.GENERATED);
        itemModelGenerator.register(ItemList.KUNZITE_CHEST, Models.GENERATED);
        itemModelGenerator.register(ItemList.KUNZITE_FEET, Models.GENERATED);
        //itemModelGenerator.register(ItemList.KUNZITE_EXCAVATOR, Models.GENERATED);
        //itemModelGenerator.register(ItemList.KUNZITE_HAMMER, Models.GENERATED);
        itemModelGenerator.register(ItemList.KUNZITE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ItemList.KUNZITE_HOE, Models.GENERATED);
        itemModelGenerator.register(ItemList.KUNZITE_INGOT, Models.GENERATED);
        //itemModelGenerator.register(ItemList.KUNZITE_KNIFE, Models.GENERATED);
        itemModelGenerator.register(ItemList.KUNZITE_LEGS, Models.GENERATED);
        itemModelGenerator.register(ItemList.KUNZITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemList.KUNZITE_PAXEL, Models.GENERATED);
        itemModelGenerator.register(ItemList.KUNZITE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ItemList.KUNZITE_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ItemList.KUNZITE_SWORD, Models.GENERATED);

        itemModelGenerator.register(ItemList.RAW_STIBNITE, Models.GENERATED);
        itemModelGenerator.register(ItemList.STIBNITE_APPLE, Models.GENERATED);
        itemModelGenerator.register(ItemList.STIBNITE_AXE, Models.GENERATED);
        itemModelGenerator.register(ItemList.STIBNITE_CHEST, Models.GENERATED);
        itemModelGenerator.register(ItemList.STIBNITE_FEET, Models.GENERATED);
        //itemModelGenerator.register(ItemList.STIBNITE_EXCAVATOR, Models.GENERATED);
        //itemModelGenerator.register(ItemList.STIBNITE_HAMMER, Models.GENERATED);
        itemModelGenerator.register(ItemList.STIBNITE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ItemList.STIBNITE_HOE, Models.GENERATED);
        itemModelGenerator.register(ItemList.STIBNITE_INGOT, Models.GENERATED);
       // itemModelGenerator.register(ItemList.STIBNITE_KNIFE, Models.GENERATED);
        itemModelGenerator.register(ItemList.STIBNITE_LEGS, Models.GENERATED);
        itemModelGenerator.register(ItemList.STIBNITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemList.STIBNITE_PAXEL, Models.GENERATED);
        itemModelGenerator.register(ItemList.STIBNITE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ItemList.STIBNITE_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ItemList.STIBNITE_SWORD, Models.GENERATED);

        itemModelGenerator.register(ItemList.RAW_ASTRITE, Models.GENERATED);
        itemModelGenerator.register(ItemList.ASTRITE_APPLE, Models.GENERATED);
        itemModelGenerator.register(ItemList.ASTRITE_AXE, Models.GENERATED);
        itemModelGenerator.register(ItemList.ASTRITE_CHEST, Models.GENERATED);
        itemModelGenerator.register(ItemList.ASTRITE_FEET, Models.GENERATED);
        //itemModelGenerator.register(ItemList.ASTRITE_EXCAVATOR, Models.GENERATED);
        //itemModelGenerator.register(ItemList.ASTRITE_HAMMER, Models.GENERATED);
        itemModelGenerator.register(ItemList.ASTRITE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ItemList.ASTRITE_HOE, Models.GENERATED);
        itemModelGenerator.register(ItemList.ASTRITE_INGOT, Models.GENERATED);
        //itemModelGenerator.register(ItemList.ASTRITE_KNIFE, Models.GENERATED);
        itemModelGenerator.register(ItemList.ASTRITE_LEGS, Models.GENERATED);
        itemModelGenerator.register(ItemList.ASTRITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemList.ASTRITE_PAXEL, Models.GENERATED);
        itemModelGenerator.register(ItemList.ASTRITE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ItemList.ASTRITE_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ItemList.ASTRITE_SWORD, Models.GENERATED);

        itemModelGenerator.register(ItemList.THOUNITE_APPLE, Models.GENERATED);
        itemModelGenerator.register(ItemList.THOUNITE_AXE, Models.GENERATED);
        itemModelGenerator.register(ItemList.THOUNITE_CHEST, Models.GENERATED);
        itemModelGenerator.register(ItemList.THOUNITE_FEET, Models.GENERATED);
        //itemModelGenerator.register(ItemList.THOUNITE_EXCAVATOR, Models.GENERATED);
        //itemModelGenerator.register(ItemList.THOUNITE_HAMMER, Models.GENERATED);
        itemModelGenerator.register(ItemList.THOUNITE_HEAD, Models.GENERATED);
        itemModelGenerator.register(ItemList.THOUNITE_HOE, Models.GENERATED);
        itemModelGenerator.register(ItemList.THOUNITE_INGOT, Models.GENERATED);
        //itemModelGenerator.register(ItemList.THOUNITE_KNIFE, Models.GENERATED);
        itemModelGenerator.register(ItemList.THOUNITE_LEGS, Models.GENERATED);
        itemModelGenerator.register(ItemList.THOUNITE_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ItemList.THOUNITE_PAXEL, Models.GENERATED);
        itemModelGenerator.register(ItemList.THOUNITE_PICKAXE, Models.GENERATED);
        itemModelGenerator.register(ItemList.THOUNITE_SHOVEL, Models.GENERATED);
        itemModelGenerator.register(ItemList.THOUNITE_SWORD, Models.GENERATED);

    }
}
