package com.saperate.sapsbagoftricks.util.handlers;

import com.saperate.sapsbagoftricks.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundHandler {
    public static SoundEvent ENTITY_PINGU_AMBIENT;
    public static SoundEvent ENTITY_PINGU_HURT;
    public static SoundEvent ENTITY_PINGU_DEATH;

    public static SoundEvent ENTITY_DUSTIE_HURT;
    public static SoundEvent ENTITY_DUSTIE_DEATH;

    public static void registerSounds(){
        ENTITY_PINGU_AMBIENT = registerSound("entity.pingu.ambient");
        ENTITY_PINGU_HURT = registerSound("entity.pingu.hurt");
        ENTITY_PINGU_DEATH = registerSound("entity.pingu.death");

        ENTITY_DUSTIE_HURT = registerSound("entity.dustie.hurt");
        ENTITY_DUSTIE_DEATH = registerSound("entity.dustie.death");
    }

    private static SoundEvent registerSound(String name)
    {
        ResourceLocation location = new ResourceLocation(Reference.MODID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
