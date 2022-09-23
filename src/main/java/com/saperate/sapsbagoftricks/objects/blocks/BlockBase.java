package com.saperate.sapsbagoftricks.objects.blocks;

import com.saperate.sapsbagoftricks.Main;
import com.saperate.sapsbagoftricks.init.BlockInit;
import com.saperate.sapsbagoftricks.init.ItemInit;
import com.saperate.sapsbagoftricks.thing;
import com.saperate.sapsbagoftricks.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material, SoundType sound){
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.sapsbagoftrickstab);
        setSoundType(sound);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {

        //find the unlocalized name and remove "tile."
        String unlocalizedName = this.getUnlocalizedName();
        String[] name = unlocalizedName.split("tile.");
        //

        thing.registerItemRenderer(Item.getItemFromBlock(this),0, name[1]);
    }
}
