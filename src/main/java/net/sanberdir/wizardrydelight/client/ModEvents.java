package net.sanberdir.wizardrydelight.client;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sanberdir.wizardrydelight.WizardryDelight;
import net.sanberdir.wizardrydelight.common.entity.ModEntityTypesWD;
import net.sanberdir.wizardrydelight.common.entity.chicken.custom.FeatherChicken;
import net.sanberdir.wizardrydelight.common.entity.chicken.custom.FeatherChicken2;
import net.sanberdir.wizardrydelight.common.entity.wool_cow.custom.WoolCow;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = WizardryDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypesWD.WOOL_COW.get(), WoolCow.setAttributes());
            event.put(ModEntityTypesWD.FAT_PIG.get(), WoolCow.setAttributes());
            event.put(ModEntityTypesWD.FEATHER_CHICKEN.get(), FeatherChicken.setAttributes());
            event.put(ModEntityTypesWD.FEATHER_CHICKEN2.get(), FeatherChicken2.setAttributes());
            event.put(ModEntityTypesWD.WOOL_COW2.get(), WoolCow.setAttributes());
        }

    }
}
