package fr.yggdraszil.bettershears3.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
public class ModCreativeModTab
{
    public static final CreativeModeTab BETTERSHEARS_TAB = new CreativeModeTab("bettershears_tab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.STAR_SHEARS.get());
        }
    };
}