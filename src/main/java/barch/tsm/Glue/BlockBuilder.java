package barch.tsm.Glue;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;

public class BlockBuilder {


    private static FabricBlockSettings Settings;


    public static FabricBlockSettings CloneBlock(Block block) {

        Settings = FabricBlockSettings.create()
                .sounds(block.getDefaultState().getSoundGroup())
                .strength(block.getHardness())
                .resistance(block.getBlastResistance())
                .mapColor(block.getDefaultMapColor())
                .slipperiness(block.getSlipperiness());

        return Settings;

    };

}