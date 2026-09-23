package net.mcreator.nondystopiamod.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.nondystopiamod.entity.TemporalboxEntity;

public class TemporalboxModel extends GeoModel<TemporalboxEntity> {
	@Override
	public ResourceLocation getAnimationResource(TemporalboxEntity entity) {
		return new ResourceLocation("non_dystopia_mod_beta", "animations/temporaly_box.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TemporalboxEntity entity) {
		return new ResourceLocation("non_dystopia_mod_beta", "geo/temporaly_box.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TemporalboxEntity entity) {
		return new ResourceLocation("non_dystopia_mod_beta", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TemporalboxEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
