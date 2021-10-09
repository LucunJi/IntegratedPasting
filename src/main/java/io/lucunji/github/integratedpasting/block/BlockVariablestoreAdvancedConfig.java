package io.lucunji.github.integratedpasting.block;

import io.lucunji.github.integratedpasting.IntegratedPasting;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import org.cyclops.cyclopscore.config.extendedconfig.BlockConfig;

public class BlockVariablestoreAdvancedConfig extends BlockConfig {

    public BlockVariablestoreAdvancedConfig() {
        super(IntegratedPasting._instance, "variablestore_advanced",
                eConfig -> new BlockVariablestoreAdvanced(AbstractBlock.Properties
                        .create(Material.ANVIL)
                        .hardnessAndResistance(5.0F)
                        .sound(SoundType.METAL)),
                (eConfig, block) -> new BlockItem(block, new Item.Properties().group(IntegratedPasting._instance.getDefaultItemGroup())));
    }
}
