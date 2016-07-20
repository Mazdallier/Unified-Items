package tech.chazwarp923.unifieditems.crafting.IRecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import tech.chazwarp923.unifieditems.item.ItemMortarAndPestle;
import tech.chazwarp923.unifieditems.item.UIItems;

public class FlintRecipe implements IRecipe {

	protected ItemStack input = new ItemStack(Blocks.GRAVEL);
	protected ItemStack output = new ItemStack(Items.FLINT, 1);
	
	@Override
	public boolean matches(InventoryCrafting inv, World worldIn) {
		int invSize = inv.getSizeInventory();
		for(int i = 0; i < invSize; i++) {
			if(inv.getStackInSlot(i) != null) {
				if(inv.getStackInSlot(i).getItem().equals(UIItems.mortarAndPestle)) {
					for(int j = 0; j < invSize; j++) {
						if(inv.getStackInSlot(j) != null) {
							if(inv.getStackInSlot(j).getItem().equals(input.getItem())) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting inv) {
		return output.copy();
	}

	@Override
	public int getRecipeSize() {
		return 2;
	}

	@Override
	public ItemStack getRecipeOutput() {
		return output;
	}

	@Override
	public ItemStack[] getRemainingItems(InventoryCrafting inv) {
		ItemStack[] grid = new ItemStack[inv.getSizeInventory()];

        for (int i = 0; i < grid.length; i++) {
            ItemStack itemstack = inv.getStackInSlot(i);
            
            if (itemstack != null && itemstack.getItem() instanceof ItemMortarAndPestle) {
            	itemstack = new ItemStack(UIItems.mortarAndPestle, 1, itemstack.getItemDamage() + 1);
                if(itemstack.getItemDamage() == itemstack.getMaxDamage())
                	itemstack = null;
                grid[i] = itemstack;
            }
        }
        return grid;
	}

}
