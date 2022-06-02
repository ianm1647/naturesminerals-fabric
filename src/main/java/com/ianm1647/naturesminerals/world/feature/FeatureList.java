package com.ianm1647.naturesminerals.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.List;

public class FeatureList {
    public static List<OreFeatureConfig.Target> UVAROVITE_LIST;
    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> UVAROVITE_ORE;
    public static RegistryEntry<PlacedFeature> UVAROVITE_ORE_PLACED;

    public static List<OreFeatureConfig.Target> KUNZITE_LIST;
    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> KUNZITE_ORE;
    public static RegistryEntry<PlacedFeature> KUNZITE_ORE_PLACED;

    public static List<OreFeatureConfig.Target> STIBNITE_LIST;
    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> STIBNITE_ORE;
    public static RegistryEntry<PlacedFeature> STIBNITE_ORE_PLACED;

    public static List<OreFeatureConfig.Target> ASTRITE_LIST;
    public static RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ASTRITE_ORE;
    public static RegistryEntry<PlacedFeature> ASTRITE_ORE_PLACED;
}
