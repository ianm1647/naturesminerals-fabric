package com.ianm1647.naturesminerals.item.equipment;

import com.ianm1647.naturesminerals.NaturesMinerals;
import com.ianm1647.naturesminerals.item.ItemList;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum NaturesArmorMaterials implements ArmorMaterial {
    UVAROVITE("uvarovite", 40, new int[]{4, 7, 9, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            3.5F, 0.2F, () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.UVAROVITE_INGOT})),
    KUNZITE("kunzite", 42, new int[]{5, 8, 10, 5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            4.0F, 0.3F, () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.KUNZITE_INGOT})),
    STIBNITE("stibnite", 46, new int[]{6, 9, 11, 6}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            4.5F, 0.4F, () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.STIBNITE_INGOT})),
    ASTRITE("astrite", 50, new int[]{7, 10, 12, 7}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            5.0F, 0.5F, () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.ASTRITE_INGOT})),
    THOUNITE( "thounite", 60, new int[]{10, 13, 15, 10}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            8.0F, 0.8F, () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.THOUNITE_INGOT}));


    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    NaturesArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

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
