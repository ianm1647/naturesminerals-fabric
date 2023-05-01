package com.ianm1647.naturesminerals.world;

import com.ianm1647.naturesminerals.world.feature.FeatureList;
import com.ianm1647.naturesminerals.world.feature.ModOreFeature;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    private static int UVARMAX = 10;
    private static int UVARMIN = -40;
    private static int UVARCHUNK = 4;

    private static int KUNZITEMAX = -20;
    private static int KUNZITEMIN = -60;
    private static int KUNZITECHUNK = 3;

    private static int STIBNITEMAX = 256;
    private static int STIBNITEMIN = 0;
    private static int STIBNITECHUNK = 3;

    private static int ASTRITEMAX = 256;
    private static int ASTRITEMIN = 0;
    private static int ASTRITECHUNK = 3;

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, FeatureList.UVAROVITE_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(FeatureList.UVAROVITE_ORE),
                ModOreFeature.modifiersWithCount(UVARCHUNK,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(UVARMIN), YOffset.fixed(UVARMAX))));
        register(context, FeatureList.KUNZITE_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(FeatureList.KUNZITE_ORE),
                ModOreFeature.modifiersWithCount(KUNZITECHUNK,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(KUNZITEMIN), YOffset.fixed(KUNZITEMAX))));
        register(context, FeatureList.STIBNITE_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(FeatureList.STIBNITE_ORE),
                ModOreFeature.modifiersWithCount(STIBNITECHUNK,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(STIBNITEMIN), YOffset.fixed(STIBNITEMAX))));
        register(context, FeatureList.ASTRITE_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(FeatureList.ASTRITE_ORE),
                ModOreFeature.modifiersWithCount(ASTRITECHUNK,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(ASTRITEMIN), YOffset.fixed(ASTRITEMAX))));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> config,
                                       List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(config, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                                RegistryEntry<ConfiguredFeature<?, ?>> config,
                                                                                                PlacementModifier... modifiers) {
        register(context, key, config, List.of(modifiers));
    }
}
