package com.ianm1647.naturesminerals.item.equipment.tools;

import com.ianm1647.naturesminerals.item.ItemList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class ModHoeItem extends HoeItem {

    public ModHoeItem(ToolMaterial material, Settings settings) {
        super(material, 0, -3.0f, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity) {
            Hand hand = ((PlayerEntity) entity).getActiveHand();
            ItemStack mainStack = ((PlayerEntity) entity).getStackInHand(hand);
            if (mainStack.isOf(ItemList.ASTRITE_HOE)) {
                if (entity.isSneaking()) {
                    ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 0, 2, false, false, false));
                }
                ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 0, 1, false, false, false));
            }
            if (mainStack.isOf(ItemList.THOUNITE_HOE)) {
                if (world.isThundering()) {
                    ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 0, 3, false, false, false));
                }
            }
            if (mainStack.isOf(ItemList.STIBNITE_HOE)) {
                if (world.getDimension().ultrawarm()) {
                    ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 0, 1, false, false, false));
                }
            }
        }
    }
}
