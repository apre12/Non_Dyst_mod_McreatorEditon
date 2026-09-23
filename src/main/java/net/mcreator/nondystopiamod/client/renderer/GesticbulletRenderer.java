package net.mcreator.nondystopiamod.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.nondystopiamod.entity.GesticbulletEntity;
import net.mcreator.nondystopiamod.client.model.ModelGstick;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GesticbulletRenderer extends EntityRenderer<GesticbulletEntity> {
	private static final ResourceLocation texture = new ResourceLocation("non_dystopia_mod_beta:textures/entities/gstick.png");
	private final ModelGstick model;

	public GesticbulletRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelGstick(context.bakeLayer(ModelGstick.LAYER_LOCATION));
	}

	@Override
	public void render(GesticbulletEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(GesticbulletEntity entity) {
		return texture;
	}
}
