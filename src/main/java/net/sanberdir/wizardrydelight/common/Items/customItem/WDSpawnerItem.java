package net.sanberdir.wizardrydelight.common.Items.customItem;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class WDSpawnerItem extends ItemNameBlockItem {
    public WDSpawnerItem(Block p_41579_, Properties p_41580_) {
        super(p_41579_, p_41580_);
    }
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        if (Screen.hasShiftDown()) {
            list.add(Component.translatable("wizardry_delight.press_shift2").withStyle(ChatFormatting.DARK_GRAY));
            list.add(Component.translatable("wizardry_delight.wd_spawner1").withStyle(ChatFormatting.DARK_PURPLE));
            list.add(Component.translatable("wizardry_delight.wd_spawner2").withStyle(ChatFormatting.DARK_PURPLE));
            list.add(Component.translatable("wizardry_delight.wd_spawner3").withStyle(ChatFormatting.DARK_PURPLE));
            list.add(Component.translatable("wizardry_delight.wd_spawner4").withStyle(ChatFormatting.DARK_PURPLE));
            list.add(Component.translatable("wizardry_delight.wd_spawner5").withStyle(ChatFormatting.DARK_PURPLE));
        }
        else {
            list.add(Component.translatable("wizardry_delight.press_shift").withStyle(ChatFormatting.DARK_GRAY));
        }
    }
}
