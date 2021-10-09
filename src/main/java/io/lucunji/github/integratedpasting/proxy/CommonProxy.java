package io.lucunji.github.integratedpasting.proxy;

import io.lucunji.github.integratedpasting.IntegratedPasting;
import org.cyclops.cyclopscore.init.ModBase;
import org.cyclops.cyclopscore.proxy.CommonProxyComponent;

public class CommonProxy extends CommonProxyComponent {

    @Override
    public ModBase getMod() {
        return IntegratedPasting._instance;
    }
}
