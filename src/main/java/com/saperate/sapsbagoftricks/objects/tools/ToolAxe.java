package com.saperate.sapsbagoftricks.objects.tools;

import com.saperate.sapsbagoftricks.Main;
import com.saperate.sapsbagoftricks.init.ItemInit;
import com.saperate.sapsbagoftricks.thing;
import com.saperate.sapsbagoftricks.util.IHasModel;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ToolAxe extends ItemTool implements IHasModel {

    public static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.CAKE);

    public ToolAxe(String name,ToolMaterial material){
        super(material,EFFECTIVE_ON);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.sapsbagoftrickstab);

        ItemInit.ITEMS.add(this);
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.CAKE && material != Material.PLANTS && material != Material.VINE ? 1 : this.toolMaterial.getEfficiency();
    }

    @Override
    public void registerModels() {
        //find the unlocalized name and remove "item."
        String unlocalizedName = this.getUnlocalizedName();
        String[] name = unlocalizedName.split("item.");
        //


        thing.registerItemRenderer(this,0, name[1]);
    }

}