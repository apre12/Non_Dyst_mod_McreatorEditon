
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nondystopiamod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.nondystopiamod.entity.UranusskyfishEntity;
import net.mcreator.nondystopiamod.entity.ThrowedpipeEntity;
import net.mcreator.nondystopiamod.entity.TemporalboxEntity;
import net.mcreator.nondystopiamod.entity.SpeekerEntity;
import net.mcreator.nondystopiamod.entity.PrintEntityProjectile;
import net.mcreator.nondystopiamod.entity.PrintEntity;
import net.mcreator.nondystopiamod.entity.NeutronpillerentityEntity;
import net.mcreator.nondystopiamod.entity.NeutronpillerEntity;
import net.mcreator.nondystopiamod.entity.MicrowaveshootEntity;
import net.mcreator.nondystopiamod.entity.MeicrospencerEntity;
import net.mcreator.nondystopiamod.entity.MagicEntity;
import net.mcreator.nondystopiamod.entity.GestickEntity;
import net.mcreator.nondystopiamod.entity.GesticbulletEntity;
import net.mcreator.nondystopiamod.entity.BulletEntity;
import net.mcreator.nondystopiamod.NonDystopiaModBetaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NonDystopiaModBetaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NonDystopiaModBetaMod.MODID);
	public static final RegistryObject<EntityType<PrintEntity>> PRINT = register("print",
			EntityType.Builder.<PrintEntity>of(PrintEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(120).setUpdateInterval(3).setCustomClientFactory(PrintEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PrintEntityProjectile>> PRINT_PROJECTILE = register("projectile_print", EntityType.Builder.<PrintEntityProjectile>of(PrintEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(PrintEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<UranusskyfishEntity>> URANUSSKYFISH = register("uranusskyfish",
			EntityType.Builder.<UranusskyfishEntity>of(UranusskyfishEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(UranusskyfishEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GestickEntity>> GESTICK = register("gestick",
			EntityType.Builder.<GestickEntity>of(GestickEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GestickEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpeekerEntity>> SPEEKER = register("speeker",
			EntityType.Builder.<SpeekerEntity>of(SpeekerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(SpeekerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MeicrospencerEntity>> MEICROSPENCER = register("meicrospencer", EntityType.Builder.<MeicrospencerEntity>of(MeicrospencerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(120).setUpdateInterval(3).setCustomClientFactory(MeicrospencerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MagicEntity>> MAGIC = register("magic",
			EntityType.Builder.<MagicEntity>of(MagicEntity::new, MobCategory.MISC).setCustomClientFactory(MagicEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ThrowedpipeEntity>> THROWEDPIPE = register("throwedpipe",
			EntityType.Builder.<ThrowedpipeEntity>of(ThrowedpipeEntity::new, MobCategory.MISC).setCustomClientFactory(ThrowedpipeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BulletEntity>> BULLET = register("bullet",
			EntityType.Builder.<BulletEntity>of(BulletEntity::new, MobCategory.MISC).setCustomClientFactory(BulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MicrowaveshootEntity>> MICROWAVESHOOT = register("microwaveshoot",
			EntityType.Builder.<MicrowaveshootEntity>of(MicrowaveshootEntity::new, MobCategory.MISC).setCustomClientFactory(MicrowaveshootEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GesticbulletEntity>> GESTICBULLET = register("gesticbullet",
			EntityType.Builder.<GesticbulletEntity>of(GesticbulletEntity::new, MobCategory.MISC).setCustomClientFactory(GesticbulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TemporalboxEntity>> TEMPORALBOX = register("temporalbox", EntityType.Builder.<TemporalboxEntity>of(TemporalboxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(16).setUpdateInterval(3).setCustomClientFactory(TemporalboxEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<NeutronpillerEntity>> NEUTRONPILLER = register("neutronpiller",
			EntityType.Builder.<NeutronpillerEntity>of(NeutronpillerEntity::new, MobCategory.MISC).setCustomClientFactory(NeutronpillerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NeutronpillerentityEntity>> NEUTRONPILLERENTITY = register("neutronpillerentity", EntityType.Builder.<NeutronpillerentityEntity>of(NeutronpillerentityEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NeutronpillerentityEntity::new).fireImmune().sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PrintEntity.init();
			UranusskyfishEntity.init();
			GestickEntity.init();
			SpeekerEntity.init();
			MeicrospencerEntity.init();
			TemporalboxEntity.init();
			NeutronpillerentityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PRINT.get(), PrintEntity.createAttributes().build());
		event.put(URANUSSKYFISH.get(), UranusskyfishEntity.createAttributes().build());
		event.put(GESTICK.get(), GestickEntity.createAttributes().build());
		event.put(SPEEKER.get(), SpeekerEntity.createAttributes().build());
		event.put(MEICROSPENCER.get(), MeicrospencerEntity.createAttributes().build());
		event.put(TEMPORALBOX.get(), TemporalboxEntity.createAttributes().build());
		event.put(NEUTRONPILLERENTITY.get(), NeutronpillerentityEntity.createAttributes().build());
	}
}
