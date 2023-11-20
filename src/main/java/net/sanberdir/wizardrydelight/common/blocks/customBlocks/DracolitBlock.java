package net.sanberdir.wizardrydelight.common.blocks.customBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class DracolitBlock extends Block {
    public DracolitBlock(Properties p_49795_) {
        super(p_49795_);
    }
    @Override
    public void entityInside(BlockState p_60495_, Level p_60496_, BlockPos p_60497_, Entity entity) {
        damageUndead(entity);
    }
    @Override
    public void stepOn(Level p_152431_, BlockPos p_152432_, BlockState p_152433_, Entity entity) {
        damageUndead(entity);
    }

    public static void damageUndead(Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false) {
            if (entity instanceof LivingEntity _entity)
                _entity.hurt(new DamageSource("magic").bypassArmor(), 5);
        }
    }
}
