package net.mcreator.nondystopiamod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModParticleTypes;
import net.mcreator.nondystopiamod.NonDystopiaModBetaMod;

import java.util.List;
import java.util.Comparator;

public class PearlthrowneditemprotectionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entity == entityiterator) {
					entityiterator.getPersistentData().putDouble("reflected", 100);
				} else {
					if (entityiterator.getPersistentData().getDouble("reflected") > 1) {
						NonDystopiaModBetaMod.queueServerWork(200, () -> {
							entityiterator.getPersistentData().putDouble("reflected", (entityiterator.getPersistentData().getDouble("reflected") - 1));
						});
					} else {
						entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x() * Mth.nextDouble(RandomSource.create(), -0.1, -0.99)),
								(entityiterator.getDeltaMovement().y() * Mth.nextDouble(RandomSource.create(), -0.5, -1.5)), (entityiterator.getDeltaMovement().z() * Mth.nextDouble(RandomSource.create(), -0.1, -0.99))));
						entityiterator.getPersistentData().putDouble("reflected", 100);
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.PEARL_PROTECTION_EFFECT.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1, 1, 1, 1, 1);
					}
				}
			}
		}
	}
}
