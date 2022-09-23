package com.saperate.sapsbagoftricks.objects.entities.models;// Made with Blockbench 4.2.5


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelDustie extends ModelBase {
	private final ModelRenderer Torso;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LegR;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LegL;
	private final ModelRenderer Head;
	private final ModelRenderer RightArm;
	private final ModelRenderer UpperArmR;
	private final ModelRenderer LowerArmR;
	private final ModelRenderer LeftArm;
	private final ModelRenderer UpperArmL;
	private final ModelRenderer LowerArmL;


	public ModelDustie() {
		textureWidth = 96;
		textureHeight = 96;

		Torso = new ModelRenderer(this);
		Torso.setRotationPoint(0.0F, 1.0F, 0.0F);
		Torso.cubeList.add(new ModelBox(Torso, 38, 0, -7.0F, 5.0F, -5.0F, 13, 1, 8, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 0, -6.0F, -10.0F, -5.0F, 11, 15, 8, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 30, 23, -3.0F, -4.0F, -6.0F, 5, 7, 8, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 0, 67, -5.0F, -8.0F, -6.0F, 9, 4, 1, 0.0F, false));
		Torso.cubeList.add(new ModelBox(Torso, 56, 23, -5.0F, -11.0F, -4.0F, 9, 1, 6, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-4.0F, 6.0F, -1.0F);
		Torso.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 24, 39, -3.0F, 0.0F, -3.0F, 6, 4, 6, 0.0F, false));

		LegR = new ModelRenderer(this);
		LegR.setRotationPoint(0.0F, 4.0F, 0.5F);
		RightLeg.addChild(LegR);
		LegR.cubeList.add(new ModelBox(LegR, 64, 39, -2.0F, 0.0F, -2.5F, 4, 13, 4, 0.0F, false));
		LegR.cubeList.add(new ModelBox(LegR, 64, 56, -2.0F, 10.0F, -4.5F, 4, 3, 6, 0.01F, false));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(3.0F, 7.0F, -1.0F);
		Torso.addChild(LeftLeg);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 39, -3.0F, -1.0F, -3.0F, 6, 4, 6, 0.0F, false));

		LegL = new ModelRenderer(this);
		LegL.setRotationPoint(0.0F, 3.0F, 0.5F);
		LeftLeg.addChild(LegL);
		LegL.cubeList.add(new ModelBox(LegL, 48, 39, -2.0F, 0.0F, -2.5F, 4, 13, 4, 0.0F, false));
		LegL.cubeList.add(new ModelBox(LegL, 44, 56, -2.0F, 10.0F, -4.5F, 4, 3, 6, 0.01F, false));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Torso.addChild(Head);
		Head.cubeList.add(new ModelBox(Head, 0, 23, -4.0F, -19.0F, -5.0F, 7, 8, 8, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-6.0F, -8.0F, -1.0F);
		Torso.addChild(RightArm);
		RightArm.cubeList.add(new ModelBox(RightArm, 22, 56, -5.0F, -3.0F, -3.0F, 5, 5, 6, 0.0F, false));

		UpperArmR = new ModelRenderer(this);
		UpperArmR.setRotationPoint(-3.0F, 2.0F, 0.0F);
		RightArm.addChild(UpperArmR);
		UpperArmR.cubeList.add(new ModelBox(UpperArmR, 48, 67, -1.0F, 0.0F, -2.0F, 3, 5, 4, 0.0F, false));

		LowerArmR = new ModelRenderer(this);
		LowerArmR.setRotationPoint(0.5F, 5.75F, 0.0F);
		UpperArmR.addChild(LowerArmR);
		LowerArmR.cubeList.add(new ModelBox(LowerArmR, 14, 77, -1.5F, 5.25F, -2.0F, 3, 1, 4, 0.25F, false));
		LowerArmR.cubeList.add(new ModelBox(LowerArmR, 20, 67, -1.5F, -0.75F, -2.0F, 3, 6, 4, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, -8.0F, -1.0F);
		Torso.addChild(LeftArm);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 56, 0.0F, -3.0F, -3.0F, 5, 5, 6, 0.0F, false));

		UpperArmL = new ModelRenderer(this);
		UpperArmL.setRotationPoint(3.0F, 2.0F, 0.0F);
		LeftArm.addChild(UpperArmL);
		UpperArmL.cubeList.add(new ModelBox(UpperArmL, 62, 67, -2.0F, 0.0F, -2.0F, 3, 5, 4, 0.0F, false));

		LowerArmL = new ModelRenderer(this);
		LowerArmL.setRotationPoint(0.0F, 6.0F, 0.0F);
		UpperArmL.addChild(LowerArmL);
		LowerArmL.cubeList.add(new ModelBox(LowerArmL, 34, 67, -2.0F, -1.0F, -2.0F, 3, 6, 4, 0.0F, false));
		LowerArmL.cubeList.add(new ModelBox(LowerArmL, 0, 77, -2.0F, 5.0F, -2.0F, 3, 1, 4, 0.25F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Torso.render(f5);
	}


	@Override
	public void setRotationAngles(float limbSwing,float limbSwingAmount,float ageInTicks,float netHeadYaw,float headPitch,float scaleFactor,Entity entityIn)
	{

		this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

		boolean disableArmAnims = false;

		if(disableArmAnims == false) {
			this.RightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
			this.LeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;

			this.LowerArmR.rotateAngleX = MathHelper.abs(MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount) * -1;
			this.LowerArmL.rotateAngleX = MathHelper.abs(MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount) * -1;
		}

		this.Head.rotateAngleX = headPitch * 0.0025F;
		this.Head.rotateAngleY = netHeadYaw * 0.005F;


		if(entityIn.isBeingRidden())

		{
			this.RightArm.rotateAngleX = -90;
			this.LeftArm.rotateAngleX = -90;
			disableArmAnims = true;
		}
		else{
			disableArmAnims = false;

		}
	}


}

