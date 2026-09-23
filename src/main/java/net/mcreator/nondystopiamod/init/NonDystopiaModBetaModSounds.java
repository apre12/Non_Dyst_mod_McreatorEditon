
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nondystopiamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.nondystopiamod.NonDystopiaModBetaMod;

public class NonDystopiaModBetaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NonDystopiaModBetaMod.MODID);
	public static final RegistryObject<SoundEvent> URANUS_ECHO = REGISTRY.register("uranus_echo", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("non_dystopia_mod_beta", "uranus_echo")));
}
