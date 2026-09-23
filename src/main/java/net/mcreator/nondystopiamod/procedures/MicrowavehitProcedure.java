package net.mcreator.nondystopiamod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModParticleTypes;
import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModMobEffects;

public class MicrowavehitProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.MICROWAVESHOCKPARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 50, 1, 1, 1, 0.5);
		if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(NonDystopiaModBetaModMobEffects.ELECTROSTATICCHARGE.get())) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(NonDystopiaModBetaModMobEffects.ELECTROSTATICCHARGE.get()) ? _livEnt.getEffect(NonDystopiaModBetaModMobEffects.ELECTROSTATICCHARGE.get()).getAmplifier() : 0) <= 50) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.ELECTROSTATICCHARGE.get(), 360,
							(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(NonDystopiaModBetaModMobEffects.ELECTROSTATICCHARGE.get())
									? _livEnt.getEffect(NonDystopiaModBetaModMobEffects.ELECTROSTATICCHARGE.get()).getAmplifier()
									: 0) + 1)));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 1));
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.ELECDISCHARGE.get()), (entity.getX()), (entity.getY()), (entity.getZ()),
							(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(NonDystopiaModBetaModMobEffects.ELECTROSTATICCHARGE.get())
									? _livEnt.getEffect(NonDystopiaModBetaModMobEffects.ELECTROSTATICCHARGE.get()).getAmplifier()
									: 0) * 2),
							1, 1, 1, 0.02);
			} else {
				entity.setSprinting(false);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = EntityType.LIGHTNING_BOLT.spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.ELECDISCHARGE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 250, 1, 1, 1, 0.5);
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.LIGHTNING_BOLT)), (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.04));
			}
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.ELECTROSTATICCHARGE.get(), 360, 1));
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.MICROWAVEDAMAGE.get(), 360, 1));
		entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("non_dystopia_mod_beta:microwavedamagetype")))), 1);
	}
}
