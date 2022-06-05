package com.ianm1647.naturesminerals.registry;

import com.ianm1647.naturesminerals.NaturesMinerals;
import com.ianm1647.naturesminerals.block.BlockList;
import com.ianm1647.naturesminerals.config.NaturesMineralsConfig;
import com.ianm1647.naturesminerals.world.OreGeneration;
import com.ianm1647.naturesminerals.world.feature.FeatureList;
import com.ianm1647.naturesminerals.world.feature.ModOreFeature;
import dev.architectury.event.events.common.BlockEvent;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

import java.util.List;

public class FeatureRegistry {

    private static int UVARMAX = NaturesMinerals.CONFIG.uvaroviteMaxHeight;
    private static int UVARMIN = NaturesMinerals.CONFIG.uvaroviteMinHeight;
    private static int UVARVEIN = NaturesMinerals.CONFIG.uvaroviteVeinSize;
    private static int UVARCHUNK = NaturesMinerals.CONFIG.uvaroviteVeinsPerChunk;

    private static int KUNZITEMAX = NaturesMinerals.CONFIG.kunziteMaxHeight;
    private static int KUNZITEMIN = NaturesMinerals.CONFIG.kunziteMinHeight;
    private static int KUNZITEVEIN = NaturesMinerals.CONFIG.kunziteVeinSize;
    private static int KUNZITECHUNK = NaturesMinerals.CONFIG.kunziteVeinsPerChunk;

    private static int STIBNITEMAX = NaturesMinerals.CONFIG.stibniteMaxHeight;
    private static int STIBNITEMIN = NaturesMinerals.CONFIG.stibniteMinHeight;
    private static int STIBNITEVEIN = NaturesMinerals.CONFIG.stibniteVeinSize;
    private static int STIBNITECHUNK = NaturesMinerals.CONFIG.stibniteVeinsPerChunk;

    private static int ASTRITEMAX = NaturesMinerals.CONFIG.astriteMaxHeight;
    private static int ASTRITEMIN = NaturesMinerals.CONFIG.astriteMinHeight;
    private static int ASTRITEVEIN = NaturesMinerals.CONFIG.astriteVeinSize;
    private static int ASTRITECHUNK = NaturesMinerals.CONFIG.astriteVeinsPerChunk;

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
