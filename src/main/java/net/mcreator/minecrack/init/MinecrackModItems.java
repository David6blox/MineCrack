
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.minecrack.item.CheeseItem;
import net.mcreator.minecrack.item.CheeseCannonItem;
import net.mcreator.minecrack.MinecrackMod;

public class MinecrackModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecrackMod.MODID);
	public static final RegistryObject<Item> CHEESE_BLOCK = block(MinecrackModBlocks.CHEESE_BLOCK);
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> CHEESE_CANNON = REGISTRY.register("cheese_cannon", () -> new CheeseCannonItem());
	public static final RegistryObject<Item> CHEESE_LORD_SPAWN_EGG = REGISTRY.register("cheese_lord_spawn_egg", () -> new ForgeSpawnEggItem(MinecrackModEntities.CHEESE_LORD, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
