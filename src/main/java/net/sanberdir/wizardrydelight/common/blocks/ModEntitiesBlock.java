package net.sanberdir.wizardrydelight.common.blocks;

import net.minecraftforge.registries.ObjectHolder;
import net.sanberdir.wizardrydelight.WizardryDelight;
import net.sanberdir.wizardrydelight.common.blocks.customBlocks.entity_blocks.AppleSign;
import net.sanberdir.wizardrydelight.common.blocks.customBlocks.entity_blocks.AppleWallSign;

public class ModEntitiesBlock {
    @ObjectHolder(registryName = "minecraft:block", value = WizardryDelight.MOD_ID + ":apple_sign")
    public static AppleSign APPLE_SIGN;

    @ObjectHolder(registryName = "minecraft:block", value = WizardryDelight.MOD_ID + ":apple_wall_sign")
    public static AppleWallSign APPLE_WALL_SIGN;

}
