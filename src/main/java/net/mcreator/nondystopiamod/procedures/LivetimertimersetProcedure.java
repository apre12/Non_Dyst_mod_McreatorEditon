package net.mcreator.nondystopiamod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModMobEffects;

public class LivetimertimersetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.LIVETIMER.get(), 200, 60, false, false));
	}
}
