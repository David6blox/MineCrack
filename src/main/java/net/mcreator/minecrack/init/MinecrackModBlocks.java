
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.minecrack.block.CheeseBlockBlock;
import net.mcreator.minecrack.MinecrackMod;

public class MinecrackModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MinecrackMod.MODID);
	public static final RegistryObject<Block> CHEESE_BLOCK = REGISTRY.register("cheese_block", () -> new CheeseBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
