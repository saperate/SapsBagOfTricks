package com.saperate.sapsbagoftricks.objects.entities;

import com.google.common.collect.Sets;

import com.saperate.sapsbagoftricks.util.handlers.LootTableHandler;
import com.saperate.sapsbagoftricks.util.handlers.SoundHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Set;

public class EntityDustie extends EntityMob
{


    private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(Items.FISH);
    public EntityCreature Enemy;
    private int attackTimer;

    public EntityDustie(World worldIn)
    {
        super(worldIn);
        this.setSize(0.68F, 2.6F);
        this.isImmuneToFire = true;

        this.setPathPriority(PathNodeType.WATER,-1.0F);
        this.setPathPriority(PathNodeType.LAVA,0.0F);
        this.setPathPriority(PathNodeType.DAMAGE_FIRE,0.0F);
        this.setPathPriority(PathNodeType.DANGER_FIRE,0.0F);
    }



    @Override
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAttackMelee(this, 0.6D, true));
        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.5D, 32.0F));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 0.6D));
        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 0.6D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));

        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[0]));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));



    }

    public void onLivingUpdate()
    {
        super.onLivingUpdate();


        if(this.isBeingRidden())
       {


           if(this.isInLava())
           {

               this.getPassengers().get(0).dismountRidingEntity();
           }
       }
    }

    public void glow(boolean bool)
    {
        this.glowing = true;
    }


    public boolean attackEntityAsMob(Entity entityIn)
    {
        this.attackTimer = 10;
        this.world.setEntityState(this, (byte)4);
        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(2 + this.rand.nextInt(3)));

        if (flag)
        {
            this.applyEnchantments(this, entityIn);
            if(entityIn instanceof EntityPlayer){


                BlockPos targetBlock = findNearestFluid(Blocks.LAVA,this);
                if (targetBlock != null&& !this.isInLava())
                {
                    this.mountTo(entityIn);
                    this.getNavigator().tryMoveToXYZ(targetBlock.getX(),targetBlock.getY(),targetBlock.getZ(),1);
                }
            }

        }

        this.playSound(SoundEvents.ENTITY_IRONGOLEM_ATTACK, 1.0F, 1.0F);
        return flag;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
    }

    @Override
    protected ResourceLocation getLootTable(){
        return LootTableHandler.PINGU;
    }


    @Override
    protected SoundEvent getAmbientSound()
    {

        return null;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source)
    {

        return SoundHandler.ENTITY_DUSTIE_HURT;

    }

    @Override
    protected SoundEvent getDeathSound()
    {
        return SoundHandler.ENTITY_DUSTIE_DEATH;
    }


    protected void mountTo(Entity player)
    {

        player.rotationYaw = this.rotationYaw;
        player.rotationPitch = this.rotationPitch;

        if (!this.world.isRemote)
        {

            player.startRiding(this);
        }
    }

    protected BlockPos findNearestFluid(Block targetBlock, EntityDustie entity)
    {

        BlockPos closestPos = null;

        int x = (int) (entity.posX-10);
        int y = (int) (entity.posY-5);
        int z = (int) (entity.posZ-10);
        for (; x < entity.posX+11; x++)
        {
            //System.out.print("  ^Coords^"+x+" "+y+" "+z);
            //world.setBlockToAir(new BlockPos(x,y,z));

            if(x == (int) (entity.posX+10)) {
                z++;
                x = (int) (entity.posX-10);
            }

            if(z == (int) (entity.posZ+10)) {
                y++;
                z = (int) (entity.posZ-10);
            }
            if(y == (int) (entity.posY+5))
            {
                break;
            }

            BlockPos checkPos = new BlockPos(x,y,z);
            if(world.getBlockState(checkPos).getBlock() == targetBlock && !this.getNavigator().noPath())
            {
                int dist = (int) entity.getDistanceSq(checkPos);
                int closestDist = (int) entity.getDistanceSq(checkPos);
                if(closestPos == null || dist < closestDist)
                {
                    System.out.print("  ^Coords^"+x+" "+y+" "+z);
                    closestPos = checkPos;
                }
            }

        }

        return closestPos;

    }

}
