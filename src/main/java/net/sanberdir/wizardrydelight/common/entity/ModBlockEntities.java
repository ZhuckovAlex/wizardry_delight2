package net.sanberdir.wizardrydelight.common.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.sanberdir.wizardrydelight.common.blocks.ModEntitiesBlock;
import net.sanberdir.wizardrydelight.common.entity.sign.ModSignBlockEntity;

public class ModBlockEntities {
    public static BlockEntityType<ModSignBlockEntity> SIGN_ENTITY_TYPE = BlockEntityType.Builder.of(ModSignBlockEntity::new, ModEntitiesBlock.APPLE_SIGN, ModEntitiesBlock.APPLE_WALL_SIGN).build(null);


}
