
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecrack.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.minecrack.entity.FlyingCheeseEntity;
import net.mcreator.minecrack.entity.CheeseLordEntityProjectile;
import net.mcreator.minecrack.entity.CheeseLordEntity;
import net.mcreator.minecrack.MinecrackMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecrackModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MinecrackMod.MODID);
	public static final RegistryObject<EntityType<FlyingCheeseEntity>> FLYING_CHEESE = register("flying_cheese",
			EntityType.Builder.<FlyingCheeseEntity>of(FlyingCheeseEntity::new, MobCategory.MISC).setCustomClientFactory(FlyingCheeseEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CheeseLordEntity>> CHEESE_LORD = register("cheese_lord",
			EntityType.Builder.<CheeseLordEntity>of(CheeseLordEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CheeseLordEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CheeseLordEntityProjectile>> CHEESE_LORD_PROJECTILE = register("projectile_cheese_lord", EntityType.Builder.<CheeseLordEntityProjectile>of(CheeseLordEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(CheeseLordEntityProjectile::new).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CheeseLordEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CHEESE_LORD.get(), CheeseLordEntity.createAttributes().build());
	}
}
