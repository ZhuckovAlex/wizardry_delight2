package net.sanberdir.wizardrydelight.common.sounds;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir.wizardrydelight.WizardryDelight;

public class CustomSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, WizardryDelight.MOD_ID);

    public static final RegistryObject<SoundEvent> NYAMNYAM =
            registerSoundEvent("nyamnyam");
    public static final RegistryObject<SoundEvent> ROBIN_STICK =
            registerSoundEvent("robin_stick");
    public static final RegistryObject<SoundEvent> NYAMNYAM_END =
            registerSoundEvent("nyamnyam_end");

    //Суанчес-сан-санбердир продакшнс представляет вам средство от кровавых натоптышей всего за 2000 рублей! Только сегодня успейте заказать два тюбика по цене трех.
    public static final RegistryObject<SoundEvent> WIZARDRY_DELIGHT_JAM =
            registerSoundEvent("wizardry_delight_jam");
    public static final RegistryObject<SoundEvent> NECRO_DECAY_EFFECT_FINISH =
            registerSoundEvent("necro_decay_effect_finish");




    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(WizardryDelight.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
