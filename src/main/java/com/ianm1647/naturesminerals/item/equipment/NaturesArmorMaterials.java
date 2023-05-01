package com.ianm1647.naturesminerals.item.equipment;

import com.ianm1647.naturesminerals.item.ItemList;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum NaturesArmorMaterials implements ArmorMaterial {
    UVAROVITE("uvarovite", 40, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 4);
        map.put(ArmorItem.Type.LEGGINGS, 7);
        map.put(ArmorItem.Type.CHESTPLATE, 9);
        map.put(ArmorItem.Type.HELMET, 4);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            3.5F, 0.2F, () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.UVAROVITE_INGOT})),
    KUNZITE("kunzite", 42, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 5);
        map.put(ArmorItem.Type.LEGGINGS, 8);
        map.put(ArmorItem.Type.CHESTPLATE, 10);
        map.put(ArmorItem.Type.HELMET, 5);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            4.0F, 0.3F, () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.KUNZITE_INGOT})),
    STIBNITE("stibnite", 46, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 6);
        map.put(ArmorItem.Type.LEGGINGS, 9);
        map.put(ArmorItem.Type.CHESTPLATE, 11);
        map.put(ArmorItem.Type.HELMET, 6);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            4.5F, 0.4F, () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.STIBNITE_INGOT})),
    ASTRITE("astrite", 50, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 7);
        map.put(ArmorItem.Type.LEGGINGS, 10);
        map.put(ArmorItem.Type.CHESTPLATE, 12);
        map.put(ArmorItem.Type.HELMET, 7);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            5.0F, 0.5F, () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.ASTRITE_INGOT})),
    THOUNITE( "thounite", 60, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 10);
        map.put(ArmorItem.Type.LEGGINGS, 13);
        map.put(ArmorItem.Type.CHESTPLATE, 15);
        map.put(ArmorItem.Type.HELMET, 10);
    }), 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            8.0F, 0.8F, () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.THOUNITE_INGOT}));


    private static final EnumMap<ArmorItem.Type, Integer> BASE_DURABILITY = (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 13);
        map.put(ArmorItem.Type.LEGGINGS, 15);
        map.put(ArmorItem.Type.CHESTPLATE, 16);
        map.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionAmounts;;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    NaturesArmorMaterials(String name, int durabilityMultiplier, EnumMap protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(ArmorItem.Type type) { return BASE_DURABILITY.get(type) * this.durabilityMultiplier; }

    public int getProtection(ArmorItem.Type type) { return this.protectionAmounts.get(type); }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
