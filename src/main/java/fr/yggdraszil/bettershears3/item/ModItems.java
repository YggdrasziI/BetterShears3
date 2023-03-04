package fr.yggdraszil.bettershears3.item;

import fr.yggdraszil.bettershears3.BetterShears3;
import fr.yggdraszil.bettershears3.tool.BetterShearsInfiniteTool;
import fr.yggdraszil.bettershears3.tool.BetterShearsTest;
import fr.yggdraszil.bettershears3.tool.BetterShearsTool;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterShears3.MOD_ID);

    public static final RegistryObject<Item> UNFIRED_CLAY_SHEARS = ITEMS.register("unfired_clay_shears",
            () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeModTab.BETTERSHEARS_TAB)));

    public static final RegistryObject<Item> COBBLE_SHEARS = ITEMS.register("cobble_shears",
            () -> new BetterShearsTool(new Item.Properties().stacksTo(1).durability(1).tab(ModCreativeModTab.BETTERSHEARS_TAB)));
    public static final RegistryObject<Item> WOODEN_SHEARS = ITEMS.register("wooden_shears",
            () -> new BetterShearsTool(new Item.Properties().stacksTo(1).durability(9).tab(ModCreativeModTab.BETTERSHEARS_TAB)));
    public static final RegistryObject<Item> GOLD_SHEARS = ITEMS.register("gold_shears",
            () -> new BetterShearsTool(new Item.Properties().stacksTo(1).durability(20).tab(ModCreativeModTab.BETTERSHEARS_TAB)));
    public static final RegistryObject<Item> FLINT_SHEARS = ITEMS.register("flint_shears",
            () -> new BetterShearsTool(new Item.Properties().stacksTo(1).durability(35).tab(ModCreativeModTab.BETTERSHEARS_TAB)));
    public static final RegistryObject<Item> LAPIS_SHEARS = ITEMS.register("lapis_shears",
            () -> new BetterShearsTool(new Item.Properties().stacksTo(1).durability(85).tab(ModCreativeModTab.BETTERSHEARS_TAB)));
    public static final RegistryObject<Item> CLAY_SHEARS = ITEMS.register("clay_shears",
            () -> new BetterShearsTool(new Item.Properties().stacksTo(1).durability(101).tab(ModCreativeModTab.BETTERSHEARS_TAB)));
    public static final RegistryObject<Item> COPPER_SHEARS = ITEMS.register("copper_shears",
            () -> new BetterShearsTool(new Item.Properties().stacksTo(1).durability(200).tab(ModCreativeModTab.BETTERSHEARS_TAB)));
    public static final RegistryObject<Item> AMETHYST_SHEARS = ITEMS.register("amethyst_shears",
            () -> new BetterShearsTool(new Item.Properties().stacksTo(1).durability(375).tab(ModCreativeModTab.BETTERSHEARS_TAB)));
    public static final RegistryObject<Item> DIAMOND_SHEARS = ITEMS.register("diamond_shears",
            () -> new BetterShearsTool(new Item.Properties().stacksTo(1).durability(1549).tab(ModCreativeModTab.BETTERSHEARS_TAB)));
    public static final RegistryObject<Item> EMERALD_SHEARS = ITEMS.register("emerald_shears",
            () -> new BetterShearsTool(new Item.Properties().stacksTo(1).durability(1979).tab(ModCreativeModTab.BETTERSHEARS_TAB)));
    public static final RegistryObject<Item> OBSIDIAN_SHEARS = ITEMS.register("obsidian_shears",
            () -> new BetterShearsTool(new Item.Properties().stacksTo(1).durability(2999).tab(ModCreativeModTab.BETTERSHEARS_TAB)));
    public static final RegistryObject<Item> NETHERITE_SHEARS = ITEMS.register("netherite_shears",
            () -> new BetterShearsTool(new Item.Properties().stacksTo(1).durability(4044).tab(ModCreativeModTab.BETTERSHEARS_TAB)));
    public static final RegistryObject<Item> WARDEN_SHEARS = ITEMS.register("warden_shears",
            () -> new BetterShearsTool(new Item.Properties().stacksTo(1).durability(6144).tab(ModCreativeModTab.BETTERSHEARS_TAB)));

    public static final RegistryObject<Item> STAR_SHEARS = ITEMS.register("star_shears",
            () -> new BetterShearsInfiniteTool(new Item.Properties().stacksTo(1).durability(0).tab(ModCreativeModTab.BETTERSHEARS_TAB)));

    public static final RegistryObject<Item> WARDEN_HEART = ITEMS.register("warden_heart",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.BETTERSHEARS_TAB)));

    public static void register (IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
