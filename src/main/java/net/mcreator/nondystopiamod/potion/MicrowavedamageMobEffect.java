
package net.mcreator.nondystopiamod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.nondystopiamod.procedures.MicrowavedamageeffectProcedure;

public class MicrowavedamageMobEffect extends MobEffect {
	public MicrowavedamageMobEffect() {
		super(MobEffectCategory.HARMFUL, -26368);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		MicrowavedamageeffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
