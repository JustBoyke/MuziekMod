
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.muziekmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.muziekmod.item.ScatmanItem;
import net.mcreator.muziekmod.item.PiItem;
import net.mcreator.muziekmod.item.NsomroepItem;
import net.mcreator.muziekmod.item.ImgoodItem;
import net.mcreator.muziekmod.item.EuropapaItem;
import net.mcreator.muziekmod.MuziekmodMod;

public class MuziekmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MuziekmodMod.MODID);
	public static final RegistryObject<Item> NSOMROEP = REGISTRY.register("nsomroep", () -> new NsomroepItem());
	public static final RegistryObject<Item> EUROPAPA = REGISTRY.register("europapa", () -> new EuropapaItem());
	public static final RegistryObject<Item> IMGOOD = REGISTRY.register("imgood", () -> new ImgoodItem());
	public static final RegistryObject<Item> SCATMAN = REGISTRY.register("scatman", () -> new ScatmanItem());
	public static final RegistryObject<Item> PI = REGISTRY.register("pi", () -> new PiItem());
}
