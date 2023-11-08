package net.sanberdir.wizardrydelight.server.procedures;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.sanberdir.wizardrydelight.common.Items.InitItemsWD;
import top.theillusivec4.curios.api.CuriosApi;

public class CurioGoldenRuno {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof LivingEntity lv) {
            CuriosApi.getCuriosHelper().findCurios(lv, InitItemsWD.GOLDEN_RUNO.get()).forEach(item -> {
                ItemStack itemstackiterator = item.stack();
                if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.POISON) : false) {
                    if (entity instanceof LivingEntity _entity)
                        _entity.removeEffect(MobEffects.POISON);
                }
                if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.WITHER) : false) {
                    if (entity instanceof LivingEntity _entity)
                        _entity.removeEffect(MobEffects.WITHER);
                }
                if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 6) {
                    if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
                        _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 3, false, false));
                }
                if (entity.isInLava() || entity.isOnFire()) {
                    if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
                        _entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 60, 1));
                }

            });
        }
    }

}
