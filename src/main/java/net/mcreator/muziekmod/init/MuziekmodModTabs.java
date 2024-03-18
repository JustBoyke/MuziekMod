
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.muziekmod.init;

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

import net.mcreator.muziekmod.MuziekmodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MuziekmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MuziekmodMod.MODID);
	public static final RegistryObject<CreativeModeTab> MUZIEK_MOD = REGISTRY.register("muziek_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.muziekmod.muziek_mod")).icon(() -> new ItemStack(MuziekmodModItems.NSOMROEP.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MuziekmodModItems.EUROPAPA.get());
				tabData.accept(MuziekmodModItems.IMGOOD.get());
				tabData.accept(MuziekmodModItems.SCATMAN.get());
				tabData.accept(MuziekmodModItems.PI.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(MuziekmodModItems.NSOMROEP.get());
		}
	}
}
