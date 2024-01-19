/*

Not used but helpful to see potions and how they might be implemented
deprecated due to potions textures needing to be changed in resource packs
package ruu.mazoraitems.potions;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ruu.mazoraitems.MazoraItemsMod;
import ruu.mazoraitems.effects.ModEffects;

public class ModPotions {
    public static Potion farmersAle = registerItem("farmers_ale");
    public static StatusEffectInstance farmersAleTipsy = new StatusEffectInstance(ModEffects.TIPSY, 30, 0);

    private static Potion registerItem(String name) {
        return Registry.register(Registries.POTION, new Identifier(MazoraItemsMod.modID, name), new Potion(new StatusEffectInstance[]
                {new StatusEffectInstance(ModEffects.TIPSY, 30, 0),
                 new StatusEffectInstance(StatusEffects.NAUSEA, 30, 0),
                 new StatusEffectInstance(StatusEffects.LUCK, 30, 0)
                }));
    }

    public static void registerPotions(){
        MazoraItemsMod.LOGGER.info("Registering Mod Potions for " + MazoraItemsMod.modID);
    }
}
*/
