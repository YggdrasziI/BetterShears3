package fr.yggdraszil.bettershears3.item;

import fr.yggdraszil.bettershears3.BetterShears3;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterShears3.MOD_ID);

    public static final RegistryObject<Item> UNFIRED_CLAY_SHEARS = ITEMS.register("unfired_clay_shears",
            () -> new Item(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> WOODEN_SHEARS = ITEMS.register("wooden_shears",
            () -> new Item(new Item.Properties().stacksTo(1).durability(9).tab(CreativeModeTab.TAB_TOOLS)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
