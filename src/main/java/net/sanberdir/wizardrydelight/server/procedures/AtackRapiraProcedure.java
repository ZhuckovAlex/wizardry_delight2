package net.sanberdir.wizardrydelight.server.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.CriticalHitEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sanberdir.wizardrydelight.common.Items.InitItemsWD;


import javax.annotation.Nullable;

@Mod.EventBusSubscriber

public class AtackRapiraProcedure {
    @SubscribeEvent
    public static void onPlayerCriticalHit(CriticalHitEvent event) {
        execute(event, event.getTarget(), event.getEntity());
    }
    private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
        if (entity == null || sourceentity == null)
            return;
        if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.MOVEMENT_SLOWDOWN) : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RAPIER.get()) {
            if (Math.random() <= 0.3) {
                if (entity instanceof LivingEntity _entity)
                    _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 2));
            }
        }
        if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.BLINDNESS) : false) && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RAPIER.get()) {
            if (Math.random() <= 0.4) {
                if (entity instanceof LivingEntity _entity)
                    _entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 150, 1));
            }
        }
    }

}
