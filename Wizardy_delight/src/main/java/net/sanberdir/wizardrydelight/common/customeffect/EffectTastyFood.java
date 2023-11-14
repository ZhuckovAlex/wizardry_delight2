package net.sanberdir.wizardrydelight.common.customeffect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class EffectTastyFood extends MobEffect {

    public EffectTastyFood(MobEffectCategory mobEffectCategory, int color) {
        super(MobEffectCategory.BENEFICIAL, 0);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity.hasEffect(MobEffects.REGENERATION)) {
            return;
        }
        if (entity instanceof Player player) {
            if (player.getFoodData().getSaturationLevel() > 0.0) {
                return;
            }
        }
        if (entity.getHealth() < entity.getMaxHealth()) {
            entity.heal(3.0F);
        }
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return duration % 80 == 0;
    }
}
