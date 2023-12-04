package net.sanberdir.wizardrydelight.common.Items.customItem;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.sanberdir.wizardrydelight.common.Items.entity.FlameArrow;

public class FlameArrowItem extends ArrowItem {
    public FlameArrowItem(Properties properties) {
        super(properties);
    }
    public AbstractArrow createArrow(Level level, ItemStack itemStack, LivingEntity entity) {
        return new FlameArrow(level, entity);
    }
    @Override
    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.world.entity.player.Player player) {
        int enchant = net.minecraft.world.item.enchantment.EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FLAMING_ARROWS, bow);
        return enchant <= 0 ? false : this.getClass() == FlameArrowItem.class;
    }
}
