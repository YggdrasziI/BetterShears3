package fr.yggdraszil.bettershears3;

import com.mojang.logging.LogUtils;
import fr.yggdraszil.bettershears3.config.BetterShears3CommonConfig;
import fr.yggdraszil.bettershears3.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(BetterShears3.MOD_ID)
public class BetterShears3
{
    public static final String MOD_ID = "bettershears3";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BetterShears3()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);

        eventBus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BetterShears3CommonConfig.SPEC, "bettershears3-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}
