
package net.mcreator.nondystopiamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HydrateItem extends Item {
	public HydrateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(2f).build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 3;
	}
}
