/**
 * Copyright (c) 31/dic/2014 Davide Cossu & Matthew Albrecht.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, see <http://www.gnu.org/licenses>.
 */

package com.minestellar.core.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.minestellar.core.Minestellar;
import com.minestellar.core.blocks.tileEntities.TileEntityCable;

public class BlockCable extends BlockContainer{

	private IIcon[] cableBlockIcon;
	
	protected BlockCable(String name){
		super(Material.ground);
		this.setBlockName(name);
		
		float pixel = 1F/16F;
		this.setBlockBounds(11*pixel/2, 11*pixel/2, 11*pixel/2, 1-11*pixel/2, 1-11*pixel/2, 1-11*pixel/2);
		this.useNeighborBrightness = true;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta){
		return new TileEntityCable();
	}

	@Override
	public CreativeTabs getCreativeTabToDisplayOn()
	{
		return Minestellar.stellarBlocksTab;
	}
	
	@Override
	public int getRenderType(){
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock(){
		return false;
	}

	/*@Override
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		this.cableBlockIcon = new IIcon[4]; // UPDATE WHEN ADDING BLOCKS
		this.cableBlockIcon[0] = par1IconRegister.registerIcon(Minestellar.TEXTURE_PREFIX + "blockCable");
		this.cableBlockIcon[1] = par1IconRegister.registerIcon(Minestellar.TEXTURE_PREFIX + "oreTin");
		this.cableBlockIcon[2] = par1IconRegister.registerIcon(Minestellar.TEXTURE_PREFIX + "oreTitanium");
	}
	
	@Override
	public IIcon getIcon(int side, int meta)
	{
		return this.cableBlockIcon[meta];
	}

	@Override
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list)
	{
		for (int i = 0; i < 2; ++i) // UPDATE WHEN ADDING BLOCKS
		{
			list.add(new ItemStack(this, 1, i));
		}
	}
	
	@Override
	public int damageDropped(int meta)
	{
		return meta;
	}*/
	
}