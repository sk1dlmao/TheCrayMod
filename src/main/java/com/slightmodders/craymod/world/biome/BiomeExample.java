/**
 * Register each model for items in RECIPES
 *
 *

package com.slightmodders.craymod.world.biome;

import com.slightmodders.craymod.init.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeExample extends Biome

{
    @Override
    @SideOnly(Side.CLIENT)
    public int getSkyColorByTemp(float temp)
    {
        return 0;
    }

    public BiomeExample()
    {
        super(new Biome.BiomeProperties("BiomeName").setRainDisabled().setWaterColor(23040));

        topBlock = ModBlocks.topBlock.getDefaultState();
        fillerBlock = ModBlocks.fillerBlock.getDefaultState();

        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.spawnableWaterCreatureList.clear();

        this.spawnableCreatureList.add(new SpawnListEntry(EntityYourEntity.class, 10, 1, 5));
    }
}
 */