
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nondystopiamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.nondystopiamod.item.WrittenFloopySpeekerItem;
import net.mcreator.nondystopiamod.item.WrittenFloopyPondItem;
import net.mcreator.nondystopiamod.item.WrittenFloopyGestickItem;
import net.mcreator.nondystopiamod.item.WrittenFloopyCHaPItem;
import net.mcreator.nondystopiamod.item.UranusItem;
import net.mcreator.nondystopiamod.item.TonercartridgeItem;
import net.mcreator.nondystopiamod.item.SimplegunItem;
import net.mcreator.nondystopiamod.item.RedcoilItem;
import net.mcreator.nondystopiamod.item.PrintbucketItem;
import net.mcreator.nondystopiamod.item.OnlyOneUseBladeItem;
import net.mcreator.nondystopiamod.item.NeutroncoreItem;
import net.mcreator.nondystopiamod.item.MicrowavefrequencyitemItem;
import net.mcreator.nondystopiamod.item.MeteoritepickaxeItem;
import net.mcreator.nondystopiamod.item.MeteoriteingotItem;
import net.mcreator.nondystopiamod.item.MagicbookItem;
import net.mcreator.nondystopiamod.item.IronpipeItem;
import net.mcreator.nondystopiamod.item.HydrateItem;
import net.mcreator.nondystopiamod.item.FrequencymicrowaveItem;
import net.mcreator.nondystopiamod.item.FloopyItem;
import net.mcreator.nondystopiamod.item.EmptyTonercartridgeItem;
import net.mcreator.nondystopiamod.item.ElectroHeatToolItem;
import net.mcreator.nondystopiamod.item.CopperwireItem;
import net.mcreator.nondystopiamod.item.BulletitemItem;
import net.mcreator.nondystopiamod.NonDystopiaModBetaMod;

