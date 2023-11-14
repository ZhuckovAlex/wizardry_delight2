package net.sanberdir.wizardrydelight.common.blocks.customBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.NetherWartBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.PlantType;
import net.sanberdir.wizardrydelight.common.Items.InitItemsWD;

public class WarpedWartBlock extends NetherWartBlock {
    public WarpedWartBlock(Properties p_54971_) {
        super(p_54971_);
    }
@Override
    public ItemStack getCloneItemStack(BlockGetter p_54973_, BlockPos p_54974_, BlockState p_54975_) {
        return new ItemStack(InitItemsWD.WARPED_WART.get());
    }

    @Override
    public PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return PlantType.NETHER;
    }
}
