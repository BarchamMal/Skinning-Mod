package barch.tsm.Blocks;

import barch.tsm.Blocks.Infuser.InfuserBlock;
import barch.tsm.Blocks.Infuser.InfuserBlockEntity;
import barch.tsm.Blocks.Infuser.InfuserScreenHandler;
import barch.tsm.Glue.BlockBuilder;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.BrewingStandScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

import static barch.tsm.TheSkinningMod.NAMESPACE;

public class InfuserRegister {

    public static final BlockWithEntity INFUSER_BLOCK = new InfuserBlock(BlockBuilder.CloneBlock(Blocks.ENCHANTING_TABLE));

    public static final BlockEntityType<InfuserBlockEntity> INFUSER_BLOCK_ENTITY = BlockEntityType.Builder.create(InfuserBlockEntity::new, INFUSER_BLOCK).build(null);

    public static final ScreenHandlerType<InfuserScreenHandler> INFUSER_SCREEN_HANDLER = new ScreenHandlerType<>(InfuserScreenHandler::new, FeatureFlags.VANILLA_FEATURES);

    public static void Register() {

        Registry.register(Registries.BLOCK, new Identifier(NAMESPACE, "infuser"), INFUSER_BLOCK);

        Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(NAMESPACE, "infuser"), INFUSER_BLOCK_ENTITY);

        Registry.register(Registries.SCREEN_HANDLER, new Identifier(NAMESPACE, "infuser"), INFUSER_SCREEN_HANDLER);
    }

}
