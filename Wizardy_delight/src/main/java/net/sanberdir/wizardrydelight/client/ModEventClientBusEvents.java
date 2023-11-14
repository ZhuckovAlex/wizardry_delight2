package net.sanberdir.wizardrydelight.client;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import net.sanberdir.wizardrydelight.WizardryDelight;
import net.sanberdir.wizardrydelight.common.Items.customItem.ClearHatArmorItem;
import net.sanberdir.wizardrydelight.common.Items.customItem.HatArmorItem;
import net.sanberdir.wizardrydelight.common.blocks.customBlocks.FlameLeavesApple;
import net.sanberdir.wizardrydelight.common.blocks.customBlocks.FlameLeavesNoapple;
import net.sanberdir.wizardrydelight.common.entity.hat.armor.ClearHatArmorRenderer;
import net.sanberdir.wizardrydelight.common.entity.hat.armor.HatArmorRenderer;
import net.sanberdir.wizardrydelight.common.particle.ModParticles;
import net.sanberdir.wizardrydelight.common.particle.custom.RobinStarsParticles;
import net.sanberdir.wizardrydelight.common.particle.custom.RobinStarsParticlesProjectile;
import net.sanberdir.wizardrydelight.common.particle.custom.StombleRoseParticles;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = WizardryDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientSideHandler {
        @SubscribeEvent
        public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
            GeoArmorRenderer.registerArmorRenderer(HatArmorItem.class, new HatArmorRenderer());
            GeoArmorRenderer.registerArmorRenderer(ClearHatArmorItem.class, new ClearHatArmorRenderer());
        }
        @SubscribeEvent
        public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
            FlameLeavesApple.blockColorLoad(event);
            FlameLeavesNoapple.blockColorLoad(event);
        }
        @SubscribeEvent
        public static void registerParticleFactories(final RegisterParticleProvidersEvent event) {
            Minecraft.getInstance().particleEngine.register(ModParticles.ROBIN_STAR_PARTICLES.get(),
                    RobinStarsParticles.Provider::new);

            Minecraft.getInstance().particleEngine.register(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(),
                    RobinStarsParticlesProjectile.Provider::new);

            Minecraft.getInstance().particleEngine.register(ModParticles.STOMBLE_ROSE.get(),
                    StombleRoseParticles.Provider::new);
        }
    }

}
