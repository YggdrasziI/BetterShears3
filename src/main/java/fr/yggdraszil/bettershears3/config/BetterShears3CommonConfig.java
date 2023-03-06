package fr.yggdraszil.bettershears3.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class BetterShears3CommonConfig
{
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> WOODEN_SHEARS_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> COBBLESTONE_SHEARS_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> GOLDEN_SHEARS_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> FLINT_SHEARS_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> LAPIS_SHEARS_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> CLAY_SHEARS_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> COPPER_SHEARS_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> AMETHYST_SHEARS_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> DIAMOND_SHEARS_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> EMERALD_SHEARS_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> OBSIDIAN_SHEARS_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> NETHERITE_SHEARS_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> INFINITE_SHEARS_DURABILITY;

    public static final ForgeConfigSpec.ConfigValue<Integer> UNFIRED_CLAY_SHEARS_STACKABLE;

    static
    {
        BUILDER.push("Better Shears 3 Configs");

        WOODEN_SHEARS_DURABILITY = BUILDER.comment("Define Wooden Shears durability here. 0 = Unbreakable")
                .define("Wooden Shears durability", 1);

        COBBLESTONE_SHEARS_DURABILITY = BUILDER.comment("Define Cobblestone Shears durability here. 0 = Unbreakable")
                .define("Cobblestone Shears durability", 9);

        GOLDEN_SHEARS_DURABILITY = BUILDER.comment("Define Golden Shears durability here. 0 = Unbreakable")
                .define("Golden Shears durability", 20);

        FLINT_SHEARS_DURABILITY = BUILDER.comment("Define Flint Shears durability here. 0 = Unbreakable")
                .define("Flint Shears durability", 35);

        LAPIS_SHEARS_DURABILITY = BUILDER.comment("Define Lapis Lazuli Shears durability here. 0 = Unbreakable")
                .define("Lapis Shears durability", 85);

        CLAY_SHEARS_DURABILITY = BUILDER.comment("Define Clay Shears durability here. 0 = Unbreakable")
                .define("Clay Shears durability", 101);

        COPPER_SHEARS_DURABILITY = BUILDER.comment("Define Copper Shears durability here. 0 = Unbreakable")
                .define("Copper Shears durability", 200);

        AMETHYST_SHEARS_DURABILITY = BUILDER.comment("Define Amethyst Shears durability here. 0 = Unbreakable")
                .define("Amethyst Shears durability", 375);

        DIAMOND_SHEARS_DURABILITY = BUILDER.comment("Define Diamond Shears durability here. 0 = Unbreakable")
                .define("Diamond Shears durability", 1549);

        EMERALD_SHEARS_DURABILITY = BUILDER.comment("Define Emerald Shears durability here. 0 = Unbreakable")
                .define("Emerald Shears durability", 1979);

        OBSIDIAN_SHEARS_DURABILITY = BUILDER.comment("Define Obsidian Shears durability here. 0 = Unbreakable")
                .define("Obsidian Shears durability", 2999);

        NETHERITE_SHEARS_DURABILITY = BUILDER.comment("Define Netherite Shears durability here. 0 = Unbreakable")
                .define("Netherite Shears durability", 4046);

        INFINITE_SHEARS_DURABILITY = BUILDER.comment("Define Infinite Shears durability here. 0 = Unbreakable")
                .define("Infinite Shears durability", 0);

        UNFIRED_CLAY_SHEARS_STACKABLE = BUILDER.comment("Is Unfired Clay Shears stackable?")
                .defineInRange("Stack size", 1, 1, 64);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
