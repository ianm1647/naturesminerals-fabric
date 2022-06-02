package com.ianm1647.naturesminerals.item.equipment.tools;

import com.ianm1647.naturesminerals.item.ItemList;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class ModAxeItem extends AxeItem {

    public ModAxeItem(ToolMaterial material, Settings settings) {
        super(material, 6.0F, -3.0F, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (stack.isOf(ItemList.THOUNITE_AXE)) {
            LightningEntity lightning = EntityType.LIGHTNING_BOLT.create(target.getWorld());
            lightning.move(MovementType.SELF, target.getPos());
            target.getWorld().spawnEntity(lightning);
        }
        if (stack.isOf(ItemList.UVAROVITE_AXE)) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 800, 0));
        }
        if (stack.isOf(ItemList.KUNZITE_AXE)) {
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 250, (int) (target.getHealth() / 5), false, false, false));
        }
        return false;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity) {
            if (stack.isOf(ItemList.ASTRITE_AXE)) {
                if (entity.isSneaking()) {
                    ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 0, 2, false, false, false));
                }
                ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 0, 1, false, false, false));
            }
            if (stack.isOf(ItemList.THOUNITE_AXE)) {
                if (world.isThundering()) {
                    ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 0, 3, false, false, false));
                }
            }
            if (stack.isOf(ItemList.STIBNITE_AXE)) {
                if (world.getDimension().isUltrawarm()) {
                    ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 0, 1, false, false, false));
                    ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 0, 2, false, false, false));
                }
            }
            if (stack.isOf(ItemList.THOUNITE_AXE)) {
                if (world.isThundering()) {
                    ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 0, 3, false, false, false));
                }
            }
        }
    }
}
