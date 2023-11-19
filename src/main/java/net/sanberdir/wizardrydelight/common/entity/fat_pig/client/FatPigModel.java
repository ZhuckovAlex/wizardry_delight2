package net.sanberdir.wizardrydelight.common.entity.fat_pig.client;

import net.minecraft.resources.ResourceLocation;
import net.sanberdir.wizardrydelight.WizardryDelight;
import net.sanberdir.wizardrydelight.common.entity.fat_pig.custom.FatPig;
import net.sanberdir.wizardrydelight.common.entity.gold_sheep.custom.GoldSheep2;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class FatPigModel extends AnimatedGeoModel<FatPig> {
    @Override
    public ResourceLocation getModelResource(FatPig object) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "geo/fat_pig.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FatPig object) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "textures/entity/fat_pig/fat_pig.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FatPig animatable) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "animations/fat_pig.animation.json");
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(FatPig entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}
