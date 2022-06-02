package com.ianm1647.naturesminerals.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodComponents {

    public static FoodComponent UVAROVITE_APPLE = foodComponent()
            .statusEffect(effect(StatusEffects.ABSORPTION, 750, 1), 1.0f)
            .statusEffect(effect(StatusEffects.STRENGTH, 750, 1), 1.0f)
            .alwaysEdible()
            .build();

    public static FoodComponent KUNZITE_APPLE = foodComponent()
            .statusEffect(effect(StatusEffects.ABSORPTION, 750, 1), 1.0f)
            .statusEffect(effect(StatusEffects.RESISTANCE, 750, 1), 1.0f)
            .alwaysEdible()
            .build();

    public static FoodComponent STIBNITE_APPLE = foodComponent()
            .statusEffect(effect(StatusEffects.ABSORPTION, 750, 1), 1.0f)
            .statusEffect(effect(StatusEffects.FIRE_RESISTANCE, 750, 1), 1.0f)
            .statusEffect(effect(StatusEffects.JUMP_BOOST, 750, 1), 1.0f)
            .alwaysEdible()
            .build();

    public static FoodComponent ASTRITE_APPLE = foodComponent()
            .statusEffect(effect(StatusEffects.ABSORPTION, 750, 1), 1.0f)
            .statusEffect(effect(StatusEffects.HASTE, 750, 1), 1.0f)
            .statusEffect(effect(StatusEffects.SPEED, 750, 1), 1.0f)
            .alwaysEdible()
            .build();

    public static FoodComponent THOUNITE_APPLE = foodComponent()
            .statusEffect(effect(StatusEffects.ABSORPTION, 750, 1), 1.0f)
            .statusEffect(effect(StatusEffects.WATER_BREATHING, 750, 1), 1.0f)
            .statusEffect(effect(StatusEffects.SLOW_FALLING, 750, 1), 1.0f)
            .statusEffect(effect(StatusEffects.INVISIBILITY, 750, 1), 1.0f)
            .alwaysEdible()
            .build();


    private static FoodComponent.Builder foodComponent() {
        return new FoodComponent.Builder().hunger(4).saturationModifier(1.2F);
    }

    private static StatusEffectInstance effect(StatusEffect statusEffect, int duration, int amplifier) {
        return new StatusEffectInstance(statusEffect, duration, amplifier);
    }
}
