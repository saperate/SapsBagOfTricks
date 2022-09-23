package com.saperate.sapsbagoftricks.init;

import com.saperate.sapsbagoftricks.Main;
import com.saperate.sapsbagoftricks.Reference;
import com.saperate.sapsbagoftricks.objects.entities.EntityDustie;
import com.saperate.sapsbagoftricks.objects.entities.EntityHostilePengu;
import com.saperate.sapsbagoftricks.objects.entities.EntityPengu;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit
{
    public static void registerEntities()
    {
        registerEntity("pengu", EntityPengu.class,Reference.ENTITY_PENGU,50,14024703,2017023);
        registerEntity("hostile_pengu", EntityHostilePengu.class,Reference.ENTITY_HOSTILE_PENGU,50,14024703,2017023);

        registerEntity("dustie", EntityDustie.class,Reference.ENTITY_DUSTIE,50,16753753,6316128);

    }


    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range,int color1,int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID+":"+name),entity,name,id, Main.instance,range,1,true,color1,color2);
    }
}
