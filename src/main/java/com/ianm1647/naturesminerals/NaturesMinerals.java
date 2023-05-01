package com.ianm1647.naturesminerals;

import com.ianm1647.naturesminerals.item.ItemList;
import com.ianm1647.naturesminerals.registry.BlockRegistry;
import com.ianm1647.naturesminerals.registry.ItemRegistry;
import com.ianm1647.naturesminerals.registry.UtilRegistry;
import com.ianm1647.naturesminerals.world.ModOreGeneration;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NaturesMinerals implements ModInitializer {
	public static final String MODID = "naturesminerals";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	public static final ItemGroup GROUP = FabricItemGroup.builder(new Identifier(NaturesMinerals.MODID, "group"))
			.icon(() -> new ItemStack(ItemList.KUNZITE_INGOT)).build();

	@Override
	public void onInitialize() {
		ItemRegistry.registerItems();
		BlockRegistry.registerBlocks();
		ModOreGeneration.generateOres();
		UtilRegistry.registerUtils();
		LOGGER.info("Natures Minerals loaded");
	}
}
