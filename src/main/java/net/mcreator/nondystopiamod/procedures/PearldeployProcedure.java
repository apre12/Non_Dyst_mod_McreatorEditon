package net.mcreator.nondystopiamod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModParticleTypes;
import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PearldeployProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(NonDystopiaModBetaModMobEffects.PEARLPROTECTION.get())) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(NonDystopiaModBetaModMobEffects.PEARLPROTECTION.get())
					? _livEnt.getEffect(NonDystopiaModBetaModMobEffects.PEARLPROTECTION.get()).getAmplifier()
					: 0) < (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) * 20) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.PEARL_PROTECTION_EFFECT.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0, 0, 0, 1);
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(NonDystopiaModBetaModMobEffects.PEARLPROTECTION.get(),
							entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(NonDystopiaModBetaModMobEffects.PEARLPROTECTION.get()) ? _livEnt.getEffect(NonDystopiaModBetaModMobEffects.PEARLPROTECTION.get()).getDuration() : 0,
							(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(NonDystopiaModBetaModMobEffects.PEARLPROTECTION.get()) ? _livEnt.getEffect(NonDystopiaModBetaModMobEffects.PEARLPROTECTION.get()).getAmplifier() : 0)
									+ 1)));
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (NonDystopiaModBetaModParticleTypes.BEBROKENPEARLPROTECTION.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0, 0, 0, 0.001);
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(NonDystopiaModBetaModMobEffects.PEARLPROTECTION.get());
			}
		}
	}
}
