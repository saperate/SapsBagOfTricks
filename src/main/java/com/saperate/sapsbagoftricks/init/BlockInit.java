package com.saperate.sapsbagoftricks.init;

import com.saperate.sapsbagoftricks.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {//name: material_block = "block_material"//Will use material_block for model name
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block BREAD_BLOCK = new BlockBase("block_bread", Material.CAKE, SoundType.CLOTH);
}
