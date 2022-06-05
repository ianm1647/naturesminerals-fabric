package com.ianm1647.naturesminerals.item.equipment.tools;

import com.ianm1647.naturesminerals.item.ItemList;
import net.minecraft.entity.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class ModSwordItem extends SwordItem {

    public ModSwordItem(ToolMaterial material, Settings settings) {
        super(material, 3, -2.4F, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        World world = target.getWorld();
        if (stack.isOf(ItemList.THOUNITE_SWORD)) {
            LightningEntity lightning = EntityType.LIGHTNING_BOLT.create(target.getWorld());
            lightning.move(MovementType.SELF, target.getPos());
            world.spawnEntity(lightning);
        }
        if (stack.isOf(ItemList.UVAROVITE_SWORD)) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 800, 0));
        }
        if (stack.isOf(ItemList.KUNZITE_SWORD)) {
            attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 250, (int) (target.getHealth() / 5), false, false, false));
        }
        return false;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity instanceof PlayerEntity) {
            Hand hand = ((PlayerEntity) entity).getActiveHand();
            ItemStack mainStack = ((PlayerEntity) entity).getStackInHand(hand);
            if (mainStack.isOf(ItemList.ASTRITE_SWORD)) {
                ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 0, 1, false, false, false));
            }
            if (mainStack.isOf(ItemList.STIBNITE_SWORD)) {
                if (world.getDimension().isUltrawarm()) {
                    ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 0, 2, false, false, false));
                }
            }
            if (mainStack.isOf(ItemList.THOUNITE_SWORD)) {
                if (world.isThundering()) {
                    ((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 0, 3, false, false, false));
                }
            }
        }
    }
}
