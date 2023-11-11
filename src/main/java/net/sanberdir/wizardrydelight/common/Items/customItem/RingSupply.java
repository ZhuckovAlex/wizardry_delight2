package net.sanberdir.wizardrydelight.common.Items.customItem;

import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.sanberdir.wizardrydelight.server.procedures.CurioGoldenRuno;
import net.sanberdir.wizardrydelight.server.procedures.RingSupplyProcedure;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class RingSupply extends Item implements ICurioItem {
    public RingSupply(Properties p_41383_) {
        super(p_41383_);
    }
    @Override
    public void inventoryTick(ItemStack itemStack, Level world, Entity entity, int p_41407_, boolean p_41408_) {
        RingSupplyProcedure.execute(world, entity, itemStack);
    }

}