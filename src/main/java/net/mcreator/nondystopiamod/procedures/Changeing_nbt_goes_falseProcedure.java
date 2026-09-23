package net.mcreator.nondystopiamod.procedures;

import net.minecraft.world.entity.Entity;

public class Changeing_nbt_goes_falseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("charge", "idle");
	}
}
