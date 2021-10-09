package io.lucunji.github.integratedpasting;

import io.lucunji.github.integratedpasting.block.BlockVariablestoreAdvancedConfig;
import io.lucunji.github.integratedpasting.proxy.ClientProxy;
import io.lucunji.github.integratedpasting.proxy.CommonProxy;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Level;
import org.cyclops.cyclopscore.config.ConfigHandler;
import org.cyclops.cyclopscore.init.ItemGroupMod;
import org.cyclops.cyclopscore.init.ModBaseVersionable;
import org.cyclops.cyclopscore.proxy.IClientProxy;
import org.cyclops.cyclopscore.proxy.ICommonProxy;

@Mod(IntegratedPasting.MODID)
public class IntegratedPasting extends ModBaseVersionable<IntegratedPasting> {

    public static final String MODID = "integratedpasting";

    public static IntegratedPasting _instance;

    public IntegratedPasting() {
        super(MODID, (instance) -> _instance = instance);
    }

    @Override
    protected ItemGroup constructDefaultItemGroup() {
        return new ItemGroupMod(this, () -> RegistryEntries.BLOCK_VARIABLE_STORE_ADVANCED.asItem());
    }

    @Override
    protected void onConfigsRegister(ConfigHandler configHandler) {
        super.onConfigsRegister(configHandler);
        configHandler.addConfigurable(new BlockVariablestoreAdvancedConfig());
    }

    @Override
    protected IClientProxy constructClientProxy() {
        return new ClientProxy();
    }

    @Override
    protected ICommonProxy constructCommonProxy() {
        return new CommonProxy();
    }

    public static void clog(String message) {
        _instance.log(Level.INFO, message);
    }

    public static void clog(Level level, String message) {
        _instance.log(level, message);
    }
}
