package barch.tsm.Blocks.Infuser;

import barch.tsm.Blocks.InfuserRegister;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class InfuserBlock extends BlockWithEntity {
    public InfuserBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return null;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.union(
                VoxelShapes.cuboid(1.0f/16,0,1.0f/16,15.0f/16,12.0f/16,15.0f/16),
                VoxelShapes.cuboid(5.0f/16,3.0f/16,0,11.0f/16,9.0f/16,16.0f/16),
                VoxelShapes.cuboid(0,3.0f/16,5.0f/16,16.0f/16,9.0f/16,11.0f/16),
                VoxelShapes.cuboid(0,12.0f/16,15.0f/16,16.0f/16,16.0f/16,16.0f/16),
                VoxelShapes.cuboid(0,12.0f/16,0,16.0f/16,16.0f/16,1.0f/16),
                VoxelShapes.cuboid(5.0f/16,12.0f/16,1.0f/16,11.0f/16,16.0f/16,15.0f/16),
                VoxelShapes.cuboid(11.0f/16,12.0f/16,5.0f/16,15.0f/16,16.0f/16,11.0f/16),
                VoxelShapes.cuboid(1.0f/16,12.0f/16,5.0f/16,5.0f/16,16.0f/16,11.0f/16),
                VoxelShapes.cuboid(15.0f/16,12.0f/16,1.0f/16,16.0f/16,16.0f/16,15.0f/16),
                VoxelShapes.cuboid(0,12.0f/16,1.0f/16,1.0f/16,16.0f/16,15.0f/16)
        );
    }

    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return getOutlineShape(state, world, pos, context);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new InfuserBlockEntity(pos, state);
    }


    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        } else {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof InfuserBlockEntity) {
                player.openHandledScreen((InfuserBlockEntity)blockEntity);
            }

            return ActionResult.CONSUME;
        }
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return world.isClient ? null : validateTicker(type, InfuserRegister.INFUSER_BLOCK_ENTITY, InfuserBlockEntity::tick);
    }

    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        ItemScatterer.onStateReplaced(state, newState, world, pos);
        super.onStateReplaced(state, world, pos, newState, moved);
    }
}
