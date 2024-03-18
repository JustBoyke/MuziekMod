
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.muziekmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.muziekmod.MuziekmodMod;

public class MuziekmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MuziekmodMod.MODID);
	public static final RegistryObject<SoundEvent> DINGDONGDING = REGISTRY.register("dingdongding", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("muziekmod", "dingdongding")));
	public static final RegistryObject<SoundEvent> IMGOOD = REGISTRY.register("imgood", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("muziekmod", "imgood")));
	public static final RegistryObject<SoundEvent> PI_SONG = REGISTRY.register("pi_song", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("muziekmod", "pi_song")));
	public static final RegistryObject<SoundEvent> SCATMAN = REGISTRY.register("scatman", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("muziekmod", "scatman")));
	public static final RegistryObject<SoundEvent> EUROPAPA = REGISTRY.register("europapa", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("muziekmod", "europapa")));
}
