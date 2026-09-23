
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nondystopiamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.nondystopiamod.NonDystopiaModBetaMod;

public class NonDystopiaModBetaModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, NonDystopiaModBetaMod.MODID);
	public static final RegistryObject<SimpleParticleType> POND = REGISTRY.register("pond", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> PEARL_PROTECTION_EFFECT = REGISTRY.register("pearl_protection_effect", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> MICROWAVESHOCKPARTICLE = REGISTRY.register("microwaveshockparticle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ELECDISCHARGE = REGISTRY.register("elecdischarge", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> STEAM_PARTICLE = REGISTRY.register("steam_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> NEUTRONPERTICLE = REGISTRY.register("neutronperticle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> BEBROKENPEARLPROTECTION = REGISTRY.register("bebrokenpearlprotection", () -> new SimpleParticleType(true));
}
