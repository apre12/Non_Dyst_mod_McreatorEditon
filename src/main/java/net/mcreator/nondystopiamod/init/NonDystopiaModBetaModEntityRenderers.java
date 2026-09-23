
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nondystopiamod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.nondystopiamod.client.renderer.UranusskyfishRenderer;
import net.mcreator.nondystopiamod.client.renderer.ThrowedpipeRenderer;
import net.mcreator.nondystopiamod.client.renderer.TemporalboxRenderer;
import net.mcreator.nondystopiamod.client.renderer.SpeekerRenderer;
import net.mcreator.nondystopiamod.client.renderer.PrintRenderer;
import net.mcreator.nondystopiamod.client.renderer.NeutronpillerentityRenderer;
import net.mcreator.nondystopiamod.client.renderer.NeutronpillerRenderer;
import net.mcreator.nondystopiamod.client.renderer.MeicrospencerRenderer;
import net.mcreator.nondystopiamod.client.renderer.GestickRenderer;
import net.mcreator.nondystopiamod.client.renderer.GesticbulletRenderer;
import net.mcreator.nondystopiamod.client.renderer.BulletRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NonDystopiaModBetaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.PRINT.get(), PrintRenderer::new);
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.PRINT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.URANUSSKYFISH.get(), UranusskyfishRenderer::new);
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.GESTICK.get(), GestickRenderer::new);
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.SPEEKER.get(), SpeekerRenderer::new);
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.MEICROSPENCER.get(), MeicrospencerRenderer::new);
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.MAGIC.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.THROWEDPIPE.get(), ThrowedpipeRenderer::new);
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.BULLET.get(), BulletRenderer::new);
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.MICROWAVESHOOT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.GESTICBULLET.get(), GesticbulletRenderer::new);
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.TEMPORALBOX.get(), TemporalboxRenderer::new);
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.NEUTRONPILLER.get(), NeutronpillerRenderer::new);
		event.registerEntityRenderer(NonDystopiaModBetaModEntities.NEUTRONPILLERENTITY.get(), NeutronpillerentityRenderer::new);
	}
}
