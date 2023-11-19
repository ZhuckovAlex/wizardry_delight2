package net.sanberdir.wizardrydelight.server.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.sanberdir.wizardrydelight.common.blocks.InitBlocksWD;

import java.util.Map;

public class FillCoastalWater {
    public static void execute(LevelAccessor world, double x, double y, double z) {

        if (Math.random() <= 0.01) {
                BlockPos _bp = new BlockPos(x, y, z);
                BlockState _bs = InitBlocksWD.COASTAL_STEEP_W.get().defaultBlockState();
                BlockState _bso = world.getBlockState(_bp);
                for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
                    Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                    if (_property != null && _bs.getValue(_property) != null)
                        try {
                            _bs = _bs.setValue(_property, (Comparable) entry.getValue());
                        } catch (Exception e) {
                        }
                }
                world.setBlock(_bp, _bs, 3);
            }
        }
    }
