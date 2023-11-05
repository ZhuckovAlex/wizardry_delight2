package net.sanberdir.wizardrydelight.server.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.sanberdir.wizardrydelight.common.Items.InitItemsWD;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.event.CurioChangeEvent;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RingReturnLiveProcedure {
    @SubscribeEvent
    public static void onEntityDeath(LivingDeathEvent event) {
        if (event != null && event.getEntity() != null) {
            returnLive(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
        }
    }

    public static void returnLive(LevelAccessor world, double x, double y, double z, Entity entity) {
        returnLive(null, world, x, y, z, entity);
    }

    private static void returnLive(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RING_RESERVATION_LIFE_CHARGED.get()) {
            if (entity instanceof LivingEntity _entity)
                _entity.setHealth(1);
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("wizardry_delight:necro_decay_effect_finish")), SoundSource.NEUTRAL, 1, 1);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("wizardry_delight:necro_decay_effect_finish")), SoundSource.NEUTRAL, 1, 1, false);
                }
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.HEART, x, y, z, 10, 0.4, 0.4, 0.4, 0.2);
            {
                ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY);
                if (_ist.hurt(1, RandomSource.create(), null)) {
                    _ist.shrink(1);
                    _ist.setDamageValue(0);
                }
            }
            if (((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getDamageValue() < 1) {
                if (entity instanceof LivingEntity _entity) {
                    ItemStack _setstack = new ItemStack(InitItemsWD.RING_RESERVATION_LIFE.get());
                    _setstack.setCount(1);
                    _entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                    if (_entity instanceof Player _player)
                        _player.getInventory().setChanged();
                }
            }
        }
        if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
            _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 240, 2, false, false));
        if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
            _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 240, 1, false, false));

    }
}