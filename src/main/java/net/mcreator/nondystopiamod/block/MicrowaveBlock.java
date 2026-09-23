
package net.mcreator.nondystopiamod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class MicrowaveBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public MicrowaveBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.ANVIL).strength(1.2f, 14f).lightLevel(s -> 1).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 0, 2, 1, 9, 14), box(12, 0, 2, 15, 9, 14), box(1, 1, 14, 12, 2, 16), box(1, 7, 14, 12, 8, 16), box(3, 2, 0, 4, 7, 1), box(5, 2, 0, 6, 7, 1), box(7, 2, 0, 8, 7, 1), box(9, 2, 0, 10, 7, 1),
					box(11, 2, 0, 12, 7, 1), box(13, 2, 0, 14, 7, 1), box(15, 0, 2, 16, 9, 14), box(0, 0, 1, 16, 9, 2), box(1, 2, 14, 2, 7, 16), box(2, 2, 14, 12, 7, 16), box(12, 1, 14, 13, 8, 16), box(14, 1, 14, 15, 2, 15), box(1, 1, 14, 2, 2, 16),
					box(1, 1, 14, 2, 2, 16), box(1, 8, 2, 12, 9, 14), box(1, 0, 2, 12, 1, 14));
			case NORTH -> Shapes.or(box(15, 0, 2, 16, 9, 14), box(1, 0, 2, 4, 9, 14), box(4, 1, 0, 15, 2, 2), box(4, 7, 0, 15, 8, 2), box(12, 2, 15, 13, 7, 16), box(10, 2, 15, 11, 7, 16), box(8, 2, 15, 9, 7, 16), box(6, 2, 15, 7, 7, 16),
					box(4, 2, 15, 5, 7, 16), box(2, 2, 15, 3, 7, 16), box(0, 0, 2, 1, 9, 14), box(0, 0, 14, 16, 9, 15), box(14, 2, 0, 15, 7, 2), box(4, 2, 0, 14, 7, 2), box(3, 1, 0, 4, 8, 2), box(1, 1, 1, 2, 2, 2), box(14, 1, 0, 15, 2, 2),
					box(14, 1, 0, 15, 2, 2), box(4, 8, 2, 15, 9, 14), box(4, 0, 2, 15, 1, 14));
			case EAST -> Shapes.or(box(2, 0, 15, 14, 9, 16), box(2, 0, 1, 14, 9, 4), box(14, 1, 4, 16, 2, 15), box(14, 7, 4, 16, 8, 15), box(0, 2, 12, 1, 7, 13), box(0, 2, 10, 1, 7, 11), box(0, 2, 8, 1, 7, 9), box(0, 2, 6, 1, 7, 7),
					box(0, 2, 4, 1, 7, 5), box(0, 2, 2, 1, 7, 3), box(2, 0, 0, 14, 9, 1), box(1, 0, 0, 2, 9, 16), box(14, 2, 14, 16, 7, 15), box(14, 2, 4, 16, 7, 14), box(14, 1, 3, 16, 8, 4), box(14, 1, 1, 15, 2, 2), box(14, 1, 14, 16, 2, 15),
					box(14, 1, 14, 16, 2, 15), box(2, 8, 4, 14, 9, 15), box(2, 0, 4, 14, 1, 15));
			case WEST -> Shapes.or(box(2, 0, 0, 14, 9, 1), box(2, 0, 12, 14, 9, 15), box(0, 1, 1, 2, 2, 12), box(0, 7, 1, 2, 8, 12), box(15, 2, 3, 16, 7, 4), box(15, 2, 5, 16, 7, 6), box(15, 2, 7, 16, 7, 8), box(15, 2, 9, 16, 7, 10),
					box(15, 2, 11, 16, 7, 12), box(15, 2, 13, 16, 7, 14), box(2, 0, 15, 14, 9, 16), box(14, 0, 0, 15, 9, 16), box(0, 2, 1, 2, 7, 2), box(0, 2, 2, 2, 7, 12), box(0, 1, 12, 2, 8, 13), box(1, 1, 14, 2, 2, 15), box(0, 1, 1, 2, 2, 2),
					box(0, 1, 1, 2, 2, 2), box(2, 8, 1, 14, 9, 12), box(2, 0, 1, 14, 1, 12));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public boolean canConnectRedstone(BlockState state, BlockGetter world, BlockPos pos, Direction side) {
		return true;
	}
}
