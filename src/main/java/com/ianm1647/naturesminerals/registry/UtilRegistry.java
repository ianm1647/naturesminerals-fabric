package com.ianm1647.naturesminerals.registry;

import com.ianm1647.naturesminerals.block.BlockList;
import com.ianm1647.naturesminerals.item.ItemList;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class UtilRegistry {

    public static void registerUtils() {
        fuels();
    }

    public static void fuels() {
        FuelRegistry.INSTANCE.add(ItemList.SCORCHED_COAL, 28000);
        FuelRegistry.INSTANCE.add(BlockList.SCORCHED_COAL_BLOCK, 252000);
    }
}
