
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nondystopiamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.nondystopiamod.block.UranushydratedirtBlock;
import net.mcreator.nondystopiamod.block.UranusPortalBlock;
import net.mcreator.nondystopiamod.block.SiliconhydrateplankBlock;
import net.mcreator.nondystopiamod.block.SilicohidratewoodBlock;
import net.mcreator.nondystopiamod.block.PipeBlock;
import net.mcreator.nondystopiamod.block.NeutronpillerblockBlock;
import net.mcreator.nondystopiamod.block.MicrowaveBlock;
import net.mcreator.nondystopiamod.block.MeteostoneBlock;
import net.mcreator.nondystopiamod.block.MeteoriteBlock;
import net.mcreator.nondystopiamod.block.MeteoTileBlock;
import net.mcreator.nondystopiamod.block.IronpipeasblockBlock;
import net.mcreator.nondystopiamod.block.HydroleafBlock;
import net.mcreator.nondystopiamod.block.HydrateiceoreBlock;
import net.mcreator.nondystopiamod.block.HydrateIceBlock;
import net.mcreator.nondystopiamod.block.HeliumCloudBlock;
import net.mcreator.nondystopiamod.NonDystopiaModBetaMod;

public class NonDystopiaModBetaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NonDystopiaModBetaMod.MODID);
	public static final RegistryObject<Block> URANUS_PORTAL = REGISTRY.register("uranus_portal", () -> new UranusPortalBlock());
	public static final RegistryObject<Block> HELIUM_CLOUD = REGISTRY.register("helium_cloud", () -> new HeliumCloudBlock());
	public static final RegistryObject<Block> PIPE = REGISTRY.register("pipe", () -> new PipeBlock());
	public static final RegistryObject<Block> IRONPIPEASBLOCK = REGISTRY.register("ironpipeasblock", () -> new IronpipeasblockBlock());
	public static final RegistryObject<Block> MICROWAVE = REGISTRY.register("microwave", () -> new MicrowaveBlock());
	public static final RegistryObject<Block> METEOSTONE = REGISTRY.register("meteostone", () -> new MeteostoneBlock());
	public static final RegistryObject<Block> METEORITE = REGISTRY.register("meteorite", () -> new MeteoriteBlock());
	public static final RegistryObject<Block> METEO_TILE = REGISTRY.register("meteo_tile", () -> new MeteoTileBlock());
	public static final RegistryObject<Block> HYDRATE_ICE = REGISTRY.register("hydrate_ice", () -> new HydrateIceBlock());
	public static final RegistryObject<Block> HYDRATEICEORE = REGISTRY.register("hydrateiceore", () -> new HydrateiceoreBlock());
	public static final RegistryObject<Block> URANUSHYDRATEDIRT = REGISTRY.register("uranushydratedirt", () -> new UranushydratedirtBlock());
	public static final RegistryObject<Block> SILICOHIDRATEWOOD = REGISTRY.register("silicohidratewood", () -> new SilicohidratewoodBlock());
	public static final RegistryObject<Block> HYDROLEAF = REGISTRY.register("hydroleaf", () -> new HydroleafBlock());
	public static final RegistryObject<Block> SILICONHYDRATEPLANK = REGISTRY.register("siliconhydrateplank", () -> new SiliconhydrateplankBlock());
	public static final RegistryObject<Block> NEUTRONPILLERBLOCK = REGISTRY.register("neutronpillerblock", () -> new NeutronpillerblockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
