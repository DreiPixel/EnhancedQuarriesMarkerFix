package ml.pkom.enhancedquarries.tile;

import ml.pkom.enhancedquarries.Tiles;
import ml.pkom.enhancedquarries.event.TileCreateEvent;
import ml.pkom.enhancedquarries.tile.base.QuarryTile;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public class NormalQuarryTile extends QuarryTile {

    public NormalQuarryTile(BlockPos pos, BlockState state) {
        super(Tiles.NORMAL_QUARRY_TILE, pos, state);
    }

    public NormalQuarryTile(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public NormalQuarryTile(TileCreateEvent event) {
        this(event.getBlockPos(), event.getBlockState());
    }
}
