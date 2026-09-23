package net.mcreator.nondystopiamod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.commands.arguments.EntityAnchorArgument;

import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModMobEffects;
import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModEntities;
import net.mcreator.nondystopiamod.entity.TemporalboxEntity;
import net.mcreator.nondystopiamod.entity.NeutronpillerEntity;
import net.mcreator.nondystopiamod.NonDystopiaModBetaMod;

public class TemporalyboxbattlesystemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double laser_angle = 0;
		entity.setDeltaMovement(new Vec3(0, 0, 0));
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			entity.setDeltaMovement(new Vec3(0, 0, 0));
			if (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(NonDystopiaModBetaModMobEffects.COOLDOWN.get())) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.PEARLPROTECTION.get(), 20, 1));
			} else {
				if ((entity.getPersistentData().getString("charge")).equals("idle")) {
					if (Math.random() < 0.05) {
						entity.getPersistentData().putString("charge", "charge1");
					}
					if (Math.random() < 0.04) {
						entity.getPersistentData().putString("charge", "charge2");
					}
					if (Math.random() < 0.03) {
						entity.getPersistentData().putString("charge", "laser");
					}
				}
			}
			if ((entity.getPersistentData().getString("charge")).equals("charge1")) {
				if (entity instanceof TemporalboxEntity) {
					((TemporalboxEntity) entity).setAnimation("charge1change");
				}
				NonDystopiaModBetaMod.queueServerWork(140, () -> {
					if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
								((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new NeutronpillerEntity(NonDystopiaModBetaModEntities.NEUTRONPILLER.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 0, 0);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 15, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.COOLDOWN.get(), 255, 1));
					}
					NonDystopiaModBetaMod.queueServerWork(140, () -> {
						if (entity instanceof TemporalboxEntity) {
							((TemporalboxEntity) entity).setAnimation("charge1back");
						}
						entity.getPersistentData().putString("charge", "idle");
					});
				});
			}
			if ((entity.getPersistentData().getString("charge")).equals("charge2")) {
				if (entity instanceof TemporalboxEntity) {
					((TemporalboxEntity) entity).setAnimation("charge2change");
				}
				NonDystopiaModBetaMod.queueServerWork(280, () -> {
					if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
						entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
								((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
						NonDystopiaModBetaMod.queueServerWork(20, () -> {
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrow entityToSpawn = new NeutronpillerEntity(NonDystopiaModBetaModEntities.NEUTRONPILLER.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 0, 0, (byte) 5);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 20, 0);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.COOLDOWN.get(), 255, 1));
						});
					}
					NonDystopiaModBetaMod.queueServerWork(140, () -> {
						if (entity instanceof TemporalboxEntity) {
							((TemporalboxEntity) entity).setAnimation("charge2back");
						}
						entity.getPersistentData().putString("charge", "idle");
					});
				});
			}
			if ((entity.getPersistentData().getString("charge")).equals("laser")) {
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					entity.lookAt(EntityAnchorArgument.Anchor.EYES,
							new Vec3((entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
									((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
									(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())));
				}
				if (entity instanceof TemporalboxEntity) {
					((TemporalboxEntity) entity).setAnimation("lasermode_change");
				}
				NonDystopiaModBetaMod.queueServerWork(100, () -> {
					if (entity instanceof TemporalboxEntity) {
						((TemporalboxEntity) entity).setAnimation("lasermode_idle");
					}
					if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
						{
							Entity _ent = entity;
							_ent.setYRot((float) (entity.getYRot() + 5));
							_ent.setXRot((float) ((entity.getY() - (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()) - 5));
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level();
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
										AbstractArrow entityToSpawn = new NeutronpillerEntity(NonDystopiaModBetaModEntities.NEUTRONPILLER.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										entityToSpawn.setPierceLevel(piercing);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 1, 0, (byte) 5);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 15, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.COOLDOWN.get(), 255, 1));
					}
					NonDystopiaModBetaMod.queueServerWork(360, () -> {
						if (entity instanceof TemporalboxEntity) {
							((TemporalboxEntity) entity).setAnimation("lasermode_back");
						}
						entity.getPersistentData().putString("charge", "idle");
					});
				});
			}
		}
	}
}
