package com.saperate.sapsbagoftricks.objects.tools;

import com.saperate.sapsbagoftricks.Main;
import com.saperate.sapsbagoftricks.init.ItemInit;
import com.saperate.sapsbagoftricks.thing;
import com.saperate.sapsbagoftricks.util.IHasModel;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel {

    public ToolPickaxe(String name,ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.sapsbagoftrickstab);

        ItemInit.ITEMS.add(this);
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