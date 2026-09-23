
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nondystopiamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.nondystopiamod.world.inventory.MicrowaveGUIMenu;
import net.mcreator.nondystopiamod.NonDystopiaModBetaMod;

public class NonDystopiaModBetaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, NonDystopiaModBetaMod.MODID);
	public static final RegistryObject<MenuType<MicrowaveGUIMenu>> MICROWAVE_GUI = REGISTRY.register("microwave_gui", () -> IForgeMenuType.create(MicrowaveGUIMenu::new));
}
