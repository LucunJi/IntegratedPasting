package io.lucunji.github.integratedpasting;

import io.lucunji.github.integratedpasting.block.ModBlocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(IntegratedPasting.MODID)
public class IntegratedPasting {

    public static final String MODID = "integratedpasting";

    private static final Logger LOGGER = LogManager.getLogger();

    public IntegratedPasting() {
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
