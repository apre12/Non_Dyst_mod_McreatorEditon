package net.mcreator.nondystopiamod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;

import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModItems;

public class MinuscartridgeProcedure {
	public static void execute(LevelAccessor world) {
		{
			ItemStack _ist = new ItemStack(NonDystopiaModBetaModItems.TONERCARTRIDGE.get());
			if (_ist.hurt((int) 0.001, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
	}
}
