package net.sanberdir.wizardrydelight.common.entity.entity_block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BaseSpawner;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.SpawnData;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.entity.SpawnerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;
import net.sanberdir.wizardrydelight.WizardryDelight;
import net.sanberdir.wizardrydelight.common.blocks.InitBlocksWD;

import javax.annotation.Nullable;
import java.util.stream.IntStream;


public class WDSpawnerEntity extends RandomizableContainerBlockEntity implements WorldlyContainer {
    public BaseSpawner getSpawner() {
        return this.spawner;
    }
    private final BaseSpawner spawner = new BaseSpawner() {
        public void broadcastEvent(Level p_155767_, BlockPos p_155768_, int p_155769_) {
            p_155767_.blockEvent(p_155768_, InitBlocksWD.WD_SPAWNER.get(), p_155769_, 0);
        }

        public void setNextSpawnData(@Nullable Level p_155771_, BlockPos p_155772_, SpawnData p_155773_) {
            super.setNextSpawnData(p_155771_, p_155772_, p_155773_);
            if (p_155771_ != null) {
                BlockState blockstate = p_155771_.getBlockState(p_155772_);
                p_155771_.sendBlockUpdated(p_155772_, blockstate, blockstate, 4);
            }

        }

        @org.jetbrains.annotations.Nullable
        public net.minecraft.world.level.block.entity.BlockEntity getSpawnerBlockEntity(){ return WDSpawnerEntity.this; }
    };

        private NonNullList<ItemStack> stacks = NonNullList.<ItemStack>withSize(9, ItemStack.EMPTY);
        private final LazyOptional<? extends IItemHandler>[] handlers = SidedInvWrapper.create(this, Direction.values());

    public WDSpawnerEntity(BlockPos position, BlockState state) {
        super(WDBlockEntities.WD_SPAWNER.get(), position, state);
    }




    @Override
        public void load(CompoundTag compound) {
            super.load(compound);
            if (!this.tryLoadLootTable(compound))
                this.stacks = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
            ContainerHelper.loadAllItems(compound, this.stacks);
        }

        @Override
        public void saveAdditional(CompoundTag compound) {
            super.saveAdditional(compound);
            if (!this.trySaveLootTable(compound)) {
                ContainerHelper.saveAllItems(compound, this.stacks);
            }
        }

        @Override
        public ClientboundBlockEntityDataPacket getUpdatePacket() {
            return ClientboundBlockEntityDataPacket.create(this);
        }

        @Override
        public CompoundTag getUpdateTag() {
            return this.saveWithFullMetadata();
        }

        @Override
        public int getContainerSize() {
            return stacks.size();
        }

        @Override
        public boolean isEmpty() {
            for (ItemStack itemstack : this.stacks)
                if (!itemstack.isEmpty())
                    return false;
            return true;
        }

        @Override
        public Component getDefaultName() {
            return Component.literal("wd_spawner");
        }

        @Override
        public int getMaxStackSize() {
            return 64;
        }

        @Override
        public AbstractContainerMenu createMenu(int id, Inventory inventory) {
            return ChestMenu.threeRows(id, inventory);
        }

        @Override
        public Component getDisplayName() {
            return Component.literal("wd_spawner");
        }

        @Override
        protected NonNullList<ItemStack> getItems() {
            return this.stacks;
        }

        @Override
        protected void setItems(NonNullList<ItemStack> stacks) {
            this.stacks = stacks;
        }

        @Override
        public boolean canPlaceItem(int index, ItemStack stack) {
            return true;
        }

        @Override
        public int[] getSlotsForFace(Direction side) {
            return IntStream.range(0, this.getContainerSize()).toArray();
        }

        @Override
        public boolean canPlaceItemThroughFace(int index, ItemStack stack, @Nullable Direction direction) {
            return this.canPlaceItem(index, stack);
        }

        @Override
        public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction) {
            return true;
        }

        @Override
        public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
            if (!this.remove && facing != null && capability == ForgeCapabilities.ITEM_HANDLER)
                return handlers[facing.ordinal()].cast();
            return super.getCapability(capability, facing);
        }

        @Override
        public void setRemoved() {
            super.setRemoved();
            for (LazyOptional<? extends IItemHandler> handler : handlers)
                handler.invalidate();
        }
    }

