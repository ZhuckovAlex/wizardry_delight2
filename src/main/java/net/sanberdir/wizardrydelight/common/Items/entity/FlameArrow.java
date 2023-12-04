package net.sanberdir.wizardrydelight.common.Items.entity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.network.PlayMessages;
import net.sanberdir.wizardrydelight.WizardryDelight;
import net.sanberdir.wizardrydelight.common.Items.InitItemsWD;
import net.sanberdir.wizardrydelight.common.entity.ModEntities;

public class FlameArrow extends AbstractArrow {
    private float explosionRadius = 0.5F;

    public FlameArrow(EntityType<? extends FlameArrow> p_37411_, Level p_37412_) {
        super(p_37411_, p_37412_);
    }

    public FlameArrow(Level p_37419_, LivingEntity p_37420_) {
        super(ModEntities.FLAME_ARROW.get(), p_37420_, p_37419_);
    }

    public FlameArrow(Level p_37414_, double p_37415_, double p_37416_, double p_37417_) {
        super(ModEntities.FLAME_ARROW.get(), p_37415_, p_37416_, p_37417_, p_37414_);
    }

    public FlameArrow(PlayMessages.SpawnEntity spawnEntity, Level world) {
        this(ModEntities.FLAME_ARROW.get(), world);
    }

    public void tick() {
        super.tick();
        if (this.level.isClientSide && !this.inGround) {
            this.level.addParticle(ParticleTypes.FLAME, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
        }

    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(InitItemsWD.FLAME_ARROW.get());
    }

    @Override
    protected void onHitEntity(EntityHitResult p_36757_) {
        super.onHitEntity(p_36757_);
        Entity entity = p_36757_.getEntity();
        flameMob(entity);
    }
    public static void flameMob(Entity entity) {
        if (entity == null)
            return;
        entity.setSecondsOnFire(15);
    }
    public static void fireBlock(LevelAccessor world, double x, double y, double z) {



        for (Direction directioniterator : Direction.values()) {
            world.setBlock(new BlockPos(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
        }
        for (Direction directioniterator : Direction.Plane.HORIZONTAL) {
            world.setBlock(new BlockPos(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
        }

    }


    @Override
    protected void onHitBlock(BlockHitResult p_36755_) {
        super.onHitBlock(p_36755_);
        fireBlock(level,getX(),getY(),getZ());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag p_36761_) {
        super.readAdditionalSaveData(p_36761_);
        if (p_36761_.contains("ExplosionRadius")) {
            this.explosionRadius = p_36761_.getFloat("ExplosionRadius");
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundTag p_36772_) {
        super.addAdditionalSaveData(p_36772_);
        p_36772_.putFloat("ExplosionRadius", this.explosionRadius);

    }
}