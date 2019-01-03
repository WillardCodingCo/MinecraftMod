package com.willardcodingco.minecraftmod.blocks;

import com.willardcodingco.minecraftmod.Main;
import com.willardcodingco.minecraftmod.init.ModBlocks;
import com.willardcodingco.minecraftmod.init.ModItems;
import com.willardcodingco.minecraftmod.util.IHasModel;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFluidBase extends BlockFluidClassic implements IHasModel
{
	
	
	public BlockFluidBase(String name, Fluid fluid, Material material )
	{
		
		this(name, fluid, material, CreativeTabs.MISC);
		
	}
	
	public BlockFluidBase(String name, Fluid fluid, Material material, CreativeTabs tab)
	{
		
		super(fluid, material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerModels()
	{
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		ModelLoader.setCustomStateMapper(this, new StateMap.Builder().ignore(LEVEL).build());
		
	}
}
