
package net.mcreator.nondystopiamod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.nondystopiamod.entity.UranusskyfishEntity;
import net.mcreator.nondystopiamod.client.model.Modeluranus_skyfish;

public class UranusskyfishRenderer extends MobRenderer<UranusskyfishEntity, Modeluranus_skyfish<UranusskyfishEntity>> {
	public UranusskyfishRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeluranus_skyfish<UranusskyfishEntity>(context.bakeLayer(Modeluranus_skyfish.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(UranusskyfishEntity entity) {
		return new ResourceLocation("non_dystopia_mod_beta:textures/entities/uranus_skyfish.png");
	}
}
