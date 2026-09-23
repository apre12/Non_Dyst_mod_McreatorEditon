package net.mcreator.nondystopiamod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModParticleTypes;
import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModMobEffects;

import java.util.List;
import java.util.Comparator;

public class SteamProtectionEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.STEAM_PARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()),
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(NonDystopiaModBetaModMobEffects.STEAM_PROTECTION.get()) ? _livEnt.getEffect(NonDystopiaModBetaModMobEffects.STEAM_PROTECTION.get()).getAmplifier() : 0, 1, 1.5, 1, 0.1);
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(NonDystopiaModBetaModMobEffects.STEAM_PROTECTION.get())) {
					entity.fallDistance = 0;
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 60, 1));
				} else {
					entityiterator.setDeltaMovement(new Vec3(0, 0, 0));
				}
			}
		}
	}
}
