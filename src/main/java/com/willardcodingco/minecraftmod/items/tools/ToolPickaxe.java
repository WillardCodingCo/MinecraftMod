package com.willardcodingco.minecraftmod.items.tools;

import com.willardcodingco.minecraftmod.Main;
import com.willardcodingco.minecraftmod.init.ModItems;
import com.willardcodingco.minecraftmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{
	
	public ToolPickaxe(String name, ToolMaterial material)
	{
		
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels()
	{
		
		Main.proxy.registerItemRenderer(this, 0, "inventory" );
		
	}
	
}
