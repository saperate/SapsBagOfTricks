package com.saperate.sapsbagoftricks.objects.entities;

import com.google.common.base.Predicate;
import com.google.common.collect.Sets;
import com.saperate.sapsbagoftricks.util.handlers.LootTableHandler;
import com.saperate.sapsbagoftricks.util.handlers.SoundHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Set;

public class EntityHostilePengu extends EntityCreature
{
    private static final Set<Item> TEMPTATION_ITEMS = Sets.newHashSet(Items.FISH);
    public EntityCreature Enemy;
    private int attackTimer;

    public EntityHostilePengu(World worldIn)
    {
        super(worldIn);
        this.setSize(0.5F, 1.0F);
        this.setPathPriority(PathNodeType.WATER, 0.0F);
    }

    @Override
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.3D, true));
        this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 1.2D, 32.0F));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, 1.3D));
        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 1.3D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));

        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[0]));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));


    }

    public boolean attackEntityAsMob(Entity entityIn)
    {
        this.attackTimer = 10;
        this.world.setEntityState(this, (byte)4);
        boolean flag = entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(0 + this.rand.nextInt(2)));

        if (flag)
        {
            entityIn.motionY += 0.8000000059604645D;
            this.applyEnchantments(this, entityIn);
            this.playSound(SoundEvents.ENTITY_IRONGOLEM_ATTACK, 1.0F, 1.0F);
        }


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

        return SoundHandler.ENTITY_PINGU_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source)
    {

        return SoundHandler.ENTITY_PINGU_HURT;

    }

    @Override
    protected SoundEvent getDeathSound()
    {
        return SoundHandler.ENTITY_PINGU_DEATH;
    }



}