public class NonDystopiaModBetaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NonDystopiaModBetaMod.MODID);
	public static final RegistryObject<Item> ONLY_ONE_USE_BLADE = REGISTRY.register("only_one_use_blade", () -> new OnlyOneUseBladeItem());
	public static final RegistryObject<Item> URANUS = REGISTRY.register("uranus", () -> new UranusItem());
	public static final RegistryObject<Item> HELIUM_CLOUD = block(NonDystopiaModBetaModBlocks.HELIUM_CLOUD);
	public static final RegistryObject<Item> PIPE = block(NonDystopiaModBetaModBlocks.PIPE);
	public static final RegistryObject<Item> FLOOPY = REGISTRY.register("floopy", () -> new FloopyItem());
	public static final RegistryObject<Item> WRITTEN_FLOOPY_C_HA_P = REGISTRY.register("written_floopy_c_ha_p", () -> new WrittenFloopyCHaPItem());
	public static final RegistryObject<Item> IRONPIPE = REGISTRY.register("ironpipe", () -> new IronpipeItem());
	public static final RegistryObject<Item> PRINT_SPAWN_EGG = REGISTRY.register("print_spawn_egg", () -> new ForgeSpawnEggItem(NonDystopiaModBetaModEntities.PRINT, -13421773, -3355444, new Item.Properties()));
	public static final RegistryObject<Item> IRONPIPEASBLOCK = block(NonDystopiaModBetaModBlocks.IRONPIPEASBLOCK);
	public static final RegistryObject<Item> URANUSSKYFISH_SPAWN_EGG = REGISTRY.register("uranusskyfish_spawn_egg", () -> new ForgeSpawnEggItem(NonDystopiaModBetaModEntities.URANUSSKYFISH, -3342388, -16724788, new Item.Properties()));
	public static final RegistryObject<Item> GESTICK_SPAWN_EGG = REGISTRY.register("gestick_spawn_egg", () -> new ForgeSpawnEggItem(NonDystopiaModBetaModEntities.GESTICK, -13369498, -6710887, new Item.Properties()));
	public static final RegistryObject<Item> WRITTEN_FLOOPY_SPEEKER = REGISTRY.register("written_floopy_speeker", () -> new WrittenFloopySpeekerItem());
	public static final RegistryObject<Item> SPEEKER_SPAWN_EGG = REGISTRY.register("speeker_spawn_egg", () -> new ForgeSpawnEggItem(NonDystopiaModBetaModEntities.SPEEKER, -1, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> MICROWAVE = block(NonDystopiaModBetaModBlocks.MICROWAVE);
	public static final RegistryObject<Item> REDCOIL = REGISTRY.register("redcoil", () -> new RedcoilItem());
	public static final RegistryObject<Item> COPPERWIRE = REGISTRY.register("copperwire", () -> new CopperwireItem());
	public static final RegistryObject<Item> MEICROSPENCER_SPAWN_EGG = REGISTRY.register("meicrospencer_spawn_egg", () -> new ForgeSpawnEggItem(NonDystopiaModBetaModEntities.MEICROSPENCER, -52, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> MAGICBOOK = REGISTRY.register("magicbook", () -> new MagicbookItem());
	public static final RegistryObject<Item> SIMPLEGUN = REGISTRY.register("simplegun", () -> new SimplegunItem());
	public static final RegistryObject<Item> BULLETITEM = REGISTRY.register("bulletitem", () -> new BulletitemItem());
	public static final RegistryObject<Item> TONERCARTRIDGE = REGISTRY.register("tonercartridge", () -> new TonercartridgeItem());
	public static final RegistryObject<Item> PRINTBUCKET = REGISTRY.register("printbucket", () -> new PrintbucketItem());
	public static final RegistryObject<Item> FREQUENCYMICROWAVE = REGISTRY.register("frequencymicrowave", () -> new FrequencymicrowaveItem());
	public static final RegistryObject<Item> MICROWAVEFREQUENCYITEM = REGISTRY.register("microwavefrequencyitem", () -> new MicrowavefrequencyitemItem());
	public static final RegistryObject<Item> METEOSTONE = block(NonDystopiaModBetaModBlocks.METEOSTONE);
	public static final RegistryObject<Item> ELECTRO_HEAT_TOOL = REGISTRY.register("electro_heat_tool", () -> new ElectroHeatToolItem());
	public static final RegistryObject<Item> METEORITE = block(NonDystopiaModBetaModBlocks.METEORITE);
	public static final RegistryObject<Item> METEORITEINGOT = REGISTRY.register("meteoriteingot", () -> new MeteoriteingotItem());
	public static final RegistryObject<Item> METEORITEPICKAXE = REGISTRY.register("meteoritepickaxe", () -> new MeteoritepickaxeItem());
	public static final RegistryObject<Item> WRITTEN_FLOOPY_GESTICK = REGISTRY.register("written_floopy_gestick", () -> new WrittenFloopyGestickItem());
	public static final RegistryObject<Item> EMPTY_TONERCARTRIDGE = REGISTRY.register("empty_tonercartridge", () -> new EmptyTonercartridgeItem());
	public static final RegistryObject<Item> WRITTEN_FLOOPY_POND = REGISTRY.register("written_floopy_pond", () -> new WrittenFloopyPondItem());
	public static final RegistryObject<Item> METEO_TILE = block(NonDystopiaModBetaModBlocks.METEO_TILE);
	public static final RegistryObject<Item> HYDRATE_ICE = block(NonDystopiaModBetaModBlocks.HYDRATE_ICE);
	public static final RegistryObject<Item> HYDRATEICEORE = block(NonDystopiaModBetaModBlocks.HYDRATEICEORE);
	public static final RegistryObject<Item> HYDRATE = REGISTRY.register("hydrate", () -> new HydrateItem());
	public static final RegistryObject<Item> URANUSHYDRATEDIRT = block(NonDystopiaModBetaModBlocks.URANUSHYDRATEDIRT);
	public static final RegistryObject<Item> SILICOHIDRATEWOOD = block(NonDystopiaModBetaModBlocks.SILICOHIDRATEWOOD);
	public static final RegistryObject<Item> HYDROLEAF = block(NonDystopiaModBetaModBlocks.HYDROLEAF);
	public static final RegistryObject<Item> SILICONHYDRATEPLANK = block(NonDystopiaModBetaModBlocks.SILICONHYDRATEPLANK);
	public static final RegistryObject<Item> TEMPORALBOX_SPAWN_EGG = REGISTRY.register("temporalbox_spawn_egg", () -> new ForgeSpawnEggItem(NonDystopiaModBetaModEntities.TEMPORALBOX, -16777216, -256, new Item.Properties()));
	public static final RegistryObject<Item> NEUTRONCORE = REGISTRY.register("neutroncore", () -> new NeutroncoreItem());
	public static final RegistryObject<Item> NEUTRONPILLERENTITY_SPAWN_EGG = REGISTRY.register("neutronpillerentity_spawn_egg",
			() -> new ForgeSpawnEggItem(NonDystopiaModBetaModEntities.NEUTRONPILLERENTITY, -16777216, -7893504, new Item.Properties()));
	public static final RegistryObject<Item> NEUTRONPILLERBLOCK = block(NonDystopiaModBetaModBlocks.NEUTRONPILLERBLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
