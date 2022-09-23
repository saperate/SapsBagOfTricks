package com.saperate.sapsbagoftricks.util.handlers;

import com.saperate.sapsbagoftricks.objects.entities.EntityDustie;
import com.saperate.sapsbagoftricks.objects.entities.EntityHostilePengu;
import com.saperate.sapsbagoftricks.objects.entities.EntityPengu;
import com.saperate.sapsbagoftricks.objects.entities.render.RenderDustie;
import com.saperate.sapsbagoftricks.objects.entities.render.RenderHostilePengu;
import com.saperate.sapsbagoftricks.objects.entities.render.RenderPengu;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class RenderHandler
{
    @SideOnly(Side.CLIENT)
    public static void registerEntityRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityPengu.class, new IRenderFactory<EntityPengu>() {
            @Override
            public Render<? super EntityPengu> createRenderFor(RenderManager manager) {
                return new RenderPengu(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityDustie.class, new IRenderFactory<EntityDustie>() {
            @Override
            public Render<? super EntityDustie> createRenderFor(RenderManager manager) {
                return new RenderDustie(manager);
            }
        });

        RenderingRegistry.registerEntityRenderingHandler(EntityHostilePengu.class, new IRenderFactory<EntityHostilePengu>() {
            @Override
            public Render<? super EntityHostilePengu> createRenderFor(RenderManager manager) {
                return new RenderHostilePengu(manager);
            }
        });


    }
}
