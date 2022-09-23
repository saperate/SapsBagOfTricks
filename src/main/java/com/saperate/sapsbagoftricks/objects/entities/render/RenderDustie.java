package com.saperate.sapsbagoftricks.objects.entities.render;

import com.saperate.sapsbagoftricks.Reference;
import com.saperate.sapsbagoftricks.objects.entities.EntityDustie;
import com.saperate.sapsbagoftricks.objects.entities.EntityPengu;
import com.saperate.sapsbagoftricks.objects.entities.models.ModelDustie;
import com.saperate.sapsbagoftricks.objects.entities.models.ModelPengu;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderDustie extends RenderLiving<EntityDustie> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID+":textures/entity/dustie.png");

    public RenderDustie(RenderManager manager) {
        super(manager, new ModelDustie(), 0.3F);
    }


    @Override
    protected ResourceLocation getEntityTexture(EntityDustie entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityDustie entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
