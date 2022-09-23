package com.saperate.sapsbagoftricks.tabs;

import com.saperate.sapsbagoftricks.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SapsBagOfTricksTab extends CreativeTabs {

    public SapsBagOfTricksTab(String label){
        super("sapsbagoftrickstab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.BAG_OF_TRICKS);
    }
}
