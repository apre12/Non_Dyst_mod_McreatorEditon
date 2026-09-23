package net.mcreator.nondystopiamod.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.nondystopiamod.entity.NeutronpillerEntity;
import net.mcreator.nondystopiamod.client.model.Modelneutron_piller_block_Converted;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class NeutronpillerRenderer extends EntityRenderer<NeutronpillerEntity> {
	private static final ResourceLocation texture = new ResourceLocation("non_dystopia_mod_beta:textures/entities/neutron_piller_entity.png");
	private final Modelneutron_piller_block_Converted model;

	public NeutronpillerRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelneutron_piller_block_Converted(context.bakeLayer(Modelneutron_piller_block_Converted.LAYER_LOCATION));
	}

	@Override
	public void render(NeutronpillerEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(NeutronpillerEntity entity) {
		return texture;
	}
}
