package ruu.mazoraitems;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ruu.mazoraitems.Items.ModItemGroups;
import ruu.mazoraitems.Items.ModItems;

public class MazoraItemsMod implements ModInitializer {
	public static final String modID = "mazoraitems";
    public static final Logger LOGGER = LoggerFactory.getLogger(modID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerItems();
		MazoraConditions.registerLootConditionTypes();
	}
}