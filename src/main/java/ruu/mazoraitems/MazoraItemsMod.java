package ruu.mazoraitems;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ruu.mazoraitems.effects.ModEffects;
import ruu.mazoraitems.items.ModItemGroups;
import ruu.mazoraitems.items.ModItems;


public class MazoraItemsMod implements ModInitializer {
	public static final String modID = "mazoraitems";
    public static final Logger LOGGER = LoggerFactory.getLogger(modID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerItems();

		ModEffects.registerEffects();;

		MazoraConditions.registerLootConditionTypes();
	}
}