
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nondystopiamod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.nondystopiamod.client.model.Modeluranus_skyfish;
import net.mcreator.nondystopiamod.client.model.Modelspeeker;
import net.mcreator.nondystopiamod.client.model.Modelprint;
import net.mcreator.nondystopiamod.client.model.Modelneutron_piller_block_Converted;
import net.mcreator.nondystopiamod.client.model.Modelneutron_piller;
import net.mcreator.nondystopiamod.client.model.Modeliron_pipe_Converted;
import net.mcreator.nondystopiamod.client.model.Modelcustom_model;
import net.mcreator.nondystopiamod.client.model.Modelbullet;
import net.mcreator.nondystopiamod.client.model.ModelGstick;
import net.mcreator.nondystopiamod.client.model.ModelCustomModel;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class NonDystopiaModBetaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeliron_pipe_Converted.LAYER_LOCATION, Modeliron_pipe_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelbullet.LAYER_LOCATION, Modelbullet::createBodyLayer);
		event.registerLayerDefinition(ModelGstick.LAYER_LOCATION, ModelGstick::createBodyLayer);
		event.registerLayerDefinition(Modeluranus_skyfish.LAYER_LOCATION, Modeluranus_skyfish::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelspeeker.LAYER_LOCATION, Modelspeeker::createBodyLayer);
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modelprint.LAYER_LOCATION, Modelprint::createBodyLayer);
		event.registerLayerDefinition(Modelneutron_piller_block_Converted.LAYER_LOCATION, Modelneutron_piller_block_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelneutron_piller.LAYER_LOCATION, Modelneutron_piller::createBodyLayer);
	}
}
