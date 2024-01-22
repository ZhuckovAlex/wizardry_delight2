package net.rezolv.obsidanum;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabObs extends CreativeModeTab {

    protected CreativeTabObs(Builder builder) {
        super(builder);
    }
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Obsidanum.MOD_ID);

    public static final RegistryObject<CreativeModeTab> OBSIDANUM_TAB = CREATIVE_MODE_TABS.register("obsidanum_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemsObs.OBSIDIAN_TEAR.get()))
                    .title(Component.translatable("creativetab.obsidanum"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ItemsObs.OBSIDIAN_TEAR.get());
                    })
                    .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}