
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nondystopiamod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.nondystopiamod.client.particle.SteamParticleParticle;
import net.mcreator.nondystopiamod.client.particle.PondParticle;
import net.mcreator.nondystopiamod.client.particle.PearlProtectionEffectParticle;
import net.mcreator.nondystopiamod.client.particle.NeutronperticleParticle;
import net.mcreator.nondystopiamod.client.particle.MicrowaveshockparticleParticle;
import net.mcreator.nondystopiamod.client.particle.ElecdischargeParticle;
import net.mcreator.nondystopiamod.client.particle.BebrokenpearlprotectionParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NonDystopiaModBetaModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(NonDystopiaModBetaModParticleTypes.POND.get(), PondParticle::provider);
		event.registerSpriteSet(NonDystopiaModBetaModParticleTypes.PEARL_PROTECTION_EFFECT.get(), PearlProtectionEffectParticle::provider);
		event.registerSpriteSet(NonDystopiaModBetaModParticleTypes.MICROWAVESHOCKPARTICLE.get(), MicrowaveshockparticleParticle::provider);
		event.registerSpriteSet(NonDystopiaModBetaModParticleTypes.ELECDISCHARGE.get(), ElecdischargeParticle::provider);
		event.registerSpriteSet(NonDystopiaModBetaModParticleTypes.STEAM_PARTICLE.get(), SteamParticleParticle::provider);
		event.registerSpriteSet(NonDystopiaModBetaModParticleTypes.NEUTRONPERTICLE.get(), NeutronperticleParticle::provider);
		event.registerSpriteSet(NonDystopiaModBetaModParticleTypes.BEBROKENPEARLPROTECTION.get(), BebrokenpearlprotectionParticle::provider);
	}
}
