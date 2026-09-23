
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nondystopiamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.nondystopiamod.potion.SteamProtectionMobEffect;
import net.mcreator.nondystopiamod.potion.PondactiveMobEffect;
import net.mcreator.nondystopiamod.potion.PearlprotectionMobEffect;
import net.mcreator.nondystopiamod.potion.MicrowaveshieldMobEffect;
import net.mcreator.nondystopiamod.potion.MicrowavedamageMobEffect;
import net.mcreator.nondystopiamod.potion.LivetimerMobEffect;
import net.mcreator.nondystopiamod.potion.ElectrostaticchargeMobEffect;
import net.mcreator.nondystopiamod.potion.CooldownMobEffect;
import net.mcreator.nondystopiamod.NonDystopiaModBetaMod;

public class NonDystopiaModBetaModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, NonDystopiaModBetaMod.MODID);
	public static final RegistryObject<MobEffect> PEARLPROTECTION = REGISTRY.register("pearlprotection", () -> new PearlprotectionMobEffect());
	public static final RegistryObject<MobEffect> LIVETIMER = REGISTRY.register("livetimer", () -> new LivetimerMobEffect());
	public static final RegistryObject<MobEffect> MICROWAVEDAMAGE = REGISTRY.register("microwavedamage", () -> new MicrowavedamageMobEffect());
	public static final RegistryObject<MobEffect> ELECTROSTATICCHARGE = REGISTRY.register("electrostaticcharge", () -> new ElectrostaticchargeMobEffect());
	public static final RegistryObject<MobEffect> MICROWAVESHIELD = REGISTRY.register("microwaveshield", () -> new MicrowaveshieldMobEffect());
	public static final RegistryObject<MobEffect> STEAM_PROTECTION = REGISTRY.register("steam_protection", () -> new SteamProtectionMobEffect());
	public static final RegistryObject<MobEffect> PONDACTIVE = REGISTRY.register("pondactive", () -> new PondactiveMobEffect());
	public static final RegistryObject<MobEffect> COOLDOWN = REGISTRY.register("cooldown", () -> new CooldownMobEffect());
}
