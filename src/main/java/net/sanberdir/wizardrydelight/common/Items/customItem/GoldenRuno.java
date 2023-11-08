package net.sanberdir.wizardrydelight.common.Items.customItem;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.sanberdir.wizardrydelight.server.procedures.CurioGoldenRuno;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class GoldenRuno extends Item implements ICurioItem {
    public GoldenRuno(Properties properties) {
        super(properties);
    }

    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
        ICurioItem.super.curioTick(identifier, index, livingEntity, stack);
    }

    @Override
    public void inventoryTick(ItemStack p_41404_, Level world, Entity entity, int p_41407_, boolean p_41408_) {
        CurioGoldenRuno.execute(world, entity);
    }
}
