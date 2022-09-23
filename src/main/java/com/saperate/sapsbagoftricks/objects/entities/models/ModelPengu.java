package com.saperate.sapsbagoftricks.objects.entities.models;// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelPengu extends ModelBase {
	private final ModelRenderer Torso;
	private final ModelRenderer Tail;
	private final ModelRenderer Head;
	private final ModelRenderer RightWing;
	private final ModelRenderer LeftWing;
	private final ModelRenderer RightFeet;
	private final ModelRenderer LeftFeet;

	public ModelPengu() {
		textureWidth = 64;
		textureHeight = 64;

		Torso = new ModelRenderer(this);
		Torso.setRotationPoint(0.0F, 24.0F, 0.0F);
		Torso.cubeList.add(new ModelBox(Torso, 0, 0, -4.0F, -14.0F, -4.0F, 8, 12, 7, 0.0F, false));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		Tail.cubeList.add(new ModelBox(Tail, 0, 0, -1.0F, -4.0F, 3.0F, 2, 2, 1, 0.0F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 19, -3.0F, -19.0F, -5.0F, 6, 5, 6, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 61, -1.0F, -16.0F, -6.0F, 2, 2, 1, 0.0F, false));

		LeftWing = new ModelRenderer(this);
		LeftWing.setRotationPoint(3F, 11.0F, 0F);
		LeftWing.cubeList.add(new ModelBox(LeftWing, 0, 30, 1F, 0.0F, -3F, 1, 10, 5, 0.0F, false));

		RightWing = new ModelRenderer(this);
		RightWing.setRotationPoint(-3F, 11.0F, 0.0F);
		RightWing.cubeList.add(new ModelBox(RightWing, 24, 19, -2.0F, 0.0F, -3.0F, 1, 10, 5, 0.0F, false));

		LeftFeet = new ModelRenderer(this);
		LeftFeet.setRotationPoint(0.0F, 24.0F, 0.0F);
		LeftFeet.cubeList.add(new ModelBox(LeftFeet, 2, 3, 2.0F, 0.0F, -2.0F, 1, 0, 2, 0.01F, false));
		LeftFeet.cubeList.add(new ModelBox(LeftFeet, 0, 5, 2.0F, -2.0F, 0.0F, 1, 2, 0, 0.01F, false));

		RightFeet = new ModelRenderer(this);
		RightFeet.setRotationPoint(0.0F, 24.0F, 0.0F);
		RightFeet.cubeList.add(new ModelBox(RightFeet, 0, 3, -3.0F, -2.0F, 0.0F, 1, 2, 0, 0.01F, false));
		RightFeet.cubeList.add(new ModelBox(RightFeet, 0, 3, -3.0F, 0.0F, -2.0F, 1, 0, 2, 0.01F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		Torso.render(f5);
		Head.render(f5);
		Tail.render(f5);
		LeftWing.render(f5);
		RightWing.render(f5);
		LeftFeet.render(f5);
		RightFeet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(float limbSwing,float limbSwingAmount,float ageInTicks,float netHeadYaw,float headPitch,float scaleFactor,Entity entityIn)
	{
		this.RightFeet.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.LeftFeet.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;



		this.Head.rotateAngleX = headPitch * 0.0025F;
		this.Head.rotateAngleY = netHeadYaw * 0.005F;

		this.RightWing.rotateAngleX = MathHelper.cos(limbSwing * 0.4442F) * 1.4F * limbSwingAmount;
		this.LeftWing.rotateAngleX = MathHelper.cos(limbSwing * 0.4442F + (float)Math.PI) * 1.4F * limbSwingAmount;

	}
}