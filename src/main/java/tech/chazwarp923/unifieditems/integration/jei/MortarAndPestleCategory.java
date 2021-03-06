/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.integration.jei;

import javax.annotation.Nonnull;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.ICraftingGridHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.BlankRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import tech.chazwarp923.unifieditems.Reference;
import tech.chazwarp923.unifieditems.item.UIItems;

public class MortarAndPestleCategory extends BlankRecipeCategory<IRecipeWrapper> {

	public static final String UID = Reference.MOD_ID + ".mortarAndPestle";
	
	@Nonnull
	private final IDrawable background;
	@Nonnull
	private final ICraftingGridHelper craftingGridHelper;
	
	public MortarAndPestleCategory(IGuiHelper gui) {
		ResourceLocation location = new ResourceLocation("minecraft", "textures/gui/container/crafting_table.png");
		background = gui.createDrawable(location, 29, 16, 116, 54);
		craftingGridHelper = gui.createCraftingGridHelper(1, 0);
	}
	
	@Override
	public String getUid() {
		return UID;
	}

	@Override
	public String getTitle() {
		return "Mortar and Pestle";
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper, IIngredients ingredients) {
		if(recipeWrapper instanceof MortarAndPestleWrapper) {			
			IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
			
			guiItemStacks.init(0, false, 0, 0);
			guiItemStacks.set(0, ingredients.getInputs(ItemStack.class).get(0));
			
			guiItemStacks.init(1, false, 18, 0);
			guiItemStacks.set(1, new ItemStack(UIItems.mortarAndPestle));
			
			guiItemStacks.init(2, true, 94, 18);
			guiItemStacks.set(2, ingredients.getOutputs(ItemStack.class).get(0));
			
		}
	}
}
