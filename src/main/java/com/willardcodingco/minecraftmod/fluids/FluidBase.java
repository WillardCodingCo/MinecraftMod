package com.willardcodingco.minecraftmod.fluids;

import com.willardcodingco.minecraftmod.init.ModFluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidBase extends Fluid
{
	
	public FluidBase(String name, ResourceLocation still, ResourceLocation flowing)
	{
		
		super(name, still, flowing);
		
		ModFluids.FLUIDS.add(this);
		
	}
	
}
