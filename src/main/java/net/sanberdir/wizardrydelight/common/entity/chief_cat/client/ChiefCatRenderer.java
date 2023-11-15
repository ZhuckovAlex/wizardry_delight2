package net.sanberdir.wizardrydelight.common.entity.chief_cat.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.sanberdir.wizardrydelight.WizardryDelight;
import net.sanberdir.wizardrydelight.common.entity.chief_cat.custom.ChiefCat;
import net.sanberdir.wizardrydelight.common.entity.fat_pig.client.FatPigModel;
import net.sanberdir.wizardrydelight.common.entity.fat_pig.custom.FatPig;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ChiefCatRenderer extends GeoEntityRenderer<ChiefCat> {
    public ChiefCatRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ChiefCatModel());
        this.shadowRadius = 0.6f;
    }

    @Override
    public ResourceLocation getTextureLocation(ChiefCat instance) {
        return new ResourceLocation(WizardryDelight.MOD_ID, "textures/entity/chief_cat/chief_cat.png");
    }

    @Override
    public RenderType getRenderType(ChiefCat animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if (animatable.isBaby()){
            stack.scale(0.4f, 0.4f, 0.4f);
        }
        else {
            stack.scale(1f, 1f, 1f);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}