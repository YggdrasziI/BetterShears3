package fr.yggdraszil.bettershears3.item;

import fr.yggdraszil.bettershears3.BetterShears3;
import fr.yggdraszil.bettershears3.tool.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterShears3.MOD_ID);

    public static final RegistryObject<Item> UNFIRED_CLAY_SHEARS = ITEMS.register("unfired_clay_shears",
            () -> new UnfiredClayShearsItem());

    public static final RegistryObject<Item> WOODEN_SHEARS = ITEMS.register("wooden_shears",
            () -> new WoodenShearsItem());
    public static final RegistryObject<Item> COBBLESTONE_SHEARS = ITEMS.register("cobblestone_shears",
            () -> new CobblestoneShearsItem());
    public static final RegistryObject<Item> GOLD_SHEARS = ITEMS.register("gold_shears",
            () -> new GoldenShearsItem());
    public static final RegistryObject<Item> FLINT_SHEARS = ITEMS.register("flint_shears",
            () -> new FlintShearsItem());
    public static final RegistryObject<Item> LAPIS_SHEARS = ITEMS.register("lapis_shears",
            () -> new LapisShearsItem());
    public static final RegistryObject<Item> CLAY_SHEARS = ITEMS.register("clay_shears",
            () -> new ClayShearsItem());
    public static final RegistryObject<Item> COPPER_SHEARS = ITEMS.register("copper_shears",
            () -> new CopperShearsItem());
    public static final RegistryObject<Item> AMETHYST_SHEARS = ITEMS.register("amethyst_shears",
            () -> new AmethystShearsItem());
    public static final RegistryObject<Item> DIAMOND_SHEARS = ITEMS.register("diamond_shears",
            () -> new DiamondShearsItem());
    public static final RegistryObject<Item> EMERALD_SHEARS = ITEMS.register("emerald_shears",
            () -> new EmeraldShearsItem());
    public static final RegistryObject<Item> OBSIDIAN_SHEARS = ITEMS.register("obsidian_shears",
            () -> new ObsidianShearsItem());
    public static final RegistryObject<Item> NETHERITE_SHEARS = ITEMS.register("netherite_shears",
            () -> new NetheriteShearsItem());
    public static final RegistryObject<Item> STAR_SHEARS = ITEMS.register("star_shears",
            () -> new InfiniteShearsItem());

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
