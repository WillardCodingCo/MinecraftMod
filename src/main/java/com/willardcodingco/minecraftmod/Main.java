package com.willardcodingco.minecraftmod;

import com.willardcodingco.minecraftmod.init.ModFluids;
import com.willardcodingco.minecraftmod.init.ModRecipes;
import com.willardcodingco.minecraftmod.proxy.CommonProxy;
import com.willardcodingco.minecraftmod.util.Reference;
import com.willardcodingco.minecraftmod.world.ModWorldGen;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod( modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION )
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	static { FluidRegistry.enableUniversalBucket(); }
	
	@EventHandler
	public static void preInit( FMLPreInitializationEvent event )
	{
		
		//register ore generator
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		
		//set up fluids
		ModFluids.registerFluids();
		
	}
	
	@EventHandler
	public static void init( FMLInitializationEvent event )
	{
		
		//initialize recipes created in mod
		ModRecipes.init();
		
	}
	
	@EventHandler
	public static void postInit( FMLPostInitializationEvent event )
	{
		
	}
	
}
