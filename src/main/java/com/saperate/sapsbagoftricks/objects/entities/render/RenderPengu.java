package com.saperate.sapsbagoftricks.objects.entities.render;

import com.saperate.sapsbagoftricks.Reference;
import com.saperate.sapsbagoftricks.objects.entities.EntityPengu;
import com.saperate.sapsbagoftricks.objects.entities.models.ModelPengu;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPengu extends RenderLiving<EntityPengu> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID+":textures/entity/pengu.png");

    public RenderPengu(RenderManager manager) {
        super(manager, new ModelPengu(), 0.3F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityPengu entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityPengu entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
