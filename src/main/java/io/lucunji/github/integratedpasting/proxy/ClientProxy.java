package io.lucunji.github.integratedpasting.proxy;

import io.lucunji.github.integratedpasting.IntegratedPasting;
import net.minecraftforge.common.MinecraftForge;
import org.cyclops.cyclopscore.init.ModBase;
import org.cyclops.cyclopscore.proxy.ClientProxyComponent;

public class ClientProxy extends ClientProxyComponent {
    public ClientProxy() {
        super(new CommonProxy());
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Override
    public ModBase getMod() {
        return IntegratedPasting._instance;
    }
}
