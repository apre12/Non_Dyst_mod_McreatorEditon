package net.mcreator.nondystopiamod.procedures;

import net.minecraft.world.entity.Entity;

public class LivetimeroutProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
