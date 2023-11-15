package net.sanberdir.wizardrydelight.common.Items.customItem;

import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class BurnFences extends ItemNameBlockItem {


    public BurnFences(Block p_41579_, Properties p_41580_) {
        super(p_41579_, p_41580_);
    }
    // Время горения забора
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 1000;
    }
}
