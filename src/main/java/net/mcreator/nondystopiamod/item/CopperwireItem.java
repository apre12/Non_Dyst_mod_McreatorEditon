
package net.mcreator.nondystopiamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CopperwireItem extends Item {
	public CopperwireItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
