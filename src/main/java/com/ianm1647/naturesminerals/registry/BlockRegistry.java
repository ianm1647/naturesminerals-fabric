package com.ianm1647.naturesminerals.registry;

import com.ianm1647.naturesminerals.NaturesMinerals;
import com.ianm1647.naturesminerals.block.BlockList;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    public static void registerBlocks() {
        BlockList.NETHERITE_BRICKS = block("netherite_bricks",
                new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.NETHERITE)));

        BlockList.SCORCHED_COAL_BLOCK = block("scorched_coal_block",
                new Block(blockSettings(Material.STONE, 2.0F, 3.0F, BlockSoundGroup.STONE)));

        BlockList.UVAROVITE_ORE = block("uvarovite_ore",
                new OreBlock(blockSettings(Material.STONE, 4.0F, 6.0F, BlockSoundGroup.STONE),
                        UniformIntProvider.create(5, 9)));
        BlockList.DEEPSLATE_UVAROVITE_ORE = block("deepslate_uvarovite_ore",
                new OreBlock(blockSettings(Material.STONE, 4.0F, 6.0F, BlockSoundGroup.DEEPSLATE),
                        UniformIntProvider.create(5, 9)));
        BlockList.RAW_UVAROVITE_BLOCK = block("raw_uvarovite_block",
                new Block(blockSettings(Material.STONE, 4.0F, 6.0F, BlockSoundGroup.STONE)));
        BlockList.UVAROVITE_BLOCK = block("uvarovite_block",
                new Block(blockSettings(Material.METAL, 4.0F, 6.0F, BlockSoundGroup.METAL)));

        BlockList.KUNZITE_ORE = block("kunzite_ore",
                new OreBlock(blockSettings(Material.STONE, 6.0F,6.0F, BlockSoundGroup.STONE),
                    UniformIntProvider.create(6, 10)));
        BlockList.DEEPSLATE_KUNZITE_ORE = block("deepslate_kunzite_ore",
                new OreBlock(blockSettings(Material.STONE, 6.0F, 6.0F, BlockSoundGroup.DEEPSLATE),
                    UniformIntProvider.create(6, 10)));
        BlockList.RAW_KUNZITE_BLOCK = block("raw_kunzite_block",
                new Block(blockSettings(Material.STONE, 6.0F, 6.0F, BlockSoundGroup.STONE)));
        BlockList.KUNZITE_BLOCK = block("kunzite_block",
                new Block(blockSettings(Material.METAL, 6.0F, 6.0F, BlockSoundGroup.METAL)));

        BlockList.STIBNITE_ORE = block("stibnite_ore",
                new OreBlock(blockSettings(Material.STONE, 7.0F, 8.0F, BlockSoundGroup.STONE),
                    UniformIntProvider.create(7, 11)));
        BlockList.RAW_STIBNITE_BLOCK = block("raw_stibnite_block",
                new Block(blockSettings(Material.STONE, 7.0F, 8.0F, BlockSoundGroup.STONE)));
        BlockList.STIBNITE_BLOCK = block("stibnite_block",
                new Block(blockSettings(Material.METAL, 7.0F, 8.0F, BlockSoundGroup.METAL)));

        BlockList.ASTRITE_ORE = block("astrite_ore",
                new OreBlock(blockSettings(Material.STONE, 8.0F, 9.0F, BlockSoundGroup.STONE),
                    UniformIntProvider.create(8, 12)));
        BlockList.RAW_ASTRITE_BLOCK = block("raw_astrite_block",
                new Block(blockSettings(Material.STONE, 8.0F, 9.0F, BlockSoundGroup.STONE)));
        BlockList.ASTRITE_BLOCK = block("astrite_block",
                new Block(blockSettings(Material.METAL, 8.0F, 9.0F, BlockSoundGroup.METAL)));

        BlockList.THOUNITE_BLOCK = block("thounite_block",
                new Block(blockSettings(Material.METAL, 10.0F, 12.0F, BlockSoundGroup.METAL)));
    }

    private static FabricBlockSettings blockSettings(Material material, float hardness, float resistance, BlockSoundGroup sound) {
        return FabricBlockSettings.of(material).strength(hardness, resistance).sounds(sound).requiresTool();
    }

    private static Block block(String name, Block block) {
        blockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(NaturesMinerals.MODID, name), block);
    }

    private static Item blockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(NaturesMinerals.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(NaturesMinerals.GROUP)));
    }
}
