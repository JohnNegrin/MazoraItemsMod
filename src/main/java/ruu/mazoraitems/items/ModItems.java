package ruu.mazoraitems.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ruu.mazoraitems.MazoraItemsMod;
import ruu.mazoraitems.items.trinketItems.AriphronFarmerPendantItem;

public class ModItems {

    public static final Item bronzeCoin = registerItem("bronze_coin", new BronzeCoinItem(new FabricItemSettings()));
    public static final Item woodenBucket = registerItem("wooden_bucket", new WoodenBucketItem(new FabricItemSettings()));
    public static final Item woodenPoopBucket = registerItem("wooden_poop_bucket", new WoodenPoopBucketItem(new FabricItemSettings()));
    public static final Item woodenMug = registerItem("wooden_mug", new WoodenMugItem(new FabricItemSettings()));
    public static final Item farmersAle = registerItem("farmers_ale", new FarmersAleItem(new FabricItemSettings().food(ModFoodComponents.farmersAle)));
    public static final Item ariphronFarmerPendant = registerItem("ariphron_farmer_pendant", new AriphronFarmerPendantItem(new FabricItemSettings().maxCount(1)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MazoraItemsMod.modID, name), item);
    }

    public static void registerItems(){
        MazoraItemsMod.LOGGER.info("Registering Mod Items for " + MazoraItemsMod.modID);
    }
}
