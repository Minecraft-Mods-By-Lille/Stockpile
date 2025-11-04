package net.stockpile;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.stockpile.init.ModItems;
import net.stockpile.init.ModCreativeTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(StockpileMod.MODID)
public class StockpileMod {
    public static final String MODID = "stockpile";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    public StockpileMod(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Initializing Stockpile Mod");
        
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        
        // Register mod components here
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Stockpile Mod setup complete");
    }
}