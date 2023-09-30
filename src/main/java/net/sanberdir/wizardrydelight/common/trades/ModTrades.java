package net.sanberdir.wizardrydelight.common.trades;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.BasicItemListing;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sanberdir.wizardrydelight.common.Items.InitItemsWD;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModTrades {
    @SubscribeEvent
    public static void registerWanderingTrades(WandererTradesEvent event) {
        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(Items.EMERALD, 1),
                new ItemStack(InitItemsWD.APPLE_SAPLING.get(),2), 20, 10, 0f));
        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(Items.EMERALD, 1),
                        new ItemStack(InitItemsWD.APPLE_SAPLING.get(),6), 20, 10, 0f));
        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(Items.EMERALD, 1),
                        new ItemStack(InitItemsWD.APPLE_SAPLING.get(),4), 20, 10, 0f));
        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),
                        new ItemStack(InitItemsWD.APPLE_SAPLING.get(),12), 20, 10, 0f));
        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),
                        new ItemStack(InitItemsWD.APPLE_SAPLING.get(),10), 20, 10, 0f));
        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),
                        new ItemStack(InitItemsWD.APPLE_SAPLING.get(),8), 20, 10, 0f));
        event.getGenericTrades()
                .add(new BasicItemListing(new ItemStack(Items.EMERALD, 1),
                        new ItemStack(InitItemsWD.APPLE_SAPLING.get(),5), 20, 10, 0f));


    }
}