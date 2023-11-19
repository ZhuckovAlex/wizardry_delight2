package net.sanberdir.wizardrydelight.common.entity.wool_cow.client;

import net.minecraft.resources.ResourceLocation;
import net.sanberdir.wizardrydelight.WizardryDelight;
import net.sanberdir.wizardrydelight.common.entity.wool_cow.custom.WoolCow;
import net.sanberdir.wizardrydelight.common.entity.wool_cow.custom.WoolCow2;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class WoolCowModel extends AnimatedGeoModel<WoolCow> {
    @Override
    public ResourceLocation getModelResource(WoolCow object) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "geo/wool_cow.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WoolCow object) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "textures/entity/wool_cow/wool_cow.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WoolCow animatable) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "animations/wool_cow.animation.json");
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(WoolCow entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
