package fr.yggdraszil.bettershears3.tool;

import fr.yggdraszil.bettershears3.config.BetterShears3CommonConfig;
import fr.yggdraszil.bettershears3.item.ModCreativeModTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShearsItem;

public class UnfiredClayShearsItem extends ShearsItem
{
    public UnfiredClayShearsItem()
    {
        super(new Item.Properties().stacksTo(BetterShears3CommonConfig.UNFIRED_CLAY_SHEARS_STACKABLE.get()).tab(ModCreativeModTab.BETTERSHEARS_TAB));
    }
}
