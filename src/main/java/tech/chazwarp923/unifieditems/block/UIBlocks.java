package tech.chazwarp923.unifieditems.block;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraftforge.oredict.OreDictionary;
import tech.chazwarp923.unifieditems.block.HarvestLevel;

public class UIBlocks {

	public static BlockRubberTap rubberTap;
	
	public static Map<String, UIBlockOre> ores = new HashMap<String, UIBlockOre>();
	public static Map<String, UIBlockStorage> blocks = new HashMap<String, UIBlockStorage>();
	
	public static void addOre(String matName, float hardness, String unlocalizedName, HarvestLevel harvestLevel, int hexColor, Block baseTex) {
		ores.put(matName, new UIBlockOre(hardness, unlocalizedName, harvestLevel, hexColor, baseTex));
	}
	
	public static void addBlock(String matName, float hardness, String unlocalizedName, HarvestLevel harvestLevel, int hexColor) {
		blocks.put(matName, new UIBlockStorage(matName, hardness, unlocalizedName, harvestLevel, hexColor));
	}
	
	public static void init() {
		rubberTap = new BlockRubberTap();
		
		for(Map.Entry<String, UIBlockOre> block : ores.entrySet()) {
			OreDictionary.registerOre("ore" + block.getKey(), block.getValue());
		}
		
		for(Map.Entry<String, UIBlockStorage> block : blocks.entrySet()) {
			OreDictionary.registerOre("block" + block.getKey(), block.getValue());
		}
	}
}