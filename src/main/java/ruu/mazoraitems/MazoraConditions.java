package ruu.mazoraitems;

import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MazoraConditions {
    public static final LootConditionType IS_IN_INVENTORY_CONDITION = new LootConditionType(new InInventoryLootCondition.Serializer());


    public static void registerLootConditionTypes(){
        MazoraItemsMod.LOGGER.info("Registering Mod Loot Conditions for " + MazoraItemsMod.modID);
        Registry.register(Registries.LOOT_CONDITION_TYPE,new Identifier(MazoraItemsMod.modID, "is_in_inventory"),IS_IN_INVENTORY_CONDITION);
    }
}
