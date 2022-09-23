package com.saperate.sapsbagoftricks.objects.entities.render;

import com.saperate.sapsbagoftricks.Reference;
import com.saperate.sapsbagoftricks.objects.entities.EntityHostilePengu;
import com.saperate.sapsbagoftricks.objects.entities.EntityPengu;
import com.saperate.sapsbagoftricks.objects.entities.models.ModelHostilePengu;
import com.saperate.sapsbagoftricks.objects.entities.models.ModelPengu;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHostilePengu extends RenderLiving<EntityHostilePengu> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID+":textures/entity/hostile_pengu.png");

    public RenderHostilePengu(RenderManager manager) {
        super(manager, new ModelHostilePengu(), 0.3F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityHostilePengu entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityHostilePengu entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
