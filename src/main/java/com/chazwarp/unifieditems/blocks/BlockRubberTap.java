package com.chazwarp.unifieditems.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.chazwarp.unifieditems.UniTab;
import com.chazwarp.unifieditems.lib.BlockInfo;
import com.chazwarp.unifieditems.tileentity.TileEntityRubberTap;

public class BlockRubberTap extends BlockContainer {
	
	public BlockRubberTap(Material mat) {
		super(mat);
		
		setCreativeTab(UniTab.tab);
		setHardness(2F);
		setStepSound(Block.soundTypeStone);
		setBlockName(BlockInfo.RUBBER_TAP_UNLOCALIZED_NAME);
		setBlockTextureName("minecraft" + ":" + "oak_planks");
		setBlockBounds(0.3F, 0.25F, 0.6F, 0.7000F, 0.55F, 1.0F);		
	}
	
	@Override
	public boolean isOpaqueCube()
    {
        return false;
    }
	
	@Override
	public boolean renderAsNormalBlock()
    {
        return false;
    }
	
	@Override
	public int getRenderType() {
		return -1;	
	}

	@Override
	public TileEntity createNewTileEntity(World world, int integer) {
		return new TileEntityRubberTap();
	}	
}