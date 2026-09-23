package net.mcreator.nondystopiamod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.nondystopiamod.init.NonDystopiaModBetaModBlocks;

public class MicrowavedamageeffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == NonDystopiaModBetaModBlocks.MICROWAVE.get().asItem()) {
			entity.clearFire();
		} else {
			entity.setSecondsOnFire(1);
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x * 0), (entity.getLookAngle().y * 0), (entity.getLookAngle().z * 0)));
		}
	}
}
