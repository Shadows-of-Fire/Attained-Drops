package shadows.attained;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class RecipeRegistry {


	public static void init(){
		GameRegistry.addShapelessRecipe(new ItemStack(ModRegistry.itemseed, 2), ModRegistry.itemessence, Items.APPLE, Items.WHEAT_SEEDS);
		GameRegistry.addShapedRecipe(new ItemStack(ModRegistry.soilcreator), " L ", "FSF", " L ", 'F', ModRegistry.itemseed, 'L', Items.EGG, 'S', Blocks.DIRT);

	}
}
