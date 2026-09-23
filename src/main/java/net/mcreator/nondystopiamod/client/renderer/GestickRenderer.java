
package net.mcreator.nondystopiamod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.nondystopiamod.entity.GestickEntity;
import net.mcreator.nondystopiamod.client.model.ModelGstick;

public class GestickRenderer extends MobRenderer<GestickEntity, ModelGstick<GestickEntity>> {
	public GestickRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGstick<GestickEntity>(context.bakeLayer(ModelGstick.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GestickEntity entity) {
		return new ResourceLocation("non_dystopia_mod_beta:textures/entities/gstick.png");
	}
}
