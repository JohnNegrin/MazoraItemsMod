package ruu.mazoraitems.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import ruu.mazoraitems.effects.ModEffects;

public class ModFoodComponents {
    public static final FoodComponent farmersAle = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().
            statusEffect(new StatusEffectInstance(ModEffects.TIPSY, 600, 0), 100).
            statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 0), 100).build();
}
