package com.saperate.sapsbagoftricks.util.handlers;

import com.saperate.sapsbagoftricks.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler
{
    public static final ResourceLocation PINGU = LootTableList.register(new ResourceLocation(Reference.MODID,"pingu"));

    public static final ResourceLocation DUSTIE = LootTableList.register(new ResourceLocation(Reference.MODID,"dustie"));
}
