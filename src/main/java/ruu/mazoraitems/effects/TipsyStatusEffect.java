package ruu.mazoraitems.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class TipsyStatusEffect extends StatusEffect {
    protected TipsyStatusEffect(StatusEffectCategory category, int color) {

        super(category, color);
        this.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "85e9b087-6273-4264-a772-0dfcea4bd854", -0.2f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        this.addAttributeModifier(EntityAttributes.GENERIC_LUCK, "03C3C89D-7037-4B42-869F-B146BCB64D2E", 1.0, EntityAttributeModifier.Operation.ADDITION);
        this.addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, "a3dc3399-0a78-4672-9a2e-e88ba95c4508", -0.5, EntityAttributeModifier.Operation.ADDITION);
    }

    @Override
    public boolean canApplyUpdateEffect(int remainingDuration, int amplifier) {
        return remainingDuration % 30 == 0;
    }
}