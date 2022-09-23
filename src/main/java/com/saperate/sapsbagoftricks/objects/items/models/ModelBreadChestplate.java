package com.saperate.sapsbagoftricks.objects.items.models;// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBreadChestplate extends ModelBiped {
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer cube_r1;

	public ModelBreadChestplate() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 1, 0, -4.0F, 0.0F, -3.0F, 8, 14, 7, 0.01F, false));
		Body.cubeList.add(new ModelBox(Body, 39, 16, -3.0F, 0.0F, 7.0F, 6, 14, 1, 0.01F, false));
		Body.cubeList.add(new ModelBox(Body, 38, 0, -5.0F, 0.0F, 4.0F, 10, 14, 3, 0.01F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-6.0F, 3.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 39, 54, -2.0F, -4.0F, -3.0F, 4, 4, 6, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 10, 36, -4.0F, -4.0F, -4.0F, 2, 4, 8, 0.0F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 17, 56, -5.0F, -4.0F, -2.0F, 1, 4, 4, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(6.0F, 3.0F, 0.0F);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-11.0F, -1.0F, 0.0F);
		LeftArm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 56, -16.0F, -3.0F, -2.0F, 1, 4, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 36, -15.0F, -3.0F, -4.0F, 2, 4, 8, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 54, -13.0F, -3.0F, -3.0F, 4, 4, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}