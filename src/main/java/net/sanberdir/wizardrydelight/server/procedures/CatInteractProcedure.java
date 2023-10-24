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
    public static void execute (LevelAccessor world, double x, double y, double z, Entity sourceentity) {
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
        if (((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.APPLE)
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.MEDICAL_POTATO.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.ROTTEN_FLESH
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SPIDER_EYE
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CARROT
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.POTATO
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MUTTON
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PORKCHOP
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CABBAGE_LEAF.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BEETROOT
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BEEF
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CHICKEN
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SWEET_BERRIES
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GLOW_BERRIES
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BREAD
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SPIDER_EYE
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.TROPICAL_FISH
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.RICE.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CABBAGE.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.TOMATO.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.ONION.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.RAW_PASTA.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKIE
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MELON_SLICE
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COD_SLICE.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SALMON_SLICE.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MILK_BOTTLE.get()

        ) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
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
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SHPIKACHKI.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.GOAT_MEAT_KEBAB.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RAW_HORSE.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RAW_BEAR_MEET.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RAW_GOATS_MEET.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_MUSHROOM_ON_STICK.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.RAW_SLICING_GOATS_MEET.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.APPLE_CIDER.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MELON_JUICE.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_CHICKEN
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BAKED_POTATO
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_MUTTON
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.WHEAT_DOUGH.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.RAW_PASTA.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.PUMPKIN_SLICE.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.VEGETABLE_SOUP.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.RABBIT
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BAKED_POTATO
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.APPLE_JAM.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SWEET_JAM.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.GLOWING_JAM.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SUGAR_REFINED.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_PORKCHOP
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_BEEF
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PUFFERFISH
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MUTTON_CHOPS.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CHICKEN_CUTS.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SALMON_SLICE.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MINCED_BEEF.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.VEGETABLE_SOUP.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.APPLE_PIE_SLICE.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.POISON_BERRY.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.CHARMING_BERRIES.get()
        || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.FREEZE_BERRIES.get()
        ) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
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
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BONE_BROTH.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CAKE_SLICE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SWEET_BERRY_CHEESECAKE_SLICE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.HONEY_COOKIE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SWEET_BERRY_COOKIE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MELON_POPSICLE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MUSHROOM_STEW
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_SLICING_GOATS_MEET.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CABBAGE_ROLLS.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COD_ROLL.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SALMON_ROLL.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BACON.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.KELP_ROLL_SLICE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.HAM.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.PIE_CRUST.get()
        ) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.03) {
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
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_APPLE
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_GOATS_MEET.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.HUNTING_TWISTER.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_SHPIKACHKI.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_COD
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_SALMON
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.TOMATO_SAUCE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COOKED_RABBIT
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BEETROOT_SOUP
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.HONEY_BOTTLE
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.ROAST_CHICKEN.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.STEAK_AND_POTATOES.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.STUFFED_PUMPKIN_BLOCK.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.HONEY_GLAZED_HAM.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MUSHROOM_RICE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.STUFFED_PUMPKIN.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COOKED_RICE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BARBECUE_STICK.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.FRUIT_SALAD.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MIXED_SALAD.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.NETHER_SALAD.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.ROAST_CHICKEN_BLOCK.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_HORSE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_GOAT_MEAT_KEBAB.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.COCKED_BEAR_MEET.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.POISON_BERRY_JAM.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.CHARMING_BERRIES_JAM.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.KRUTNEVY_BREAD.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SALMON
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.COD
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BAKED_POTATO
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.EGG_SANDWICH.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.FRIED_EGG.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CHICKEN_SANDWICH.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CHOCOLATE_PIE_SLICE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BEEF_STEW.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MUTTON_WRAP.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BEEF_PATTY.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COOKED_CHICKEN_CUTS.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.MUTTON_CHOPS.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.HOT_COCOA.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COOKED_SALMON_SLICE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COOKED_COD_SLICE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.PASTA_WITH_MEATBALLS.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.FISH_STEW.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.NOODLE_SOUP.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.VEGETABLE_NOODLES.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CHICKEN_SOUP.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BACON_SANDWICH.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CHOCOLATE_PIE_SLICE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SHEPHERDS_PIE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.FREEZE_JAM.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.PICKLED_SHISH_KEBAB.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.MUSHROOM_ON_STICK.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.FRIED_RICE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.IRIS.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.HAMBURGER.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.PUMPKIN_SOUP.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.POTATO_CRATE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.STUFFED_POTATO.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.DUMPLINGS.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.APPLE_PIE.get()
        ) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.04) {
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
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.RABBIT_STEW
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.GRILLED_SALMON.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.ROASTED_MUTTON_CHOPS.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.HONEY_GLAZED_HAM_BLOCK.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.GLOW_BERRY_CUSTARD.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SWEET_BERRY_CHEESECAKE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.BEAR_MEAT_SOUP.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SPAGHETTI_IN_THE_NORTH.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.CAKE
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PUMPKIN_PIE
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.KELP_ROLL.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BACON_AND_EGGS.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SHEPHERDS_PIE_BLOCK.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.BAKED_COD_STEW.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COOKED_BACON.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SMOKED_HAM.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.RATATOUILLE.get()
        ) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.06) {
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
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.GOULASH_WITH_GOAT_MEAT.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.PASTA_WITH_MUTTON_CHOP.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.ROAST_GOAT_MEAT_WITH_FREEZE_BERRIES.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.HOT_COCOA_WITH_SPARKING_POLLEN.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.JAM_TONIC.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.SQUID_INK_PASTA.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.COOKED_MUTTON_CHOPS.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.CHOCOLATE_PIE.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.LEVITAN_JAM.get()
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.JAM_INVISIBILITY.get()
        ) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
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
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.ENCHANTED_GOLDEN_APPLE
           || (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModItems.RICE_ROLL_MEDLEY_BLOCK.get()
        ) {
            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
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
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.SWEET_ROLL.get()) {

            if (sourceentity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItemsWD.SWEET_ROLL.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (Math.random() < 0.30) {
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
        if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItemsWD.WIZARD_PIE.get()) {
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
    }}