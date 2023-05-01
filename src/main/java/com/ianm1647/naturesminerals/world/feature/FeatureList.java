package com.ianm1647.naturesminerals.world.feature;

import com.ianm1647.naturesminerals.NaturesMinerals;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;

public class FeatureList {
    public static RegistryKey<ConfiguredFeature<?, ?>> UVAROVITE_ORE = registerConfiguredKey("uvarovite_ore");
    public static RegistryKey<PlacedFeature> UVAROVITE_ORE_PLACED = registerPlacedKey("uvarovite_ore_placed");

    public static RegistryKey<ConfiguredFeature<?, ?>> KUNZITE_ORE = registerConfiguredKey("kunzite_ore");
    public static RegistryKey<PlacedFeature> KUNZITE_ORE_PLACED = registerPlacedKey("kunzite_ore_placed");;

    public static RegistryKey<ConfiguredFeature<?, ?>> STIBNITE_ORE = registerConfiguredKey("stibnite_ore");
    public static RegistryKey<PlacedFeature> STIBNITE_ORE_PLACED = registerPlacedKey("stibnite_ore_placed");

    public static RegistryKey<ConfiguredFeature<?, ?>> ASTRITE_ORE = registerConfiguredKey("astrite_ore");
    public static RegistryKey<PlacedFeature> ASTRITE_ORE_PLACED = registerPlacedKey("astrite_ore_placed");

    public static RegistryKey<ConfiguredFeature<?, ?>> registerConfiguredKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(NaturesMinerals.MODID, name));
    }

    public static RegistryKey<PlacedFeature> registerPlacedKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(NaturesMinerals.MODID, name));
    }
}
