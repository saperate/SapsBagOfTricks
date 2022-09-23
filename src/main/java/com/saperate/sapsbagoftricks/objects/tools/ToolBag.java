package com.saperate.sapsbagoftricks.objects.tools;


import com.saperate.sapsbagoftricks.objects.entities.EntityDustie;
import com.saperate.sapsbagoftricks.objects.entities.EntityPengu;
import com.saperate.sapsbagoftricks.objects.items.ItemBase;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class ToolBag extends ItemBase {


    public ToolBag(String name) {
        super(name);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

        if(!worldIn.isRemote) {
            int randomType = (int) (Math.random() * 20 + 1);
            ItemStack item = player.getHeldItem(hand);
            Vec3d aim = player.getLookVec();

            Entity entity = null;

            switch (randomType) {
                case 1:
                    entity = new EntityPengu(worldIn);
                    break;
                case 2:
                    entity = new EntityChicken(worldIn);
                    break;
                case 3:
                    entity = new EntityBlaze(worldIn);
                    break;
                case 4:
                    entity = new EntityTNTPrimed(worldIn);
                    break;
                case 5:
                    entity = new EntityCreeper(worldIn);
                    break;
                case 6:
                    entity = new EntityDustie(worldIn);
                    break;
                case 7:
                    entity = new EntityEvoker(worldIn);
                    break;
                case 8:
                    entity = new EntityIllusionIllager(worldIn);
                    break;
                case 9:
                    entity = new EntityCaveSpider(worldIn);
                    break;
                case 10:
                    entity = new EntityIronGolem(worldIn);
                    break;
                case 11:
                    entity = new EntityElderGuardian(worldIn);
                    break;
                case 12:
                    entity = new EntityBat(worldIn);
                    break;
                case 13:
                    entity = new EntityCow(worldIn);
                    break;
                case 14:
                    entity = new EntityBoat(worldIn);
                    break;
                case 15:
                    entity = new EntityEnderCrystal(worldIn);
                    break;
                case 16:
                    entity = new EntityEnderman(worldIn);
                    break;
                case 17:
                    entity = new EntityPigZombie(worldIn);
                    break;
                case 18:
                    entity = new EntityPolarBear(worldIn);
                    break;
                case 19:
                    entity = new EntityShulker(worldIn);
                    break;
                case 20:
                    entity = new EntitySquid(worldIn);
                    break;
                default:
                    return EnumActionResult.FAIL;

            }

            entity.setPosition(player.posX + aim.x, player.posY + aim.y+1, player.posZ+ aim.z);
            worldIn.spawnEntity(entity);

            return EnumActionResult.PASS;
        }
        return EnumActionResult.FAIL;
    }
}
