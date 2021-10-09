package io.lucunji.github.integratedpasting.block;

import io.lucunji.github.integratedpasting.IntegratedPasting;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, IntegratedPasting.MODID);

    public static final RegistryObject<BlockVariablestoreAdvanced> VARIABLESTORE_ADV = BLOCKS.register("variablestore_advanced",
            () -> new BlockVariablestoreAdvanced(AbstractBlock.Properties
                    .create(Material.ANVIL)
                    .hardnessAndResistance(5.0F)
                    .sound(SoundType.METAL))
    );
}
