
package net.mcreator.nondystopiamod.potion;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.nondystopiamod.procedures.PondprotectionProcedure;

import java.util.List;
import java.util.ArrayList;

public class PondactiveMobEffect extends MobEffect {
	public PondactiveMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16777216);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PondprotectionProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
