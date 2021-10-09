//package io.lucunji.github.integratedpasting.inventory.container;
//
//import io.lucunji.github.integratedpasting.client.gui.ContainerScreenVariablestoreAdvanced;
//import net.minecraft.client.gui.IHasContainer;
//import net.minecraft.client.gui.ScreenManager;
//import net.minecraft.client.gui.screen.Screen;
//import net.minecraft.inventory.container.ContainerType;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//import org.cyclops.cyclopscore.client.gui.ScreenFactorySafe;
//import org.cyclops.cyclopscore.config.extendedconfig.GuiConfig;
//import org.cyclops.integrateddynamics.IntegratedDynamics;
//
//public class ContainerVariablestoreAdvancedConfig extends GuiConfig<ContainerVariablestoreAdvanced> {
//    public ContainerVariablestoreAdvancedConfig() {
//        super(IntegratedDynamics._instance, "variablestore_advanced", (eConfig) ->
//                new ContainerType<>(ContainerVariablestoreAdvanced::new));
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    @Override
//    public <U extends Screen & IHasContainer<ContainerVariablestoreAdvanced>> ScreenManager.IScreenFactory<ContainerVariablestoreAdvanced, U> getScreenFactory() {
//        return new ScreenFactorySafe(ContainerScreenVariablestoreAdvanced::new);
//    }
//}
