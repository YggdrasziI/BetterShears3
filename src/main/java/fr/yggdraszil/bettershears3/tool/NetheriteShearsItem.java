package fr.yggdraszil.bettershears3.tool;

import fr.yggdraszil.bettershears3.config.BetterShears3CommonConfig;
import fr.yggdraszil.bettershears3.item.ModCreativeModTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShearsItem;

public class NetheriteShearsItem extends ShearsItem
{
    public NetheriteShearsItem()
    {
        super(new Item.Properties().stacksTo(1).durability(BetterShears3CommonConfig.NETHERITE_SHEARS_DURABILITY.get()).tab(ModCreativeModTab.BETTERSHEARS_TAB));
    }
}