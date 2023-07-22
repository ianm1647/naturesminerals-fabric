package com.ianm1647.naturesminerals.data;

import com.ianm1647.naturesminerals.block.BlockList;
import com.ianm1647.naturesminerals.item.ItemList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(BlockList.NETHERITE_BRICKS);
        addDrop(BlockList.SCORCHED_COAL_BLOCK);
        addDrop(BlockList.UVAROVITE_ORE, oreDrops(BlockList.UVAROVITE_ORE, ItemList.RAW_UVAROVITE));
        addDrop(BlockList.DEEPSLATE_UVAROVITE_ORE, oreDrops(BlockList.DEEPSLATE_UVAROVITE_ORE, ItemList.RAW_UVAROVITE));
        addDrop(BlockList.KUNZITE_ORE, oreDrops(BlockList.KUNZITE_ORE, ItemList.RAW_KUNZITE));
        addDrop(BlockList.DEEPSLATE_KUNZITE_ORE, oreDrops(BlockList.DEEPSLATE_KUNZITE_ORE, ItemList.RAW_KUNZITE));
        addDrop(BlockList.STIBNITE_ORE, oreDrops(BlockList.STIBNITE_ORE, ItemList.RAW_STIBNITE));
        addDrop(BlockList.ASTRITE_ORE, oreDrops(BlockList.ASTRITE_ORE, ItemList.RAW_ASTRITE));
        addDrop(BlockList.UVAROVITE_BLOCK);
        addDrop(BlockList.KUNZITE_BLOCK);
        addDrop(BlockList.STIBNITE_BLOCK);
        addDrop(BlockList.ASTRITE_BLOCK);
        addDrop(BlockList.THOUNITE_BLOCK);
        addDrop(BlockList.RAW_UVAROVITE_BLOCK);
        addDrop(BlockList.RAW_KUNZITE_BLOCK);
        addDrop(BlockList.RAW_STIBNITE_BLOCK);
        addDrop(BlockList.RAW_ASTRITE_BLOCK);

    }
}
