package ruu.mazoraitems.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import ruu.mazoraitems.MazoraItemsMod;

public class ModItemGroups {
    public static final ItemGroup mazoraItemsGroup = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MazoraItemsMod.modID, "mazoraitemsgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.mazoraitemsgroup"))
                    .icon(() -> new ItemStack(ModItems.bronzeCoin)).entries((displayContext, entries) -> {
                        entries.add(ModItems.bronzeCoin);
                        entries.add(ModItems.woodenBucket);
                        entries.add(ModItems.woodenPoopBucket);
                        entries.add(ModItems.woodenMug);
                        entries.add(ModItems.farmersAle);
                        entries.add(ModItems.ariphronFarmerPendant);
                    }).build());

    public static void registerItemGroups() {
        MazoraItemsMod.LOGGER.info("Registering Item Groups for " + MazoraItemsMod.modID);
    }
}
