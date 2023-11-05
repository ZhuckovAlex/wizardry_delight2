package net.sanberdir.wizardrydelight.common.Items.customItem;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.sanberdir.wizardrydelight.WizardryDelight;
import net.sanberdir.wizardrydelight.server.procedures.HitByBlock;
import net.sanberdir.wizardrydelight.server.procedures.RingReturnLiveProcedure;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class RingReturnLive extends Item implements ICurioItem {
    public RingReturnLive(Properties p_41383_) {
        super(p_41383_);
    }
}
