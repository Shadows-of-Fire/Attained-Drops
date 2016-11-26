package shadows.attained.util;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import shadows.attained.ModRegistry;
import shadows.attained.common.BlockBulb;

public class AttainedTab extends CreativeTabs{


	
        public AttainedTab(String label) {
		super("ad");

	}

		@SideOnly(Side.CLIENT) @Override
        public Item getTabIconItem()
        {
            return ModRegistry.itemseed;
        }
	
	@Override
    @SideOnly(Side.CLIENT)
    public void displayAllRelevantItems(List<ItemStack> list)
    {


            		for (int i = 0; i < BlockBulb.MobDrops.length; ++i)
            		{
            			list.add(new ItemStack(ModRegistry.itembulb, 1, i));
            		}
            		
            		list.add(new ItemStack(ModRegistry.itemsoil));
            		list.add(new ItemStack(ModRegistry.itemseed));
            		list.add(new ItemStack(ModRegistry.vitalizedsoil));

                

    }
	public static void tabFixer(Item block, CreativeTabs creativeTabs, List<ItemStack> list){
		list.clear();
		
		
		for (int i = 0; i < BlockBulb.MobDrops.length; ++i)
		{
			list.add(new ItemStack(ModRegistry.itembulb, 1, i));
		}
		list.add(new ItemStack(ModRegistry.itemsoil));
		list.add(new ItemStack(ModRegistry.itemseed));
		list.add(new ItemStack(ModRegistry.vitalizedsoil));
	}

}