package com.ianm1647.naturesminerals.world;

import com.ianm1647.naturesminerals.world.feature.FeatureList;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

import java.util.function.Predicate;

public class OreGeneration {

    public static void generateFeature() {
        generateOre(BiomeSelectors.categories(Biome.Category.DESERT), FeatureList.UVAROVITE_ORE_PLACED.getKey().get());
        generateOre(BiomeSelectors.categories(Biome.Category.SAVANNA), FeatureList.KUNZITE_ORE_PLACED.getKey().get());
        generateOre(BiomeSelectors.categories(Biome.Category.NETHER), FeatureList.STIBNITE_ORE_PLACED.getKey().get());
        generateOre(BiomeSelectors.categories(Biome.Category.THEEND), FeatureList.ASTRITE_ORE_PLACED.getKey().get());

    }

    private static void generateOre(Predicate<BiomeSelectionContext> biome, RegistryKey<PlacedFeature> feature) {
        BiomeModifications.addFeature(biome, GenerationStep.Feature.UNDERGROUND_ORES, feature);
    }
}
