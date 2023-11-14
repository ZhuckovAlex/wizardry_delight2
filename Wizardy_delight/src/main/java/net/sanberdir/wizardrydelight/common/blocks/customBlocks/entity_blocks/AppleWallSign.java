package net.sanberdir.wizardrydelight.common.blocks.customBlocks.entity_blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.sanberdir.wizardrydelight.common.ModWoodType;
import net.sanberdir.wizardrydelight.common.blocks.ModEntitiesBlock;
import net.sanberdir.wizardrydelight.common.entity.sign.ModSignBlockEntity;

public class AppleWallSign extends WallSignBlock {
    public AppleWallSign() {
        super(Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_RED).noCollission().strength(1.0F).sound(SoundType.WOOD).lootFrom(() -> ModEntitiesBlock.APPLE_SIGN), ModWoodType.APPLE_WOOD);
    }

    /**
     * Gets the sign block entity for this sign
     *
     * @param position Position of the sign in the level
     * @param blockState State of the sign
     * @return The block entity for this sign
     */
    @Override
    public BlockEntity newBlockEntity(BlockPos position, BlockState blockState) {
        return new ModSignBlockEntity(position, blockState);
    }
}