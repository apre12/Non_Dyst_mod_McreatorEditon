
package net.mcreator.nondystopiamod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ElectrostaticchargeMobEffect extends MobEffect {
	public ElectrostaticchargeMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16711681);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
