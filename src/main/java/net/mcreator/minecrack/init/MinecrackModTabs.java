
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.minecrack.MinecrackMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecrackModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecrackMod.MODID);
	public static final RegistryObject<CreativeModeTab> MINE_CRACK = REGISTRY.register("mine_crack",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.minecrack.mine_crack")).icon(() -> new ItemStack(MinecrackModBlocks.CHEESE_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MinecrackModItems.CHEESE.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(MinecrackModItems.CHEESE_LORD_SPAWN_EGG.get());

		}
	}
}
