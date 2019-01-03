package com.willardcodingco.minecraftmod.init;

import java.util.ArrayList;
import java.util.List;

import com.willardcodingco.minecraftmod.fluids.FluidBase;
import com.willardcodingco.minecraftmod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids
{
	
	public static final List<Fluid> FLUIDS = new ArrayList<Fluid>();
	
	//Fluids
	public static final Fluid RUBY_FLUID = new FluidBase("ruby_fluid", new ResourceLocation(Reference.MOD_ID, "fluids/ruby_fluid_still"), new ResourceLocation(Reference.MOD_ID, "fluids/ruby_fluid_flow"));
	
	//registers fluids
	public static void registerFluids(List<Fluid> fluids)
	{
		
		for( Fluid fluid : fluids )
		{
			
			FluidRegistry.registerFluid(fluid);
			FluidRegistry.addBucketForFluid(fluid);
			
		}
		
	}
	
	//register fluids in FLUIDS array
	public static void registerFluids()
	{
		
		registerFluids(FLUIDS);
		
	}
	
}
