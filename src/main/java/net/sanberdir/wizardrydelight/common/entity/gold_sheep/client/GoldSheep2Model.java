package net.sanberdir.wizardrydelight.common.entity.gold_sheep.client;

import net.minecraft.resources.ResourceLocation;
import net.sanberdir.wizardrydelight.WizardryDelight;
import net.sanberdir.wizardrydelight.common.entity.gold_sheep.custom.GoldSheep;
import net.sanberdir.wizardrydelight.common.entity.gold_sheep.custom.GoldSheep2;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class GoldSheep2Model extends AnimatedGeoModel<GoldSheep2> {
    @Override
    public ResourceLocation getModelResource(GoldSheep2 object) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "geo/gold_sheep2.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GoldSheep2 object) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "textures/entity/gold_sheep/gold_sheep2.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GoldSheep2 animatable) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "animations/gold_sheep.animation.json");
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(GoldSheep2 entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
