package ruu.mazoraitems.Items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ruu.mazoraitems.MazoraItemsMod;

public class ModItems {

    public static final Item bronzeCoin = registerItem("bronze_coin", new BronzeCoinItem(new FabricItemSettings()));
    public static final Item woodenBucket = registerItem("wooden_bucket", new WoodenBucketItem(new FabricItemSettings()));
    public static final Item woodenPoopBucket = registerItem("wooden_poop_bucket", new WoodenPoopBucketItem(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MazoraItemsMod.modID, name), item);
    }

    public static void registerItems(){
        MazoraItemsMod.LOGGER.info("Registering Mod Items for " + MazoraItemsMod.modID);
    }
}
