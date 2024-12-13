
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrack.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.minecrack.client.renderer.CheeseLordRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecrackModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MinecrackModEntities.FLYING_CHEESE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecrackModEntities.CHEESE_LORD.get(), CheeseLordRenderer::new);
		event.registerEntityRenderer(MinecrackModEntities.CHEESE_LORD_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
