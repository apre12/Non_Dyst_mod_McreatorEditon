package net.mcreator.nondystopiamod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModItems;
import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModBlocks;

public class PrintisTameableProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WATER_BUCKET) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(Items.WATER_BUCKET);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (sourceentity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(NonDystopiaModBetaModItems.PRINTBUCKET.get()).copy();
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == NonDystopiaModBetaModItems.EMPTY_TONERCARTRIDGE.get()) {
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(NonDystopiaModBetaModItems.EMPTY_TONERCARTRIDGE.get(), 100);
				if (sourceentity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(NonDystopiaModBetaModItems.EMPTY_TONERCARTRIDGE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 200, 2));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SPORE_BLOSSOM_AIR, (entity.getX()), (entity.getY()), (entity.getZ()), 50, 1, 1, 1, 0.01);
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(NonDystopiaModBetaModItems.TONERCARTRIDGE.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if (entity instanceof LivingEntity _livEnt16 && _livEnt16.hasEffect(MobEffects.WEAKNESS)) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.ANGRY_VILLAGER, (entity.getX()), (entity.getY()), (entity.getZ()), 50, 0.01, 0.01, 0.01, 0.01);
			} else {
				if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == NonDystopiaModBetaModItems.TONERCARTRIDGE.get()) {
					if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).isDamaged()) {
						if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 200, 3));
						{
							ItemStack _ist = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
							if (_ist.hurt(-10, RandomSource.create(), null)) {
								_ist.shrink(1);
								_ist.setDamageValue(0);
							}
						}
					}
				}
			}
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == NonDystopiaModBetaModBlocks.METEOSTONE.get().asItem()) {
				if (entity instanceof LivingEntity _livEnt30 && _livEnt30.hasEffect(MobEffects.REGENERATION)) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.pointed_dripstone.drip_water")), SoundSource.VOICE, (float) 1.5,
									5);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.pointed_dripstone.drip_water")), SoundSource.VOICE, (float) 1.5, 5, false);
						}
					}
				} else {
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(NonDystopiaModBetaModBlocks.METEOSTONE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SPORE_BLOSSOM_AIR, (entity.getX()), (entity.getY()), (entity.getZ()), 50, 0.001, 0.001, 0.001, 0.01);
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(NonDystopiaModBetaModItems.METEORITEINGOT.get()));
						entityToSpawn.setPickUpDelay(2);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == NonDystopiaModBetaModItems.METEORITEINGOT.get()) {
				if (entity instanceof LivingEntity _livEnt47 && _livEnt47.hasEffect(MobEffects.REGENERATION)) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.pointed_dripstone.drip_water")), SoundSource.VOICE, (float) 1.5,
									5);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.pointed_dripstone.drip_water")), SoundSource.VOICE, (float) 1.5, 5, false);
						}
					}
				} else {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 2));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SPORE_BLOSSOM_AIR, (entity.getX()), (entity.getY()), (entity.getZ()), 50, 0.001, 0.001, 0.001, 0.01);
					if (Mth.nextInt(RandomSource.create(), 1, 5) == 1) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.IRON_INGOT));
							entityToSpawn.setPickUpDelay(2);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 2) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.COPPER_INGOT));
							entityToSpawn.setPickUpDelay(2);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 3) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.GOLD_INGOT));
							entityToSpawn.setPickUpDelay(2);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Mth.nextInt(RandomSource.create(), 1, 5) == 4) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.REDSTONE));
							entityToSpawn.setPickUpDelay(2);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.GLOWSTONE_DUST));
							entityToSpawn.setPickUpDelay(2);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(NonDystopiaModBetaModItems.METEORITEINGOT.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
	}
}
