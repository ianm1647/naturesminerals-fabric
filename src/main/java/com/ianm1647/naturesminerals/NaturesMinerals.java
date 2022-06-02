package com.ianm1647.naturesminerals;

import com.ianm1647.naturesminerals.item.ItemList;
import com.ianm1647.naturesminerals.registry.BlockRegistry;
import com.ianm1647.naturesminerals.registry.FeatureRegistry;
import com.ianm1647.naturesminerals.registry.ItemRegistry;
import com.ianm1647.naturesminerals.registry.UtilRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NaturesMinerals implements ModInitializer {
	public static final String MODID = "naturesminerals";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	public static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier(MODID, "group"), () -> new ItemStack(ItemList.KUNZITE_INGOT));

	@Override
	public void onInitialize() {
		ItemRegistry.registerItems();
		BlockRegistry.registerBlocks();
		FeatureRegistry.registerFeatures();
		UtilRegistry.registerUtils();
	}
}
