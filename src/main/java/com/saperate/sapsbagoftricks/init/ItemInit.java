package com.saperate.sapsbagoftricks.init;

import com.saperate.sapsbagoftricks.Reference;
import com.saperate.sapsbagoftricks.objects.armor.ArmorBase;
import com.saperate.sapsbagoftricks.objects.items.ItemBase;
import com.saperate.sapsbagoftricks.objects.tools.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {//name: Material_Item = "Item_material"//Will use Item_Material for model name
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials
    public static final Item.ToolMaterial TOOL_BREAD = EnumHelper.addToolMaterial("tool_bread",0,1,1.0F,0.0F,15);
    public static final ItemArmor.ArmorMaterial ARMOR_BREAD = EnumHelper.addArmorMaterial("armor_bread", Reference.MODID + ":bread",10,new int[]{1,1,1,5},15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,0.0F);

    //Items
    public static final Item BREAD_STICK = new ItemBase("stick_bread");

    //Tools
    public static final Item BAG_OF_TRICKS = new ToolBag("tricks_bag");
    public static final Item BREAD_AXE = new ToolAxe("axe_bread",TOOL_BREAD);
    public static final Item BREAD_HOE = new ToolHoe("hoe_bread",TOOL_BREAD);
    public static final Item BREAD_PICKAXE = new ToolPickaxe("pickaxe_bread",TOOL_BREAD);
    public static final Item BREAD_SHOVEL = new ToolShovel("shovel_bread",TOOL_BREAD);
    public static final Item BREAD_SWORD = new ToolSword("sword_bread",TOOL_BREAD);

    //Armor
    //public static final Item BREAD_HELMET = new ArmorBase("helmet_bread",ARMOR_BREAD,1, EntityEquipmentSlot.HEAD);
    public static final Item BREAD_CHESTPLATE = new ArmorBase("chestplate_bread",ARMOR_BREAD,1,EntityEquipmentSlot.CHEST);
    //public static final Item BREAD_LEGGINGS = new ArmorBase("leggings_bread",ARMOR_BREAD,2,EntityEquipmentSlot.LEGS);
    //public static final Item BREAD_BOOTS = new ArmorBase("boots_bread",ARMOR_BREAD,1,EntityEquipmentSlot.FEET);
}
