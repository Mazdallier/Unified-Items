package com.chazwarp.unifieditems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.chazwarp.unifieditems.blocks.ModBlocks;

public class UniTab extends CreativeTabs
{
    public static UniTab tab = new UniTab();

    public UniTab() {
        super("uniTab");
    }
    
    @Override
    public ItemStack getIconItemStack() {
    	return new ItemStack(ModBlocks.blockBronze, 1, 0);
    }

	@Override
	public Item getTabIconItem() {
		return Items.apple;
	}
}