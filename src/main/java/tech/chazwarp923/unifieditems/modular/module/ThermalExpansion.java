/**
@author Chaz Kerby
*/
package tech.chazwarp923.unifieditems.modular.module;

import java.util.ArrayList;

import tech.chazwarp923.unifieditems.material.MaterialHandler;
import tech.chazwarp923.unifieditems.material.MaterialRegistry;
import tech.chazwarp923.unifieditems.modular.UIModule;

public class ThermalExpansion extends UIModule {

	public ThermalExpansion() {
		ArrayList<MaterialRegistry> materials = new ArrayList<MaterialRegistry>();
		materials.add(MaterialRegistry.COAL);
		materials.add(MaterialRegistry.COPPER);
		materials.add(MaterialRegistry.TIN);
		materials.add(MaterialRegistry.BRONZE);
		materials.add(MaterialRegistry.SILVER);
		materials.add(MaterialRegistry.LEAD);
		materials.add(MaterialRegistry.NICKEL);
		materials.add(MaterialRegistry.INVAR);
		materials.add(MaterialRegistry.ELECTRUM);
		materials.add(MaterialRegistry.PLATINUM);
		materials.add(MaterialRegistry.MITHRIL);
		MaterialHandler.registerMaterialUse(materials);
	}
}
