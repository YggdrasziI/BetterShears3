package fr.yggdraszil.bettershears3.tool;


import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;


public class BetterShearsInfiniteTool extends ShearsItem
{
    public BetterShearsInfiniteTool(Item.Properties pProperties)
    {
        super(pProperties);
    }

    public boolean isFoil(ItemStack stack)
    {
        return true;
    }
}
