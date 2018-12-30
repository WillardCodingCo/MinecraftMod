package com.willardcodingco.minecraftmod.world;

import java.util.Random;

import com.willardcodingco.minecraftmod.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator
{
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		
		if( world.provider.getDimension() == 0)
		{
			
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
			
		}
		
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		
		//call generate ore for each ore that should be generated in the overworld
		generateOre(ModBlocks.RUBY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(7) + 4, 15);
		
	}
	
	//call to generate veins of each ore in each chunk
	//may want to revamp to randomly create size between passed bounds
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		
		int deltaY = maxY - minY;
		
		//generates ore body for up to chance times
		for(int i = 0; i < chances; i++)
		{
			
			//generates random position within chunk
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			//creates ore vein and places in world
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
			
		}
		
	}
	
}
