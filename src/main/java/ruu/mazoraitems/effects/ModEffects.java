package ruu.mazoraitems.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ruu.mazoraitems.MazoraItemsMod;

public class ModEffects  {
    public static StatusEffect TIPSY = registerStatusEffect("tipsy", new TipsyStatusEffect(StatusEffectCategory.NEUTRAL,16444821));

    private static StatusEffect registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(MazoraItemsMod.modID, name), statusEffect);
    }

    public static void registerEffects(){
        MazoraItemsMod.LOGGER.info("Registering Mod Effects for " + MazoraItemsMod.modID);
    }
}
