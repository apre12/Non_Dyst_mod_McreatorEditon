
package net.mcreator.nondystopiamod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.nondystopiamod.entity.MeicrospencerEntity;

public class MeicrospencerRenderer extends HumanoidMobRenderer<MeicrospencerEntity, HumanoidModel<MeicrospencerEntity>> {
	public MeicrospencerRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<MeicrospencerEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(MeicrospencerEntity entity) {
		return new ResourceLocation("non_dystopia_mod_beta:textures/entities/microwaveman.png");
	}
}
