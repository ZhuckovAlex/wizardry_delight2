package net.sanberdir.wizardrydelight.common.blocks.customBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MaterialColor;
import org.jetbrains.annotations.Nullable;

public class FlameLeaves extends LeavesBlock {

    public FlameLeaves(Properties p_54422_) {
        super(p_54422_);
    }

    @Override
    public boolean isBurning(BlockState state, BlockGetter level, BlockPos pos) {
        return true;
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public MaterialColor getMapColor(BlockState state, BlockGetter level, BlockPos pos, MaterialColor defaultColor) {
        return super.getMapColor(state, level, pos, defaultColor);
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 100;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 10;
    }

    @Override
    public void onCaughtFire(BlockState state, Level level, BlockPos pos, @Nullable Direction direction, @Nullable LivingEntity igniter) {
        super.onCaughtFire(state, level, pos, direction, igniter);
    }
}
