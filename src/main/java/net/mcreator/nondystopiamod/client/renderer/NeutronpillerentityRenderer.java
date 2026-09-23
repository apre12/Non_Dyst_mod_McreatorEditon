
package net.mcreator.nondystopiamod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.nondystopiamod.entity.NeutronpillerentityEntity;
import net.mcreator.nondystopiamod.client.model.Modelneutron_piller_block_Converted;

import com.mojang.blaze3d.vertex.PoseStack;

public class NeutronpillerentityRenderer extends MobRenderer<NeutronpillerentityEntity, Modelneutron_piller_block_Converted<NeutronpillerentityEntity>> {
	public NeutronpillerentityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelneutron_piller_block_Converted<NeutronpillerentityEntity>(context.bakeLayer(Modelneutron_piller_block_Converted.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(NeutronpillerentityEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(NeutronpillerentityEntity entity) {
		return new ResourceLocation("non_dystopia_mod_beta:textures/entities/neutron_piller_entity.png");
	}
}
