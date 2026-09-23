package net.mcreator.nondystopiamod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.SimpleContainer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModParticleTypes;
import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModMobEffects;
import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModItems;
import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModEntities;
import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModBlocks;
import net.mcreator.nondystopiamod.entity.PrintEntity;
import net.mcreator.nondystopiamod.entity.MicrowaveshootEntity;

import java.util.List;
import java.util.Comparator;

public class WhenPressedPowerKeyProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == NonDystopiaModBetaModItems.PRINTBUCKET.get()) {
			PrintreleaseProcedure.execute(world, entity);
			if (((Entity) world.getEntitiesOfClass(PrintEntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 10, 10, 10), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf((entity.getX()), (entity.getY()), (entity.getZ()))).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
				_toTame.tame(_owner);
		} else {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == Items.WATER_BUCKET) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.STEAM_PROTECTION.get(), 2000, 1));
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == NonDystopiaModBetaModBlocks.MICROWAVE.get().asItem()) {
				MicrowaveonheadProcedure.execute(world, entity);
				(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == NonDystopiaModBetaModBlocks.MICROWAVE.get().asItem()) {
				ItemPreHeatProcedure.execute(world, entity);
				if (entity.onGround()) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.MICROWAVESHIELD.get(), 360, 1));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 1));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 250, 4));
					{
						final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.MICROWAVEDAMAGE.get(), 120, 1));
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.MICROWAVESHOCKPARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 10, 3, 3, 3, 1);
						}
					}
					if (world instanceof Level _level30
							&& _level30.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)), _level30).isPresent()) {
						if (world.isClientSide())
							Minecraft.getInstance().gameRenderer.displayItemActivation((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
						if (entity instanceof Player _player) {
							ItemStack _setstack = (world instanceof Level _lvlSmeltResult
									? _lvlSmeltResult.getRecipeManager().getRecipeFor(RecipeType.SMELTING, new SimpleContainer((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)), _lvlSmeltResult)
											.map(recipe -> recipe.getResultItem(_lvlSmeltResult.registryAccess()).copy()).orElse(ItemStack.EMPTY)
									: ItemStack.EMPTY).copy();
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.MICROWAVESHOCKPARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 20, 1, 1, 1, 1);
						(entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).shrink(1);
					}
				} else {
					if (entity instanceof LivingEntity _livEnt42 && _livEnt42.hasEffect(NonDystopiaModBetaModMobEffects.STEAM_PROTECTION.get())) {
						if (entity.isShiftKeyDown()) {
							{
								final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
								for (Entity entityiterator : _entfound) {
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.STEAM_PARTICLE.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 20, 0.01, 0.01, 0.01, 0);
									entityiterator.setDeltaMovement(new Vec3(0, 0, 0));
								}
							}
						} else {
							entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 2.5), (entity.getLookAngle().y * 3), (entity.getLookAngle().z * 2.5)));
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.MICROWAVESHOCKPARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 20, 1, 1, 1, 2);
						}
					} else {
						entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 1.75), (entity.getLookAngle().y * 0.5), (entity.getLookAngle().z * 1.75)));
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.MICROWAVESHOCKPARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 15, 1, 1, 1, 2);
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 120, 1));
					}
				}
				if (entity.isInWaterOrBubble()) {
					if (entity instanceof LivingEntity _livEnt71 && _livEnt71.hasEffect(NonDystopiaModBetaModMobEffects.STEAM_PROTECTION.get())) {
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(NonDystopiaModBetaModMobEffects.STEAM_PROTECTION.get()) ? _livEnt.getEffect(NonDystopiaModBetaModMobEffects.STEAM_PROTECTION.get()).getAmplifier() : 0) >= 10) {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 30, 10));
							if (world instanceof Level _level && !_level.isClientSide())
								_level.explode(null, (entity.getX()), (entity.getY() - 2), (entity.getZ()), 5, Level.ExplosionInteraction.MOB);
							if (entity instanceof LivingEntity _entity)
								_entity.removeAllEffects();
						} else {
							if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.STEAM_PROTECTION.get(), 360,
										(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(NonDystopiaModBetaModMobEffects.STEAM_PROTECTION.get())
												? _livEnt.getEffect(NonDystopiaModBetaModMobEffects.STEAM_PROTECTION.get()).getAmplifier()
												: 0) + 1)));
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.MICROWAVESHOCKPARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 20, 3, 3, 3, 10);
						}
					} else {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.STEAM_PROTECTION.get(), 360, 1));
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.MICROWAVESHOCKPARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 20, 3, 3, 3, 10);
					}
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == NonDystopiaModBetaModItems.FREQUENCYMICROWAVE.get()) {
					if (entity.isShiftKeyDown()) {
						for (int index0 = 0; index0 < 10; index0++) {
							entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * (-0.2)), (entity.getLookAngle().y * 0), (entity.getLookAngle().z * (-0.2))));
							{
								Entity _shootFrom = entity;
								Level projectileLevel = _shootFrom.level();
								if (!projectileLevel.isClientSide()) {
									Projectile _entityToSpawn = new Object() {
										public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
											AbstractArrow entityToSpawn = new MicrowaveshootEntity(NonDystopiaModBetaModEntities.MICROWAVESHOOT.get(), level);
											entityToSpawn.setOwner(shooter);
											entityToSpawn.setBaseDamage(damage);
											entityToSpawn.setKnockback(knockback);
											entityToSpawn.setSilent(true);
											entityToSpawn.setPierceLevel(piercing);
											entityToSpawn.setSecondsOnFire(100);
											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, 3, 1, (byte) 4);
									_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
									_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 10);
									projectileLevel.addFreshEntity(_entityToSpawn);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.MICROWAVESHOCKPARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 3, 3, 3, 3, 2);
						}
					}
				} else if (entity.isShiftKeyDown()) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 40, 32));
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.MICROWAVESHIELD.get(), 360, 3));
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.MICROWAVESHOCKPARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 5, 3, 3, 3, 1);
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.ELECDISCHARGE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 5, 3, 3, 3, 1);
				}
			}
		}
	}
}
