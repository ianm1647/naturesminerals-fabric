package com.ianm1647.naturesminerals.registry;

import com.ianm1647.naturesminerals.NaturesMinerals;
import com.ianm1647.naturesminerals.item.FoodComponents;
import com.ianm1647.naturesminerals.item.ItemList;
import com.ianm1647.naturesminerals.item.equipment.NaturesArmorMaterials;
import com.ianm1647.naturesminerals.item.equipment.NaturesToolMaterials;
import com.ianm1647.naturesminerals.item.equipment.tools.*;
import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import draylar.magna.Magna;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    public static void registerItems() {
        ItemList.SCORCHED_COAL = item("scorched_coal");

        ItemList.RAW_UVAROVITE = item("raw_uvarovite");
        ItemList.UVAROVITE_INGOT = item("uvarovite_ingot");
        ItemList.UVAROVITE_NUGGET = item("uvarovite_nugget");
        ItemList.RAW_KUNZITE = item("raw_kunzite");
        ItemList.KUNZITE_INGOT = item("kunzite_ingot");
        ItemList.KUNZITE_NUGGET = item("kunzite_nugget");
        ItemList.RAW_STIBNITE = item("raw_stibnite");
        ItemList.STIBNITE_INGOT = item("stibnite_ingot");
        ItemList.STIBNITE_NUGGET = item("stibnite_nugget");
        ItemList.RAW_ASTRITE = item("raw_astrite");
        ItemList.ASTRITE_INGOT = item("astrite_ingot");
        ItemList.ASTRITE_NUGGET = item("astrite_nugget");
        ItemList.THOUNITE_INGOT = item("thounite_ingot");
        ItemList.THOUNITE_NUGGET = item("thounite_nugget");

        ItemList.UVAROVITE_APPLE = foodItem("uvarovite_apple", FoodComponents.UVAROVITE_APPLE);
        ItemList.KUNZITE_APPLE = foodItem("kunzite_apple", FoodComponents.KUNZITE_APPLE);
        ItemList.STIBNITE_APPLE = foodItem("stibnite_apple", FoodComponents.STIBNITE_APPLE);
        ItemList.ASTRITE_APPLE = foodItem("astrite_apple", FoodComponents.ASTRITE_APPLE);
        ItemList.THOUNITE_APPLE = foodItem("thounite_apple", FoodComponents.THOUNITE_APPLE);

        ItemList.UVAROVITE_SWORD = swordItem("uvarovite_sword", NaturesToolMaterials.UVAROVITE);
        ItemList.KUNZITE_SWORD = swordItem("kunzite_sword", NaturesToolMaterials.KUNZITE);
        ItemList.STIBNITE_SWORD = swordItem("stibnite_sword", NaturesToolMaterials.STIBNITE);
        ItemList.ASTRITE_SWORD = swordItem("astrite_sword", NaturesToolMaterials.ASTRITE);
        ItemList.THOUNITE_SWORD = swordItem("thounite_sword", NaturesToolMaterials.THOUNITE);

        ItemList.UVAROVITE_SHOVEL = shovelItem("uvarovite_shovel", NaturesToolMaterials.UVAROVITE);
        ItemList.KUNZITE_SHOVEL = shovelItem("kunzite_shovel", NaturesToolMaterials.KUNZITE);
        ItemList.STIBNITE_SHOVEL = shovelItem("stibnite_shovel", NaturesToolMaterials.STIBNITE);
        ItemList.ASTRITE_SHOVEL = shovelItem("astrite_shovel", NaturesToolMaterials.ASTRITE);
        ItemList.THOUNITE_SHOVEL = shovelItem("thounite_shovel", NaturesToolMaterials.THOUNITE);

        ItemList.UVAROVITE_PICKAXE = pickaxeItem("uvarovite_pickaxe", NaturesToolMaterials.UVAROVITE);
        ItemList.KUNZITE_PICKAXE = pickaxeItem("kunzite_pickaxe", NaturesToolMaterials.KUNZITE);
        ItemList.STIBNITE_PICKAXE = pickaxeItem("stibnite_pickaxe", NaturesToolMaterials.STIBNITE);
        ItemList.ASTRITE_PICKAXE = pickaxeItem("astrite_pickaxe", NaturesToolMaterials.ASTRITE);
        ItemList.THOUNITE_PICKAXE = pickaxeItem("thounite_pickaxe", NaturesToolMaterials.THOUNITE);

        ItemList.UVAROVITE_AXE = axeItem("uvarovite_axe", NaturesToolMaterials.UVAROVITE);
        ItemList.KUNZITE_AXE = axeItem("kunzite_axe", NaturesToolMaterials.KUNZITE);
        ItemList.STIBNITE_AXE = axeItem("stibnite_axe", NaturesToolMaterials.STIBNITE);
        ItemList.ASTRITE_AXE = axeItem("astrite_axe", NaturesToolMaterials.ASTRITE);
        ItemList.THOUNITE_AXE = axeItem("thounite_axe", NaturesToolMaterials.THOUNITE);

        ItemList.UVAROVITE_HOE = hoeItem("uvarovite_hoe", NaturesToolMaterials.UVAROVITE);
        ItemList.KUNZITE_HOE = hoeItem("kunzite_hoe", NaturesToolMaterials.KUNZITE);
        ItemList.STIBNITE_HOE = hoeItem("stibnite_hoe", NaturesToolMaterials.STIBNITE);
        ItemList.ASTRITE_HOE = hoeItem("astrite_hoe", NaturesToolMaterials.ASTRITE);
        ItemList.THOUNITE_HOE = hoeItem("thounite_hoe", NaturesToolMaterials.THOUNITE);

        if (FabricLoader.getInstance().isModLoaded("farmersdelight")) {
            ItemList.UVAROVITE_KNIFE = knifeItem("uvarovite_knife", NaturesToolMaterials.UVAROVITE);
            ItemList.KUNZITE_KNIFE = knifeItem("kunzite_knife", NaturesToolMaterials.KUNZITE);
            ItemList.STIBNITE_KNIFE = knifeItem("stibnite_knife", NaturesToolMaterials.STIBNITE);
            ItemList.ASTRITE_KNIFE = knifeItem("astrite_knife", NaturesToolMaterials.ASTRITE);
            ItemList.THOUNITE_KNIFE = knifeItem("thounite_knife", NaturesToolMaterials.THOUNITE);
        }

        if (FabricLoader.getInstance().isModLoaded("vanilla-hammers")) {
            ItemList.UVAROVITE_HAMMER = hammerItem("uvarovite_hammer", NaturesToolMaterials.UVAROVITE,
                    new FabricItemSettings().group(NaturesMinerals.GROUP).maxDamage(NaturesToolMaterials.UVAROVITE.getDurability() * 5));
            ItemList.KUNZITE_HAMMER = hammerItem("kunzite_hammer", NaturesToolMaterials.KUNZITE,
                    new FabricItemSettings().group(NaturesMinerals.GROUP).maxDamage(NaturesToolMaterials.KUNZITE.getDurability() * 5));
            ItemList.STIBNITE_HAMMER = hammerItem("stibnite_hammer", NaturesToolMaterials.STIBNITE,
                    new FabricItemSettings().group(NaturesMinerals.GROUP).maxDamage(NaturesToolMaterials.STIBNITE.getDurability() * 5));
            ItemList.ASTRITE_HAMMER = hammerItem("astrite_hammer", NaturesToolMaterials.ASTRITE,
                    new FabricItemSettings().group(NaturesMinerals.GROUP).maxDamage(NaturesToolMaterials.ASTRITE.getDurability() * 5));
            ItemList.THOUNITE_HAMMER = hammerItem("thounite_hammer", NaturesToolMaterials.THOUNITE,
                    new FabricItemSettings().group(NaturesMinerals.GROUP).maxDamage(NaturesToolMaterials.THOUNITE.getDurability() * 5));
        }

        if (FabricLoader.getInstance().isModLoaded("vanillaexcavators")) {
            ItemList.UVAROVITE_EXCAVATOR = excavatorItem("uvarovite_excavator", NaturesToolMaterials.UVAROVITE,
                    new FabricItemSettings().group(NaturesMinerals.GROUP).maxDamage(NaturesToolMaterials.UVAROVITE.getDurability() * 5));
            ItemList.KUNZITE_EXCAVATOR = excavatorItem("kunzite_excavator", NaturesToolMaterials.KUNZITE,
                    new FabricItemSettings().group(NaturesMinerals.GROUP).maxDamage(NaturesToolMaterials.KUNZITE.getDurability() * 5));
            ItemList.STIBNITE_EXCAVATOR = excavatorItem("stibnite_excavator", NaturesToolMaterials.STIBNITE,
                    new FabricItemSettings().group(NaturesMinerals.GROUP).maxDamage(NaturesToolMaterials.STIBNITE.getDurability() * 5));
            ItemList.ASTRITE_EXCAVATOR = excavatorItem("astrite_excavator", NaturesToolMaterials.ASTRITE,
                    new FabricItemSettings().group(NaturesMinerals.GROUP).maxDamage(NaturesToolMaterials.ASTRITE.getDurability() * 5));
            ItemList.THOUNITE_EXCAVATOR = excavatorItem("thounite_excavator", NaturesToolMaterials.THOUNITE,
                    new FabricItemSettings().group(NaturesMinerals.GROUP).maxDamage(NaturesToolMaterials.THOUNITE.getDurability() * 5));
        }

        if (FabricLoader.getInstance().isModLoaded("adapaxels")) {
            ItemList.UVAROVITE_PAXEL = paxelItem("uvarovite_paxel", NaturesToolMaterials.UVAROVITE);
            ItemList.KUNZITE_PAXEL = paxelItem("kunzite_paxel", NaturesToolMaterials.KUNZITE);
            ItemList.STIBNITE_PAXEL = paxelItem("stibnite_paxel", NaturesToolMaterials.STIBNITE);
            ItemList.ASTRITE_PAXEL = paxelItem("astrite_paxel", NaturesToolMaterials.ASTRITE);
            ItemList.THOUNITE_PAXEL = paxelItem("thounite_paxel", NaturesToolMaterials.THOUNITE);
        }

        ItemList.UVAROVITE_HEAD = armorItem("uvarovite_head", NaturesArmorMaterials.UVAROVITE, EquipmentSlot.HEAD);
        ItemList.KUNZITE_HEAD = armorItem("kunzite_head", NaturesArmorMaterials.KUNZITE, EquipmentSlot.HEAD);
        ItemList.STIBNITE_HEAD = armorItem("stibnite_head", NaturesArmorMaterials.STIBNITE, EquipmentSlot.HEAD);
        ItemList.ASTRITE_HEAD = armorItem("astrite_head", NaturesArmorMaterials.ASTRITE, EquipmentSlot.HEAD);
        ItemList.THOUNITE_HEAD = armorItem("thounite_head", NaturesArmorMaterials.THOUNITE, EquipmentSlot.HEAD);

        ItemList.UVAROVITE_CHEST = armorItem("uvarovite_chest", NaturesArmorMaterials.UVAROVITE, EquipmentSlot.CHEST);
        ItemList.KUNZITE_CHEST = armorItem("kunzite_chest", NaturesArmorMaterials.KUNZITE, EquipmentSlot.CHEST);
        ItemList.STIBNITE_CHEST = armorItem("stibnite_chest", NaturesArmorMaterials.STIBNITE, EquipmentSlot.CHEST);
        ItemList.ASTRITE_CHEST = armorItem("astrite_chest", NaturesArmorMaterials.ASTRITE, EquipmentSlot.CHEST);
        ItemList.THOUNITE_CHEST = armorItem("thounite_chest", NaturesArmorMaterials.THOUNITE, EquipmentSlot.CHEST);

        ItemList.UVAROVITE_LEGS = armorItem("uvarovite_legs", NaturesArmorMaterials.UVAROVITE, EquipmentSlot.LEGS);
        ItemList.KUNZITE_LEGS = armorItem("kunzite_legs", NaturesArmorMaterials.KUNZITE, EquipmentSlot.LEGS);
        ItemList.STIBNITE_LEGS = armorItem("stibnite_legs", NaturesArmorMaterials.STIBNITE, EquipmentSlot.LEGS);
        ItemList.ASTRITE_LEGS = armorItem("astrite_legs", NaturesArmorMaterials.ASTRITE, EquipmentSlot.LEGS);
        ItemList.THOUNITE_LEGS = armorItem("thounite_legs", NaturesArmorMaterials.THOUNITE, EquipmentSlot.LEGS);

        ItemList.UVAROVITE_FEET = armorItem("uvarovite_feet", NaturesArmorMaterials.UVAROVITE, EquipmentSlot.FEET);
        ItemList.KUNZITE_FEET = armorItem("kunzite_feet", NaturesArmorMaterials.KUNZITE, EquipmentSlot.FEET);
        ItemList.STIBNITE_FEET = armorItem("stibnite_feet", NaturesArmorMaterials.STIBNITE, EquipmentSlot.FEET);
        ItemList.ASTRITE_FEET = armorItem("astrite_feet", NaturesArmorMaterials.ASTRITE, EquipmentSlot.FEET);
        ItemList.THOUNITE_FEET = armorItem("thounite_feet", NaturesArmorMaterials.THOUNITE, EquipmentSlot.FEET);

    }

    private static Item item(String name) {
        return Registry.register(Registry.ITEM, new Identifier(NaturesMinerals.MODID, name),
                new Item(new FabricItemSettings().group(NaturesMinerals.GROUP)));
    }

    private static Item foodItem(String name, FoodComponent foodComponent) {
        return Registry.register(Registry.ITEM, new Identifier(NaturesMinerals.MODID, name),
                new Item(new FabricItemSettings().group(NaturesMinerals.GROUP).food(foodComponent)));
    }

    private static Item swordItem(String name, ToolMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(NaturesMinerals.MODID, name),
                new ModSwordItem(material, new FabricItemSettings().group(NaturesMinerals.GROUP)));
    }

    private static Item shovelItem(String name, ToolMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(NaturesMinerals.MODID, name),
                new ModShovelItem(material, new FabricItemSettings().group(NaturesMinerals.GROUP)));
    }

    private static Item pickaxeItem(String name, ToolMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(NaturesMinerals.MODID, name),
                new ModPickaxeItem(material, new FabricItemSettings().group(NaturesMinerals.GROUP)));
    }

    private static Item axeItem(String name, ToolMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(NaturesMinerals.MODID, name),
                new ModAxeItem(material, new FabricItemSettings().group(NaturesMinerals.GROUP)));
    }

    private static Item hoeItem(String name, ToolMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(NaturesMinerals.MODID, name),
                new ModHoeItem(material, new FabricItemSettings().group(NaturesMinerals.GROUP)));
    }

    private static Item hammerItem(String name, ToolMaterial material, Item.Settings settings) {
        return Registry.register(Registry.ITEM, new Identifier(NaturesMinerals.MODID, name),
                new ModHammerItem(material, settings));
    }

    private static Item excavatorItem(String name, ToolMaterial material, Item.Settings settings) {
        return Registry.register(Registry.ITEM, new Identifier(NaturesMinerals.MODID, name),
                new ModExcavatorItem(material, settings));
    }

    private static Item paxelItem(String name, ToolMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(NaturesMinerals.MODID, name),
                new ModPaxelItem(material, new FabricItemSettings().group(NaturesMinerals.GROUP)));
    }

    private static Item knifeItem(String name, ToolMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(NaturesMinerals.MODID, name),
                new ModKnifeItem(material, new FabricItemSettings().group(NaturesMinerals.GROUP)));
    }

    public static Item armorItem(String name, ArmorMaterial material, EquipmentSlot slot) {
        return Registry.register(Registry.ITEM, new Identifier(NaturesMinerals.MODID, name),
                new ArmorItem(material, slot, new FabricItemSettings().group(NaturesMinerals.GROUP)));
    }
}
