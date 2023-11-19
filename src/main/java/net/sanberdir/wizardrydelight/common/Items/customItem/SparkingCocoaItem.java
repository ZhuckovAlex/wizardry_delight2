package net.sanberdir.wizardrydelight.common.Items.customItem;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import vectorwing.farmersdelight.common.item.DrinkableItem;

public class SparkingCocoaItem extends DrinkableItem {
    public SparkingCocoaItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = super.finishUsingItem(itemstack, world, entity);
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();

        clearAllEffects(entity);
        return retval;
    }


    public static void clearAllEffects(Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof LivingEntity _entity)
            _entity.removeAllEffects();
    }
}
