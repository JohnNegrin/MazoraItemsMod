package ruu.mazoraitems.items.trinketItems;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;

import java.util.UUID;

public class AriphronFarmerPendantItem extends TrinketItem {
    public AriphronFarmerPendantItem(Settings settings) {
        super(settings);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);

        modifiers.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(uuid, "mazoraitems:armor",0.1, EntityAttributeModifier.Operation.ADDITION));
        modifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(uuid, "mazoraitems:physical_damage",0.1, EntityAttributeModifier.Operation.ADDITION));

        return modifiers;
    }
}
