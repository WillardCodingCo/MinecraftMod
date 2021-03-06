package com.willardcodingco.minecraftmod.init;

import java.util.ArrayList;
import java.util.List;

import com.willardcodingco.minecraftmod.blocks.BlockBase;
import com.willardcodingco.minecraftmod.blocks.BlockFluidBase;
import com.willardcodingco.minecraftmod.blocks.RubyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	
	//Fluid Blocks
	public static final BlockFluidBase RUBY_FLUID_BLOCK = new BlockFluidBase("ruby_fluid", ModFluids.RUBY_FLUID, Material.WATER);

	
}
