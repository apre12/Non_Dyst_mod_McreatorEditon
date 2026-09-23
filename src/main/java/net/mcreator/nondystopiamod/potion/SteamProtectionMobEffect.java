
package net.mcreator.nondystopiamod.potion;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.nondystopiamod.procedures.SteamProtectionEffectProcedure;

import java.util.List;
import java.util.ArrayList;

public class SteamProtectionMobEffect extends MobEffect {
	public SteamProtectionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3355444);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		cures.add(new ItemStack(Items.TOTEM_OF_UNDYING));
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SteamProtectionEffectProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
