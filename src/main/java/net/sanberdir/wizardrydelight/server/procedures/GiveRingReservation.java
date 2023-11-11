package net.sanberdir.wizardrydelight.server.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraftforge.registries.ForgeRegistries;
import net.sanberdir.wizardrydelight.WizardryDelight;
import net.sanberdir.wizardrydelight.common.Items.InitItemsWD;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GiveRingReservation {
    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        if (event.getHand() != event.getEntity().getUsedItemHand())
            return;
        giveRing(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
    }

    public static void giveRing(LevelAccessor world, double x, double y, double z, Entity entity) {
        giveRing(null, world, x, y, z, entity);
    }

    private static void giveRing(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {

        if (entity == null)
            return;
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SOUL_STONE_CHARGED.get()
                && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RING_RESERVATION_LIFE.get().asItem()
                || (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SOUL_STONE_CHARGED.get()
                && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RING_RESERVATION_LIFE_CHARGED.get().asItem()) {

            if (entity instanceof LivingEntity _entity) {
                ItemStack _setstack = new ItemStack(WizardryDelight.SOUL_STONE_DISCHARGED.get());
                _setstack.setCount(1);
                _entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                if (_entity instanceof Player _player)
                    _player.getInventory().setChanged();
            }
            if (entity instanceof LivingEntity _entity) {
                ItemStack _setstack = new ItemStack(InitItemsWD.RING_RESERVATION_LIFE_CHARGED.get());
                _setstack.setCount(1);
                _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (_entity instanceof Player _player)
                    _player.getInventory().setChanged();
            }
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 2, 1);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 2, 1, false);
                }
            }
            if (world instanceof ServerLevel _level) {
                LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
                entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
                entityToSpawn.setVisualOnly(true);
                _level.addFreshEntity(entityToSpawn);
            }

        }
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SOUL_STONE_CHARGED.get()
                && (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RING_RESERVATION_LIFE.get().asItem()
                || (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SOUL_STONE_CHARGED.get()
                && (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RING_RESERVATION_LIFE_CHARGED.get().asItem()) {

            if (entity instanceof LivingEntity _entity) {
                ItemStack _setstack = new ItemStack(WizardryDelight.SOUL_STONE_DISCHARGED.get());
                _setstack.setCount(1);
                _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (_entity instanceof Player _player)
                    _player.getInventory().setChanged();
            }
            if (entity instanceof LivingEntity _entity) {
                ItemStack _setstack = new ItemStack(InitItemsWD.RING_RESERVATION_LIFE_CHARGED.get());
                _setstack.setCount(1);
                _entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                if (_entity instanceof Player _player)
                    _player.getInventory().setChanged();
            }
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 2, 1);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.lightning_bolt.thunder")), SoundSource.NEUTRAL, 2, 1, false);
                }
            }
            if (world instanceof ServerLevel _level) {
                LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
                entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
                entityToSpawn.setVisualOnly(true);
                _level.addFreshEntity(entityToSpawn);
            }

        }
    }

}