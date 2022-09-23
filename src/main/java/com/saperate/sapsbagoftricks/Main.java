package com.saperate.sapsbagoftricks;

import com.saperate.sapsbagoftricks.objects.entities.Listener;
import com.saperate.sapsbagoftricks.tabs.SapsBagOfTricksTab;
import com.saperate.sapsbagoftricks.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Main
{
    public static final CreativeTabs sapsbagoftrickstab = new SapsBagOfTricksTab("sapsbagoftricks");

    @Instance
    public static Main instance;


    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        RegistryHandler.preInitRegistriesBoth();

        Listener penguListener = new Listener();
        MinecraftForge.EVENT_BUS.register(penguListener);
    }



    @SideOnly(Side.CLIENT)
    @EventHandler
    public static void preInitClient(FMLPreInitializationEvent event)
    {

        RegistryHandler.preInitRegistriesClient();
    }


    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
        RegistryHandler.initRegistries();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
    }

    @EventHandler
    public static void serverInit(FMLServerStartingEvent event){
        RegistryHandler.serverRegistries(event);
    }


}