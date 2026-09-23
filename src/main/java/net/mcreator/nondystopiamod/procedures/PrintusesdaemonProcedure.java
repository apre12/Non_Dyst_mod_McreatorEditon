package net.mcreator.nondystopiamod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModParticleTypes;
import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModMobEffects;
import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModEntities;
import net.mcreator.nondystopiamod.entity.SpeekerEntity;
import net.mcreator.nondystopiamod.entity.GestickEntity;
import net.mcreator.nondystopiamod.entity.GesticbulletEntity;
import net.mcreator.nondystopiamod.NonDystopiaModBetaMod;

import java.util.List;
import java.util.Comparator;

public class PrintusesdaemonProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("ESS_ident", "print");
		entity.getPersistentData().putBoolean("gestick_tonerdata", true);
		entity.getPersistentData().putBoolean("speeker_tonerdata", true);
		entity.getPersistentData().putBoolean("chap_tonerdata", true);
		entity.getPersistentData().putBoolean("pond_tonerdata", true);
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.PEARLPROTECTION.get(), 600, 1));
			if (Math.random() < 0.005) {
				if (entity instanceof LivingEntity _livEnt8 && _livEnt8.hasEffect(NonDystopiaModBetaModMobEffects.COOLDOWN.get())) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.RAIN, (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.1, 0.1, 0.1, 0.1);
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
								((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), 5);
				} else {
					entity.setDeltaMovement(new Vec3(0, 0, 0));
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.NEUTRAL, 1, 3);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate")), SoundSource.NEUTRAL, 1, 3, false);
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.PEARLPROTECTION.get(), 1200, 1));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 6));
					entity.setDeltaMovement(new Vec3(0, 0, 0));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.COOLDOWN.get(), 120, 1));
				}
			}
			if (Math.random() < 0.004) {
				if (entity instanceof LivingEntity _livEnt29 && _livEnt29.hasEffect(NonDystopiaModBetaModMobEffects.COOLDOWN.get())) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.RAIN, (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.1, 0.1, 0.1, 0.1);
				} else {
					for (int index0 = 0; index0 < 30; index0++) {
						for (int index1 = 0; index1 < 60; index1++) {
							entity.setDeltaMovement(new Vec3((Mth.nextDouble(RandomSource.create(), -2, 2)), 0, (Mth.nextDouble(RandomSource.create(), -2, 2))));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.BUBBLE, (entity.getX()), (entity.getY()), (entity.getZ()), 15, 1, 1, 1, 0.1);
						}
						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
								((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new GesticbulletEntity(NonDystopiaModBetaModEntities.GESTICBULLET.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, (float) 0.5, 0);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.COOLDOWN.get(), 120, 1));
				}
			}
			if (Math.random() < 0.03) {
				entity.setDeltaMovement(new Vec3(0, 1, 0));
				NonDystopiaModBetaMod.queueServerWork(60, () -> {
					entity.setDeltaMovement(new Vec3((Mth.nextDouble(RandomSource.create(), -2, 2)), 0, (Mth.nextDouble(RandomSource.create(), -2, 2))));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE, (entity.getX()), (entity.getY()), (entity.getZ()), 15, 1, 1, 1, 0.1);
				});
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.COOLDOWN.get(), 120, 1));
			}
			if (Math.random() < 0.02) {
				if (entity instanceof LivingEntity _livEnt61 && _livEnt61.hasEffect(NonDystopiaModBetaModMobEffects.COOLDOWN.get())) {
					entity.setDeltaMovement(new Vec3((Mth.nextDouble(RandomSource.create(), -3, 3)), 0.05, (Mth.nextDouble(RandomSource.create(), -3, 3))));
				} else {
					for (int index2 = 0; index2 < 10; index2++) {
						for (int index3 = 0; index3 < 3; index3++) {
							NonDystopiaModBetaMod.queueServerWork(1, () -> {
								{
									Entity _ent = entity;
									_ent.teleportTo(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + 2),
											((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()));
									if (_ent instanceof ServerPlayer _serverPlayer)
										_serverPlayer.connection.teleport(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() + 2),
												((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), _ent.getYRot(), _ent.getXRot());
								}
								entity.setDeltaMovement(new Vec3((Mth.nextDouble(RandomSource.create(), -3, 3)), (Mth.nextDouble(RandomSource.create(), -1, 1)), (Mth.nextDouble(RandomSource.create(), -3, 3))));
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.BUBBLE, (entity.getX()), (entity.getY()), (entity.getZ()), 15, 1, 1, 1, 0.1);
							});
						}
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.COOLDOWN.get(), 120, 1));
				}
			}
			if (Math.random() < 0.1) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 5));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 60, 5));
				if (entity instanceof Mob _entity)
					_entity.getNavigation().moveTo(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
							((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ()), 2);
			}
			if (Math.random() < 0.05) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = NonDystopiaModBetaModEntities.GESTICK.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
					}
				}
				{
					final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof GestickEntity) {
							if (entityiterator instanceof Mob _entity && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
						}
					}
				}
			}
			if (Math.random() < 0.01) {
				for (int index4 = 0; index4 < 2; index4++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = NonDystopiaModBetaModEntities.SPEEKER.get().spawn(_level, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
						}
					}
					{
						final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof SpeekerEntity) {
								if (entityiterator instanceof Mob _entity && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _ent)
									_entity.setTarget(_ent);
							}
						}
					}
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) != (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600, 1));
		}
		if (entity.isOnFire()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.POND.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 20, 1, 1, 1, 0.01);
			entity.setSecondsOnFire(0);
		}
	}
}
