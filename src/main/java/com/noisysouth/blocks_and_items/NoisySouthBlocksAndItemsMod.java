package com.noisysouth.blocks_and_items;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MODID, name=Reference.MODNAME, version=Reference.VERSION, acceptedMinecraftVersions=Reference.ACCEPTED_MINECRAFT_VERSIONS)
public class NoisySouthBlocksAndItemsMod {
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(Reference.MODID + ":preInit");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println(Reference.MODID + ":init");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println(Reference.MODID + ":postInit");
	}
}
