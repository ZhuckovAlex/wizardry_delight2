package net.sanberdir.wizardrydelight.server.procedures;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.registries.ForgeRegistries;
import net.sanberdir.wizardrydelight.common.Items.InitItemsWD;
import vectorwing.farmersdelight.common.registry.ModItems;

public class CatInteractProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity) {
        if (sourceentity == null)
            return;
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.CHEESE.get()) {

            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.CHEESE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.45) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SWEET_ROLL.get()) {

            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.SWEET_ROLL.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.45) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_GOATS_MEET.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.COCKED_GOATS_MEET.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.HUNTING_TWISTER.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.HUNTING_TWISTER.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.1) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_SHPIKACHKI.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.COCKED_SHPIKACHKI.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SHPIKACHKI.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.SHPIKACHKI.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.PICKLED_SHISH_KEBAB.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.PICKLED_SHISH_KEBAB.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.25) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.GOAT_MEAT_KEBAB.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.GOAT_MEAT_KEBAB.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RAW_HORSE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.RAW_HORSE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RAW_BEAR_MEET.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.RAW_BEAR_MEET.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RAW_GOATS_MEET.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.RAW_GOATS_MEET.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RAW_HORSE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.RAW_HORSE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.MUSHROOM_ON_STICK.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.MUSHROOM_ON_STICK.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_MUSHROOM_ON_STICK.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.COCKED_MUSHROOM_ON_STICK.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RAW_SLICING_GOATS_MEET.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.RAW_SLICING_GOATS_MEET.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.MEDICAL_POTATO.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.MEDICAL_POTATO.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_CHICKEN) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.COOKED_CHICKEN);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_COD) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.COOKED_COD);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_MUTTON) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.COOKED_MUTTON);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MUTTON) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.MUTTON);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PORKCHOP) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.PORKCHOP);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_SALMON) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.COOKED_SALMON);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_RABBIT) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.COOKED_RABBIT);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.25) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.RABBIT_STEW) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.RABBIT_STEW);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.25) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BEETROOT_SOUP) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.BEETROOT_SOUP);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.01) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BEETROOT) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.BEETROOT);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.01) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.HONEY_BOTTLE) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.HONEY_BOTTLE);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.08) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BEEF) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.BEEF);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.01) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CHICKEN) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.CHICKEN);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.01) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.ROAST_CHICKEN.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.ROAST_CHICKEN.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.20) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.GRILLED_SALMON.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.GRILLED_SALMON.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.20) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.STEAK_AND_POTATOES.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.STEAK_AND_POTATOES.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.20) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.RICE_ROLL_MEDLEY_BLOCK.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.RICE_ROLL_MEDLEY_BLOCK.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.20) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.ROASTED_MUTTON_CHOPS.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.ROASTED_MUTTON_CHOPS.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.20) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.STUFFED_PUMPKIN_BLOCK.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.STUFFED_PUMPKIN_BLOCK.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.20) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.HONEY_GLAZED_HAM.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.HONEY_GLAZED_HAM.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.20) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.HONEY_GLAZED_HAM_BLOCK.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.HONEY_GLAZED_HAM_BLOCK.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.20) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.VEGETABLE_SOUP.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.VEGETABLE_SOUP.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.10) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MUSHROOM_RICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.MUSHROOM_RICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.10) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.STUFFED_PUMPKIN.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.STUFFED_PUMPKIN.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COOKED_RICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.COOKED_RICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.10) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BONE_BROTH.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.BONE_BROTH.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.10) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.FRIED_RICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.FRIED_RICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.10) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CAKE_SLICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.CAKE_SLICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.1) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SWEET_BERRY_CHEESECAKE_SLICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.SWEET_BERRY_CHEESECAKE_SLICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.1) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BARBECUE_STICK.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.BARBECUE_STICK.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.1) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.FRUIT_SALAD.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.FRUIT_SALAD.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.01) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.GLOW_BERRY_CUSTARD.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.GLOW_BERRY_CUSTARD.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.21) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SWEET_BERRY_CHEESECAKE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.SWEET_BERRY_CHEESECAKE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.10) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.ROAST_CHICKEN_BLOCK.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.ROAST_CHICKEN_BLOCK.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.25) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.RABBIT) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.RABBIT);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.21) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BREAD) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.BREAD);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.01) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BAKED_POTATO) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.BAKED_POTATO);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.01) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MUSHROOM_STEW) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.MUSHROOM_STEW);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.01) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_HORSE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.COCKED_HORSE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_GOAT_MEAT_KEBAB.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.COCKED_GOAT_MEAT_KEBAB.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.10) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.BEAR_MEAT_SOUP.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.BEAR_MEAT_SOUP.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.10) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.GOULASH_WITH_GOAT_MEAT.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.GOULASH_WITH_GOAT_MEAT.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.17) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SPAGHETTI_IN_THE_NORTH.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.SPAGHETTI_IN_THE_NORTH.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.12) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.ROAST_GOAT_MEAT_WITH_FREEZE_BERRIES.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.ROAST_GOAT_MEAT_WITH_FREEZE_BERRIES.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.12) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.HOT_COCOA_WITH_SPARKING_POLLEN.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.HOT_COCOA_WITH_SPARKING_POLLEN.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.12) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.IRIS.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.IRIS.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_BEAR_MEET.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.COCKED_BEAR_MEET.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.APPLE_JAM.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.APPLE_JAM.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.02) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SWEET_JAM.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.SWEET_JAM.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.02) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.GLOWING_JAM.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.GLOWING_JAM.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.02) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.POISON_BERRY_JAM.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.POISON_BERRY_JAM.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.02) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.CHARMING_BERRIES_JAM.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.CHARMING_BERRIES_JAM.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.12) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.JAM_TONIC.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.JAM_TONIC.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.3) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_SLICING_GOATS_MEET.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.COCKED_SLICING_GOATS_MEET.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.3) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SUGAR_REFINED.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.SUGAR_REFINED.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.02) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.KRUTNEVY_BREAD.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.KRUTNEVY_BREAD.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.12) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_PORKCHOP) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.COOKED_PORKCHOP);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.12) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_BEEF) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.COOKED_BEEF);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.12) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CAKE) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.CAKE);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.22) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PUFFERFISH) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.PUFFERFISH);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.32) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PUMPKIN_PIE) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.PUMPKIN_PIE);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SALMON) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.SALMON);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COD) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.COD);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BAKED_POTATO) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.BAKED_POTATO);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.01) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SPIDER_EYE) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.SPIDER_EYE);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.25) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.TROPICAL_FISH) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.TROPICAL_FISH);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.25) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.APPLE) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.APPLE);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.ROTTEN_FLESH) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.ROTTEN_FLESH);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MELON_SLICE) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.MELON_SLICE);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKIE) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.COOKIE);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CARROT) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.CARROT);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.POTATO) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.POTATO);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_APPLE) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.GOLDEN_APPLE);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.JAM_INVISIBILITY.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.JAM_INVISIBILITY.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.3) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.RICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.RICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.01) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.KELP_ROLL.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.KELP_ROLL.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.3) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CABBAGE_ROLLS.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.CABBAGE_ROLLS.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.3) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COD_ROLL.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.COD_ROLL.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.3) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SALMON_ROLL.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.SALMON_ROLL.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.3) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.KELP_ROLL_SLICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.KELP_ROLL_SLICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.3) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.HAMBURGER.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.HAMBURGER.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.EGG_SANDWICH.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.EGG_SANDWICH.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.FRIED_EGG.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.FRIED_EGG.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BACON_AND_EGGS.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.BACON_AND_EGGS.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CHICKEN_SANDWICH.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.CHICKEN_SANDWICH.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CHOCOLATE_PIE_SLICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.CHOCOLATE_PIE_SLICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SHEPHERDS_PIE_BLOCK.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.SHEPHERDS_PIE_BLOCK.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.PUMPKIN_SOUP.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.PUMPKIN_SOUP.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BAKED_COD_STEW.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.BAKED_COD_STEW.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.25) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BEEF_STEW.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.BEEF_STEW.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.RAW_PASTA.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.RAW_PASTA.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.01) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.POTATO_CRATE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.POTATO_CRATE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.STUFFED_POTATO.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.STUFFED_POTATO.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.DUMPLINGS.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.DUMPLINGS.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SQUID_INK_PASTA.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.SQUID_INK_PASTA.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MUTTON_WRAP.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.MUTTON_WRAP.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MUTTON_CHOPS.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.MUTTON_CHOPS.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.PASTA_WITH_MUTTON_CHOP.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.PASTA_WITH_MUTTON_CHOP.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BEEF_PATTY.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.BEEF_PATTY.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.10) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CHICKEN_CUTS.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.CHICKEN_CUTS.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.10) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COOKED_CHICKEN_CUTS.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.COOKED_CHICKEN_CUTS.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.10) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BACON.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.BACON.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.10) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COOKED_BACON.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.COOKED_BACON.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.12) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COD_SLICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.COD_SLICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.17) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SALMON_SLICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.SALMON_SLICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.22) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MUTTON_CHOPS.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.MUTTON_CHOPS.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.08) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COOKED_MUTTON_CHOPS.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.COOKED_MUTTON_CHOPS.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.16) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.HAM.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.HAM.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.1) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MILK_BOTTLE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.MILK_BOTTLE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.35) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.HOT_COCOA.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.HOT_COCOA.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.35) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SMOKED_HAM.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.SMOKED_HAM.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COOKED_SALMON_SLICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.COOKED_SALMON_SLICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.28) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COOKED_COD_SLICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.COOKED_COD_SLICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.22) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MINCED_BEEF.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.MINCED_BEEF.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.05) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.PASTA_WITH_MEATBALLS.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.PASTA_WITH_MEATBALLS.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.FISH_STEW.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.FISH_STEW.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.NOODLE_SOUP.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.NOODLE_SOUP.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.VEGETABLE_SOUP.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.VEGETABLE_SOUP.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.02) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CHICKEN_SOUP.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.CHICKEN_SOUP.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BACON_SANDWICH.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.BACON_SANDWICH.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.PIE_CRUST.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.PIE_CRUST.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.20) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CHOCOLATE_PIE_SLICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.CHOCOLATE_PIE_SLICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.10) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SHEPHERDS_PIE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.SHEPHERDS_PIE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.20) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.APPLE_PIE_SLICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.APPLE_PIE_SLICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.01) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.APPLE_PIE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.APPLE_PIE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.20) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CHOCOLATE_PIE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.CHOCOLATE_PIE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.25) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.RATATOUILLE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.RATATOUILLE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.25) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.LEVITAN_JAM.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.LEVITAN_JAM.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.3) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.FREEZE_JAM.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.FREEZE_JAM.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.APPLE_CIDER.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.APPLE_CIDER.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MIXED_SALAD.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.MIXED_SALAD.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CABBAGE_LEAF.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.CABBAGE_LEAF.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.WHEAT_DOUGH.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.WHEAT_DOUGH.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.PUMPKIN_SLICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.PUMPKIN_SLICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.NETHER_SALAD.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.NETHER_SALAD.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MELON_POPSICLE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.MELON_POPSICLE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CABBAGE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.CABBAGE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.ONION.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.ONION.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.HONEY_COOKIE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.HONEY_COOKIE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SWEET_BERRY_COOKIE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.SWEET_BERRY_COOKIE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.TOMATO.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.TOMATO.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.TOMATO_SAUCE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.TOMATO_SAUCE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MELON_JUICE.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.MELON_JUICE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.HORSE_FEED.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.HORSE_FEED.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.DOG_FOOD.get()) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(ModItems.DOG_FOOD.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
            if (world instanceof Level _level) {
                if (!_level.isClientSide())
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
            }
        }
        if (((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.WIZARD_PIE.get())) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.WIZARD_PIE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.7) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItemsWD.A_DROP_OF_LOVE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 20, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")), SoundSource.NEUTRAL, 1, 1);
                }
            }
            else {
                if (world instanceof ServerLevel _level)
                    _level.sendParticles(ParticleTypes.LARGE_SMOKE, x, y, z, 10, 0.2, 0.2, 0.2, 0.2);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide())
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.hiss")), SoundSource.NEUTRAL, 1, 1);
                }
            }
        }
    }
}