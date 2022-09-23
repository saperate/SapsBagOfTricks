package com.saperate.sapsbagoftricks;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import static net.minecraftforge.client.model.ModelLoader.setCustomModelResourceLocation;

public class thing {
    public static void registerItemRenderer(Item item, int meta, String id) {
        setCustomModelResourceLocation(item,
                meta,
                new ModelResourceLocation(Reference.MODID + ":" + id));
    }
}
