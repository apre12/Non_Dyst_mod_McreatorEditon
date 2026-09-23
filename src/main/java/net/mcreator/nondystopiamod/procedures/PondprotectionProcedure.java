package net.mcreator.nondystopiamod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModParticleTypes;
import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModMobEffects;

import java.util.List;
import java.util.Comparator;

public class PondprotectionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.POND.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.5, 1.5, 0.5, 0.5);
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(NonDystopiaModBetaModMobEffects.PONDACTIVE.get())) {
					entity.fallDistance = 0;
					entity.clearFire();
				} else {
					entityiterator.setDeltaMovement(new Vec3(0, 0, 0));
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.POND.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 5, 0.05, 0.05, 0.05, 0.01);
				}
			}
		}
	}
}
