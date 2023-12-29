package ruu.mazoraitems;

import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameter;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.util.JsonSerializer;

import java.util.Set;

public class InInventoryLootCondition implements LootCondition {

    final ItemPredicate predicate;

    public InInventoryLootCondition(ItemPredicate predicate) {
        this.predicate = predicate;
    }
    @Override
    public LootConditionType getType() {
        return MazoraConditions.IS_IN_INVENTORY_CONDITION;
    }
    public Set<LootContextParameter<?>> getRequiredParameters() {
        return ImmutableSet.of(LootContextParameters.THIS_ENTITY);
    }

    @Override
    public boolean test(LootContext lootContext) {
        Entity thisEntity = lootContext.get(LootContextParameters.THIS_ENTITY);
        if (thisEntity.isPlayer()){
            PlayerEntity playerEntity = (PlayerEntity) thisEntity;
            int inventorySize = playerEntity.getInventory().size();
            ItemStack[] inventory = new ItemStack[inventorySize];

            for (int i = 0; i < inventorySize;i++){
                inventory[i] = playerEntity.getInventory().getStack(i);
            }

            for (ItemStack itemStack:inventory) {
                if (predicate.test(itemStack)){
                    return true;
                }
            }
        }
        return false;
    }

    public static class Serializer implements JsonSerializer<InInventoryLootCondition> {
        public Serializer() {
        }
        @Override
        public void toJson(JsonObject jsonObject, InInventoryLootCondition inInventoryLootCondition, JsonSerializationContext jsonSerializationContext) {
            jsonObject.add("predicate", inInventoryLootCondition.predicate.toJson());
        }
        public InInventoryLootCondition fromJson(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            ItemPredicate itemPredicate = ItemPredicate.fromJson(jsonObject.get("predicate"));
            return new InInventoryLootCondition(itemPredicate);
        }
    }


}
