package ThePlayerHaze.UnnamedMod;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGeneratorYM implements IWorldGenerator{
	
	@Override
	public void generate(Random random, int chunkx, int chunkz, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0 : generateSurface(world, random, chunkx*16, chunkz*16);
		}
		
	}

	private void generateSurface(World world, Random random, int blockx, int blockz){
		for (int i =0; i<10;i++) {
			int xcoord = blockx + random.nextInt(16);
			int zcoord = blockz + random.nextInt(16);
			int ycoord = random.nextInt(48);
			//OreGenerators
			(new WorldGenMinable (YargMod.blockMogiteOre.blockID, 4)).generate(world, random, xcoord, ycoord, zcoord);
			
		}
			
	}
	
	{
		
		
	}
}