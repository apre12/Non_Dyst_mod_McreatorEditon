
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nondystopiamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.nondystopiamod.NonDystopiaModBetaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NonDystopiaModBetaModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NonDystopiaModBetaMod.MODID);
	public static final RegistryObject<CreativeModeTab> NONDYSTPIA = REGISTRY.register("nondystpia",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.non_dystopia_mod_beta.nondystpia")).icon(() -> new ItemStack(NonDystopiaModBetaModItems.PRINTBUCKET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NonDystopiaModBetaModItems.ONLY_ONE_USE_BLADE.get());
				tabData.accept(NonDystopiaModBetaModItems.URANUS.get());
				tabData.accept(NonDystopiaModBetaModBlocks.HELIUM_CLOUD.get().asItem());
				tabData.accept(NonDystopiaModBetaModBlocks.PIPE.get().asItem());
				tabData.accept(NonDystopiaModBetaModItems.FLOOPY.get());
				tabData.accept(NonDystopiaModBetaModItems.WRITTEN_FLOOPY_C_HA_P.get());
				tabData.accept(NonDystopiaModBetaModItems.IRONPIPE.get());
				tabData.accept(NonDystopiaModBetaModBlocks.IRONPIPEASBLOCK.get().asItem());
				tabData.accept(NonDystopiaModBetaModItems.WRITTEN_FLOOPY_SPEEKER.get());
				tabData.accept(NonDystopiaModBetaModBlocks.MICROWAVE.get().asItem());
				tabData.accept(NonDystopiaModBetaModItems.REDCOIL.get());
				tabData.accept(NonDystopiaModBetaModItems.COPPERWIRE.get());
				tabData.accept(NonDystopiaModBetaModItems.MAGICBOOK.get());
				tabData.accept(NonDystopiaModBetaModItems.SIMPLEGUN.get());
				tabData.accept(NonDystopiaModBetaModItems.BULLETITEM.get());
				tabData.accept(NonDystopiaModBetaModItems.TONERCARTRIDGE.get());
				tabData.accept(NonDystopiaModBetaModItems.PRINTBUCKET.get());
				tabData.accept(NonDystopiaModBetaModItems.FREQUENCYMICROWAVE.get());
				tabData.accept(NonDystopiaModBetaModBlocks.METEOSTONE.get().asItem());
				tabData.accept(NonDystopiaModBetaModItems.ELECTRO_HEAT_TOOL.get());
				tabData.accept(NonDystopiaModBetaModBlocks.METEORITE.get().asItem());
				tabData.accept(NonDystopiaModBetaModItems.METEORITEINGOT.get());
				tabData.accept(NonDystopiaModBetaModItems.METEORITEPICKAXE.get());
				tabData.accept(NonDystopiaModBetaModItems.WRITTEN_FLOOPY_GESTICK.get());
				tabData.accept(NonDystopiaModBetaModItems.EMPTY_TONERCARTRIDGE.get());
				tabData.accept(NonDystopiaModBetaModItems.WRITTEN_FLOOPY_POND.get());
				tabData.accept(NonDystopiaModBetaModBlocks.METEO_TILE.get().asItem());
				tabData.accept(NonDystopiaModBetaModBlocks.HYDRATE_ICE.get().asItem());
				tabData.accept(NonDystopiaModBetaModBlocks.HYDRATEICEORE.get().asItem());
				tabData.accept(NonDystopiaModBetaModItems.HYDRATE.get());
				tabData.accept(NonDystopiaModBetaModBlocks.URANUSHYDRATEDIRT.get().asItem());
				tabData.accept(NonDystopiaModBetaModBlocks.SILICOHIDRATEWOOD.get().asItem());
				tabData.accept(NonDystopiaModBetaModBlocks.HYDROLEAF.get().asItem());
				tabData.accept(NonDystopiaModBetaModBlocks.SILICONHYDRATEPLANK.get().asItem());
				tabData.accept(NonDystopiaModBetaModItems.NEUTRONCORE.get());
				tabData.accept(NonDystopiaModBetaModBlocks.NEUTRONPILLERBLOCK.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(NonDystopiaModBetaModItems.PRINT_SPAWN_EGG.get());
			tabData.accept(NonDystopiaModBetaModItems.URANUSSKYFISH_SPAWN_EGG.get());
			tabData.accept(NonDystopiaModBetaModItems.GESTICK_SPAWN_EGG.get());
			tabData.accept(NonDystopiaModBetaModItems.SPEEKER_SPAWN_EGG.get());
			tabData.accept(NonDystopiaModBetaModItems.MEICROSPENCER_SPAWN_EGG.get());
			tabData.accept(NonDystopiaModBetaModItems.TEMPORALBOX_SPAWN_EGG.get());
			tabData.accept(NonDystopiaModBetaModItems.NEUTRONPILLERENTITY_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(NonDystopiaModBetaModBlocks.METEORITE.get().asItem());
			tabData.accept(NonDystopiaModBetaModBlocks.SILICONHYDRATEPLANK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(NonDystopiaModBetaModBlocks.HYDRATE_ICE.get().asItem());
			tabData.accept(NonDystopiaModBetaModBlocks.HYDRATEICEORE.get().asItem());
			tabData.accept(NonDystopiaModBetaModBlocks.URANUSHYDRATEDIRT.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(NonDystopiaModBetaModItems.HYDRATE.get());
		}
	}
}
