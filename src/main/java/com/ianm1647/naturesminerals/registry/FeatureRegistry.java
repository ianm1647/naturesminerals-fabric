package com.ianm1647.naturesminerals.registry;

import com.ianm1647.naturesminerals.NaturesMinerals;
import com.ianm1647.naturesminerals.block.BlockList;
import com.ianm1647.naturesminerals.config.NaturesMineralsConfig;
import com.ianm1647.naturesminerals.world.OreGeneration;
import com.ianm1647.naturesminerals.world.feature.FeatureList;
import com.ianm1647.naturesminerals.world.feature.ModOreFeature;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

import java.util.List;

public class FeatureRegistry {

    private static int UVARMAX = 20; //NaturesMinerals.CONFIG.uvaroviteMaxHeight;//20
    private static int UVARMIN = -20; //NaturesMinerals.CONFIG.uvaroviteMinHeight; //-20
    private static int UVARVEIN = 5; //NaturesMinerals.CONFIG.uvaroviteVeinSize; //5
    private static int UVARCHUNK = 4; //NaturesMinerals.CONFIG.uvaroviteVeinsPerChunk; //8

    private static int KUNZITEMAX = -20; //NaturesMinerals.CONFIG.kunziteMaxHeight; //-20
    private static int KUNZITEMIN = -60; //NaturesMinerals.CONFIG.kunziteMinHeight; //-60
    private static int KUNZITEVEIN = 4; //NaturesMinerals.CONFIG.kunziteVeinSize; //4
    private static int KUNZITECHUNK = 4; //NaturesMinerals.CONFIG.kunziteVeinsPerChunk; //5

    private static int STIBNITEMAX = 256; //NaturesMinerals.CONFIG.stibniteMaxHeight; //256
    private static int STIBNITEMIN = 0; //NaturesMinerals.CONFIG.stibniteMinHeight; //0
    private static int STIBNITEVEIN = 3; //NaturesMinerals.CONFIG.stibniteVeinSize; //3
    private static int STIBNITECHUNK = 4; //NaturesMinerals.CONFIG.stibniteVeinsPerChunk; //4

    private static int ASTRITEMAX = 256; //NaturesMinerals.CONFIG.astriteMaxHeight; //256
    private static int ASTRITEMIN = 0; //NaturesMinerals.CONFIG.astriteMinHeight; //0
    private static int ASTRITEVEIN = 3; //NaturesMinerals.CONFIG.astriteVeinSize; //3
    private static int ASTRITECHUNK = 4; //NaturesMinerals.CONFIG.astriteVeinsPerChunk; //4

    public static void registerFeatures() {
        FeatureList.UVAROVITE_LIST = overworldOres(BlockList.UVAROVITE_ORE.getDefaultState(), BlockList.DEEPSLATE_UVAROVITE_ORE.getDefaultState());
        FeatureList.KUNZITE_LIST = overworldOres(BlockList.KUNZITE_ORE.getDefaultState(), BlockList.DEEPSLATE_KUNZITE_ORE.getDefaultState());
        FeatureList.STIBNITE_LIST = netherOres(BlockList.STIBNITE_ORE.getDefaultState());
        FeatureList.ASTRITE_LIST = endOres(BlockList.ASTRITE_ORE.getDefaultState());

        FeatureList.UVAROVITE_ORE = featureOre("uvarovite_ore_feature", FeatureList.UVAROVITE_LIST, UVARVEIN);
        FeatureList.KUNZITE_ORE = featureOre("kunzite_ore_feature", FeatureList.KUNZITE_LIST, KUNZITEVEIN);
        FeatureList.STIBNITE_ORE = featureOre("stibnite_ore_feature", FeatureList.STIBNITE_LIST, STIBNITEVEIN);
        FeatureList.ASTRITE_ORE = featureOre("astrite_ore_feature", FeatureList.ASTRITE_LIST, ASTRITEVEIN);

        FeatureList.UVAROVITE_ORE_PLACED = placedOre("uvarovite_ore_placed", FeatureList.UVAROVITE_ORE, UVARCHUNK, UVARMIN, UVARMAX);
        FeatureList.KUNZITE_ORE_PLACED = placedOre("kunzite_ore_placed", FeatureList.KUNZITE_ORE, KUNZITECHUNK, KUNZITEMIN, KUNZITEMAX);
        FeatureList.STIBNITE_ORE_PLACED = placedOre("stibnite_ore_placed", FeatureList.STIBNITE_ORE, STIBNITECHUNK, STIBNITEMIN, STIBNITEMAX);
        FeatureList.ASTRITE_ORE_PLACED = placedOre("astrite_ore_placed", FeatureList.ASTRITE_ORE, ASTRITECHUNK, ASTRITEMIN, ASTRITEMAX);

        OreGeneration.generateFeature();
    }

    private static List<OreFeatureConfig.Target> overworldOres(BlockState stoneBlock, BlockState deepslateBlock) {
        return List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, stoneBlock),
                OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, deepslateBlock));
    }

    private static List<OreFeatureConfig.Target> netherOres(BlockState stoneBlock) {
        return List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, stoneBlock));
    }

    private static List<OreFeatureConfig.Target> endOres(BlockState stoneBlock) {
        return List.of(OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), stoneBlock));
    }

    private static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> featureOre(String name, List<OreFeatureConfig.Target> list, int size) {
        return ConfiguredFeatures.register(name, Feature.ORE, new OreFeatureConfig(list, size));
    }

    private static RegistryEntry<PlacedFeature> placedOre(String name, RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> configuredFeature, int count, int minHeight, int maxHeight) {
        return PlacedFeatures.register(name, configuredFeature, ModOreFeature.modifiersWithCount(count,
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(minHeight), YOffset.fixed(maxHeight))));
    }
}
