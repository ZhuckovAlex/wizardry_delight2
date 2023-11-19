package net.sanberdir.wizardrydelight.common.entity.chief_cat.client;

import net.minecraft.resources.ResourceLocation;
import net.sanberdir.wizardrydelight.WizardryDelight;
import net.sanberdir.wizardrydelight.common.entity.chicken.custom.FeatherChicken;
import net.sanberdir.wizardrydelight.common.entity.chief_cat.custom.ChiefCat;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class ChiefCatModel extends AnimatedGeoModel<ChiefCat> {
@Override
public ResourceLocation getModelResource(ChiefCat object) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "geo/chief_cat.geo.json");
        }

@Override
public ResourceLocation getTextureResource(ChiefCat object) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "textures/entity/chief_cat/chief_cat.png");
        }

@Override
public ResourceLocation getAnimationResource(ChiefCat animatable) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "animations/chief_cat.animation.json");
        }
        @SuppressWarnings({ "unchecked", "rawtypes" })
        @Override
        public void setLivingAnimations(ChiefCat entity, Integer uniqueID, AnimationEvent customPredicate) {
                super.setLivingAnimations(entity, uniqueID, customPredicate);
                IBone head = this.getAnimationProcessor().getBone("head");

                EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
                if (head != null) {
                        head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
                        head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
            }
        }
   }