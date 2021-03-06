package com.ianm1647.naturesminerals.item.equipment;

import com.ianm1647.naturesminerals.item.ItemList;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum NaturesToolMaterials implements ToolMaterial {
    UVAROVITE(5, 1500, 10.0F, 6.0F, 15,
            () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.UVAROVITE_INGOT})),
    KUNZITE(6, 2000, 11.0F, 7.0F, 15,
            () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.KUNZITE_INGOT})),
    STIBNITE(7, 2400, 12.0F, 8.0F, 15,
            () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.STIBNITE_INGOT})),
    ASTRITE(8, 3200, 13.0F, 9.0F, 15,
            () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.ASTRITE_INGOT})),
    THOUNITE(9, 5000, 14.0F, 12.0F, 25,
            () -> Ingredient.ofItems(new ItemConvertible[]{ItemList.THOUNITE_INGOT}));


    private final int miningLevel;
    private final int durability;
    private final float blockBreakSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    NaturesToolMaterials(int miningLevel, int durability, float blockBreakSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.durability = durability;
        this.blockBreakSpeed = blockBreakSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability() {
        return this.durability;
    }

    public float getMiningSpeedMultiplier() {
        return this.blockBreakSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
