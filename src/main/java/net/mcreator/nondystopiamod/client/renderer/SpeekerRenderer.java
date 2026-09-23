
package net.mcreator.nondystopiamod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.nondystopiamod.entity.SpeekerEntity;
import net.mcreator.nondystopiamod.client.model.Modelspeeker;

public class SpeekerRenderer extends MobRenderer<SpeekerEntity, Modelspeeker<SpeekerEntity>> {
	public SpeekerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspeeker<SpeekerEntity>(context.bakeLayer(Modelspeeker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpeekerEntity entity) {
		return new ResourceLocation("non_dystopia_mod_beta:textures/entities/speeker.png");
	}
}
