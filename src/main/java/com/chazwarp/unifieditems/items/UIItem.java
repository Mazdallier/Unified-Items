/**
@author Chaz Kerby
 */

package com.chazwarp.unifieditems.items;

import com.chazwarp.unifieditems.UniTab;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UIItem extends Item {

	private String name = "UIDefaultItem";
	
	protected UIItem(String unlocalizedName) {
		super();
		
		name = unlocalizedName;
		
		setCreativeTab(UniTab.tab);
		setUnlocalizedName(unlocalizedName);
		
		GameRegistry.registerItem(this, name);
	}
	
	public String getName() {
		return name;
	}
}