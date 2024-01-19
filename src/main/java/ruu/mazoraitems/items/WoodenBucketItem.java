package ruu.mazoraitems.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;


public class WoodenBucketItem extends Item {

    public WoodenBucketItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        // Gives poop bucket if entity is rabbit
        if (entity.getType() == EntityType.RABBIT){
            ItemStack itemStack2 = new ItemStack(ModItems.woodenPoopBucket,1);
            // if last bucket, get rid of and insert
            if (itemStack.getCount() == 1 && !user.getAbilities().creativeMode){
                itemStack.decrement(1);
                if (!user.getInventory().insertStack(itemStack2)) {
                    user.dropItem(itemStack2, false);
                }
            }
            else {
                ItemUsage.exchangeStack(itemStack, user, itemStack2);
            }


        }
        return ActionResult.SUCCESS;
    }
}
