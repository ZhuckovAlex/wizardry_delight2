package net.sanberdir.wizardrydelight.common.Items.customItem;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class KrutnevyBread extends Item {
    public KrutnevyBread(Properties p_41383_) {
        super(p_41383_);
    }
    public static void eatenBread(Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof LivingEntity _entity) {
            _entity.removeEffect(MobEffects.BAD_OMEN);
            _entity.removeEffect(MobEffects.DARKNESS);
            _entity.removeEffect(MobEffects.HUNGER);
            _entity.removeEffect(MobEffects.WITHER);
            _entity.removeEffect(MobEffects.POISON);
            _entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            _entity.removeEffect(MobEffects.UNLUCK);
            _entity.removeEffect(MobEffects.WEAKNESS);
        }

        if (entity instanceof Player _player) {
            _player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 8));
            _player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + 5));

        }

    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity) {
        if (!level.isClientSide) {
            // FORGE - move up so stack.shrink does not turn stack into air

            eatenBread(livingEntity);

            if (livingEntity instanceof ServerPlayer serverplayer) {
                CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, itemStack);
                serverplayer.awardStat(Stats.ITEM_USED.get(this));
            }
        }

        if (livingEntity instanceof Player && !((Player)livingEntity).getAbilities().instabuild) {
            itemStack.shrink(1);
        }

        return itemStack;
    }
}
