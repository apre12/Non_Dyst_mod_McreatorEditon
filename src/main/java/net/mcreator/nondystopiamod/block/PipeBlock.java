
package net.mcreator.nondystopiamod.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class PipeBlock extends Block implements SimpleWaterloggedBlock {
	public static final DirectionProperty FACING = DirectionalBlock.FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public PipeBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.METAL).strength(1.45f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
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
			default -> Shapes.or(box(7.8, 9.69454, 7.14749, 8.9, 10.59454, 8.14749), box(7.8, 9.69454, 7.64749, 8.9, 10.69454, 8.54749), box(7.8, 9.99454, 7.74749, 8.9, 10.89454, 8.74749), box(7.79437, 0.20503, 7.65, 8.99437, 10.20503, 8.05),
					box(8.59437, 0.20503, 8.05, 8.99437, 10.20503, 8.85), box(7.79437, 0.20503, 7.65, 8.19437, 10.20503, 8.85), box(8.19437, 0.20503, 8.45, 8.99437, 10.20503, 8.85), box(7.59437, 10.35503, 3, 8.79437, 10.75503, 8),
					box(8.6, 10, 3, 9.7, 10.4, 8), box(7.59437, 9.55503, 3, 7.99437, 10.75503, 8), box(9.3, 9.5, 3, 9.7, 10.4, 8));
			case NORTH -> Shapes.or(box(7.1, 9.69454, 7.85251, 8.2, 10.59454, 8.85251), box(7.1, 9.69454, 7.45251, 8.2, 10.69454, 8.35251), box(7.1, 9.99454, 7.25251, 8.2, 10.89454, 8.25251), box(7.00563, 0.20503, 7.95, 8.20563, 10.20503, 8.35),
					box(7.00563, 0.20503, 7.15, 7.40563, 10.20503, 7.95), box(7.80563, 0.20503, 7.15, 8.20563, 10.20503, 8.35), box(7.00563, 0.20503, 7.15, 7.80563, 10.20503, 7.55), box(7.20563, 10.35503, 8, 8.40563, 10.75503, 13),
					box(6.3, 10, 8, 7.4, 10.4, 13), box(8.00563, 9.55503, 8, 8.40563, 10.75503, 13), box(6.3, 9.5, 8, 6.7, 10.4, 13));
			case EAST -> Shapes.or(box(7.14749, 9.69454, 7.1, 8.14749, 10.59454, 8.2), box(7.64749, 9.69454, 7.1, 8.54749, 10.69454, 8.2), box(7.74749, 9.99454, 7.1, 8.74749, 10.89454, 8.2), box(7.65, 0.20503, 7.00563, 8.05, 10.20503, 8.20563),
					box(8.05, 0.20503, 7.00563, 8.85, 10.20503, 7.40563), box(7.65, 0.20503, 7.80563, 8.85, 10.20503, 8.20563), box(8.45, 0.20503, 7.00563, 8.85, 10.20503, 7.80563), box(3, 10.35503, 7.20563, 8, 10.75503, 8.40563),
					box(3, 10, 6.3, 8, 10.4, 7.4), box(3, 9.55503, 8.00563, 8, 10.75503, 8.40563), box(3, 9.5, 6.3, 8, 10.4, 6.7));
			case WEST -> Shapes.or(box(7.85251, 9.69454, 7.8, 8.85251, 10.59454, 8.9), box(7.45251, 9.69454, 7.8, 8.35251, 10.69454, 8.9), box(7.25251, 9.99454, 7.8, 8.25251, 10.89454, 8.9), box(7.95, 0.20503, 7.79437, 8.35, 10.20503, 8.99437),
					box(7.15, 0.20503, 8.59437, 7.95, 10.20503, 8.99437), box(7.15, 0.20503, 7.79437, 8.35, 10.20503, 8.19437), box(7.15, 0.20503, 8.19437, 7.55, 10.20503, 8.99437), box(8, 10.35503, 7.59437, 13, 10.75503, 8.79437),
					box(8, 10, 8.6, 13, 10.4, 9.7), box(8, 9.55503, 7.59437, 13, 10.75503, 7.99437), box(8, 9.5, 9.3, 13, 10.4, 9.7));
			case UP -> Shapes.or(box(7.1, 7.14749, 9.69454, 8.2, 8.14749, 10.59454), box(7.1, 7.64749, 9.69454, 8.2, 8.54749, 10.69454), box(7.1, 7.74749, 9.99454, 8.2, 8.74749, 10.89454), box(7.00563, 7.65, 0.20503, 8.20563, 8.05, 10.20503),
					box(7.00563, 8.05, 0.20503, 7.40563, 8.85, 10.20503), box(7.80563, 7.65, 0.20503, 8.20563, 8.85, 10.20503), box(7.00563, 8.45, 0.20503, 7.80563, 8.85, 10.20503), box(7.20563, 3, 10.35503, 8.40563, 8, 10.75503),
					box(6.3, 3, 10, 7.4, 8, 10.4), box(8.00563, 3, 9.55503, 8.40563, 8, 10.75503), box(6.3, 3, 9.5, 6.7, 8, 10.4));
			case DOWN -> Shapes.or(box(7.1, 7.85251, 5.40546, 8.2, 8.85251, 6.30546), box(7.1, 7.45251, 5.30546, 8.2, 8.35251, 6.30546), box(7.1, 7.25251, 5.10546, 8.2, 8.25251, 6.00546), box(7.00563, 7.95, 5.79497, 8.20563, 8.35, 15.79497),
					box(7.00563, 7.15, 5.79497, 7.40563, 7.95, 15.79497), box(7.80563, 7.15, 5.79497, 8.20563, 8.35, 15.79497), box(7.00563, 7.15, 5.79497, 7.80563, 7.55, 15.79497), box(7.20563, 8, 5.24497, 8.40563, 13, 5.64497),
					box(6.3, 8, 5.6, 7.4, 13, 6), box(8.00563, 8, 5.24497, 8.40563, 13, 6.44497), box(6.3, 8, 5.6, 6.7, 13, 6.5));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		boolean flag = context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER;
		return super.getStateForPlacement(context).setValue(FACING, context.getNearestLookingDirection().getOpposite()).setValue(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
		if (state.getValue(WATERLOGGED)) {
			world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
		}
		return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
	}

	@Override
	public boolean isLadder(BlockState state, LevelReader world, BlockPos pos, LivingEntity entity) {
		return true;
	}
}
