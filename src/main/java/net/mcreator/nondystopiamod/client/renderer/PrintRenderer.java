
package net.mcreator.nondystopiamod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.nondystopiamod.entity.PrintEntity;
import net.mcreator.nondystopiamod.client.model.Modelprint;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PrintRenderer extends MobRenderer<PrintEntity, Modelprint<PrintEntity>> {
	public PrintRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprint<PrintEntity>(context.bakeLayer(Modelprint.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<PrintEntity, Modelprint<PrintEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("non_dystopia_mod_beta:textures/entities/printsshell.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, PrintEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(PrintEntity entity) {
		return new ResourceLocation("non_dystopia_mod_beta:textures/entities/printsshell.png");
	}
}
