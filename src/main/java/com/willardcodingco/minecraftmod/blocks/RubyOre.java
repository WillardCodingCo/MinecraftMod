package com.willardcodingco.minecraftmod.blocks;

import java.util.Random;

import com.willardcodingco.minecraftmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase
{
	
	public RubyOre(String name, Material material)
	{
		
		//call blockbase constructor
		super(name, material);
		
		//set block specific parameters
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("Pickaxe", 2);
		
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune )
	{
		//item to be dropped when block is mined
		return ModItems.RUBY;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		
		int max = 4;
		int min = 1;
		
		return rand.nextInt(max-min+1) + min;
		
	}

}
