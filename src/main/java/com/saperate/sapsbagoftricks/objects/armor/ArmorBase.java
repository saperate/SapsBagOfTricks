package com.saperate.sapsbagoftricks.objects.armor;

import com.saperate.sapsbagoftricks.Main;
import com.saperate.sapsbagoftricks.init.ItemInit;
import com.saperate.sapsbagoftricks.objects.items.models.ModelBreadChestplate;
import com.saperate.sapsbagoftricks.thing;
import com.saperate.sapsbagoftricks.util.IHasModel;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorBase extends ItemArmor implements IHasModel {
    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.sapsbagoftrickstab);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {

        //find the unlocalized name and remove "item."
        String unlocalizedName = this.getUnlocalizedName();
        String[] name = unlocalizedName.split("item.");
        //

        thing.registerItemRenderer(this,0, name[1]);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default)
    {
        if(itemStack != ItemStack.EMPTY)
        {
            if(itemStack.getItem() instanceof ItemArmor)
            {
                ModelBreadChestplate model = new ModelBreadChestplate();

                model.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST;

                model.isChild = _default.isChild;
                model.isRiding = _default.isRiding;
                model.isSneak = _default.isSneak;
                model.rightArmPose = _default.rightArmPose;
                model.leftArmPose = _default.leftArmPose;

                return model;
            }
        }

        return null;
    }
}
