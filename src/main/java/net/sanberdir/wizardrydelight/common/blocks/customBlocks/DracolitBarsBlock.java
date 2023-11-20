package net.sanberdir.wizardrydelight.common.blocks.customBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockState;

public class DracolitBarsBlock extends IronBarsBlock {
    public DracolitBarsBlock(Properties p_54198_) {
        super(p_54198_);
    }

    @Override
    public void entityInside(BlockState p_60495_, Level p_60496_, BlockPos p_60497_, Entity entity) {
        damageUndead(entity);
    }

    public static void damageUndead(Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEAD : false) {
            if (entity instanceof LivingEntity _entity)
                _entity.hurt(new DamageSource("magic").bypassArmor(), 2);
        }
    }

}
