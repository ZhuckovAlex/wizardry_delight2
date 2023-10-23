package net.sanberdir.wizardrydelight.common.entity.fat_pig.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.DismountHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.items.ItemHandlerHelper;
import net.sanberdir.wizardrydelight.common.entity.ModEntityTypesWD;
import net.sanberdir.wizardrydelight.server.procedures.CatInteractProcedure;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import javax.annotation.Nullable;


public class FatPig extends Animal implements IAnimatable {
        private static final Ingredient FOOD_ITEMS = Ingredient.of(Items.CARROT, Items.POTATO, Items.BEETROOT);
    public FatPig(EntityType<? extends Animal> p_29462_, Level p_29463_) {
        super(p_29462_, p_29463_);
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.fat_pig.walk", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.fat_pig.idle", true));
        return PlayState.CONTINUE;
    }
    private AnimationFactory factory = new AnimationFactory(this);
    @Override
    public AnimationFactory getFactory() {
        return factory;
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.2D));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.2D));
        this.goalSelector.addGoal(4, new TemptGoal(this, 1.2D, Ingredient.of(Items.CARROT_ON_A_STICK), false));
        this.goalSelector.addGoal(4, new TemptGoal(this, 1.2D, FOOD_ITEMS, false));
        this.goalSelector.addGoal(5, new FollowParentGoal(this, 1.2D));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.2D));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 15.0D).add(Attributes.MOVEMENT_SPEED, 0.15D);
    }





    protected SoundEvent getAmbientSound() {
        return SoundEvents.PIG_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource p_29502_) {
        return SoundEvents.PIG_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.PIG_DEATH;
    }

    protected void playStepSound(BlockPos p_29492_, BlockState p_29493_) {
        this.playSound(SoundEvents.PIG_STEP, 0.15F, 1.0F);
    }




    public Vec3 getDismountLocationForPassenger(LivingEntity p_29487_) {
        Direction direction = this.getMotionDirection();
        if (direction.getAxis() == Direction.Axis.Y) {
            return super.getDismountLocationForPassenger(p_29487_);
        } else {
            int[][] aint = DismountHelper.offsetsForDirection(direction);
            BlockPos blockpos = this.blockPosition();
            BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

            for(Pose pose : p_29487_.getDismountPoses()) {
                AABB aabb = p_29487_.getLocalBoundsForPose(pose);

                for(int[] aint1 : aint) {
                    blockpos$mutableblockpos.set(blockpos.getX() + aint1[0], blockpos.getY(), blockpos.getZ() + aint1[1]);
                    double d0 = this.level.getBlockFloorHeight(blockpos$mutableblockpos);
                    if (DismountHelper.isBlockFloorValid(d0)) {
                        Vec3 vec3 = Vec3.upFromBottomCenterOf(blockpos$mutableblockpos, d0);
                        if (DismountHelper.canDismountTo(this.level, p_29487_, aabb.move(vec3))) {
                            p_29487_.setPose(pose);
                            return vec3;
                        }
                    }
                }
            }

            return super.getDismountLocationForPassenger(p_29487_);
        }
    }

    public void thunderHit(ServerLevel p_29473_, LightningBolt p_29474_) {
        if (p_29473_.getDifficulty() != Difficulty.PEACEFUL && net.minecraftforge.event.ForgeEventFactory.canLivingConvert(this, EntityType.ZOMBIFIED_PIGLIN, (timer) -> {})) {
            ZombifiedPiglin zombifiedpiglin = EntityType.ZOMBIFIED_PIGLIN.create(p_29473_);
            zombifiedpiglin.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.GOLDEN_SWORD));
            zombifiedpiglin.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot());
            zombifiedpiglin.setNoAi(this.isNoAi());
            zombifiedpiglin.setBaby(this.isBaby());
            if (this.hasCustomName()) {
                zombifiedpiglin.setCustomName(this.getCustomName());
                zombifiedpiglin.setCustomNameVisible(this.isCustomNameVisible());
            }

            zombifiedpiglin.setPersistenceRequired();
            net.minecraftforge.event.ForgeEventFactory.onLivingConvert(this, zombifiedpiglin);
            p_29473_.addFreshEntity(zombifiedpiglin);
            this.discard();
        } else {
            super.thunderHit(p_29473_, p_29474_);
        }

    }



    public float getSteeringSpeed() {
        return (float)this.getAttributeValue(Attributes.MOVEMENT_SPEED) * 0.225F;
    }

    public void travelWithInput(Vec3 p_29482_) {
        super.travel(p_29482_);
    }



//    public FatPig getBreedOffspring(ServerLevel p_149001_, AgeableMob p_149002_) {
//        return ModEntityTypesWD.FAT_PIG.get().create(p_149001_);
//    }
public FatPig getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
    FatPig fatPig;
    if (ageableMob instanceof Pig) {
        fatPig = ModEntityTypesWD.FAT_PIG.get().create(serverLevel);
    }
    else if (ageableMob instanceof FatPig) {
        fatPig = ModEntityTypesWD.FAT_PIG.get().create(serverLevel);
    }else {
        fatPig = (FatPig) ageableMob;
        FatPig FatPig;
        FatPig = ModEntityTypesWD.FAT_PIG.get().create(serverLevel);


        net.sanberdir.wizardrydelight.common.entity.fat_pig.custom.FatPig pig = FatPig;
    }

    this.createAttributes();
    return fatPig;
}

    public boolean isFood(ItemStack p_29508_) {
        return FOOD_ITEMS.test(p_29508_);
    }

    public Vec3 getLeashOffset() {
        return new Vec3(0.0D, (double)(0.6F * this.getEyeHeight()), (double)(this.getBbWidth() * 0.4F));
    }
}
