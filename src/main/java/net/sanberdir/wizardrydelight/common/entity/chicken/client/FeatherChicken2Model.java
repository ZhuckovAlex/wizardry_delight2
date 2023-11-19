package net.sanberdir.wizardrydelight.common.entity.chicken.client;

import net.minecraft.resources.ResourceLocation;
import net.sanberdir.wizardrydelight.WizardryDelight;
import net.sanberdir.wizardrydelight.common.entity.chicken.custom.FeatherChicken;
import net.sanberdir.wizardrydelight.common.entity.chicken.custom.FeatherChicken2;
import net.sanberdir.wizardrydelight.common.entity.fat_pig.custom.FatPig;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class FeatherChicken2Model extends AnimatedGeoModel<FeatherChicken2> {
    @Override
    public ResourceLocation getModelResource(FeatherChicken2 object) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "geo/feather_chicken.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FeatherChicken2 object) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "textures/entity/feather_chicken/feather_chicken2.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FeatherChicken2 animatable) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "animations/feather_chicken.animation.json");
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(FeatherChicken2 entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
