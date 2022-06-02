package com.ianm1647.naturesminerals.item.equipment.tools;

import com.ianm1647.naturesminerals.item.ItemList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class ModPickaxeItem extends PickaxeItem {

    public ModPickaxeItem(ToolMaterial material, Settings settings) {
        super(material, 1, -2.8F, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity) {
            if (stack.isOf(ItemList.ASTRITE_PICKAXE)) {
                if (entity.isSneaking()) {
                    ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 0, 2, false, false, false));
                }
                ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 0, 1, false, false, false));
            }
            if (stack.isOf(ItemList.THOUNITE_PICKAXE)) {
                if (world.isThundering()) {
                    ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 0, 3, false, false, false));
                }
            }
            if (stack.isOf(ItemList.STIBNITE_PICKAXE)) {
                if (world.getDimension().isUltrawarm()) {
                    ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 0, 1, false, false, false));
                }
            }
        }
    }
}