
package net.mcreator.nondystopiamod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptyTonercartridgeItem extends Item {
	public EmptyTonercartridgeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
