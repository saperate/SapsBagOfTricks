package com.saperate.sapsbagoftricks.util.handlers;



import com.saperate.sapsbagoftricks.commands.changebending;
import com.saperate.sapsbagoftricks.init.BlockInit;
import com.saperate.sapsbagoftricks.init.EntityInit;
import com.saperate.sapsbagoftricks.init.ItemInit;
import com.saperate.sapsbagoftricks.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for(Item item: ItemInit.ITEMS){
            if(item instanceof IHasModel){
                ((IHasModel) item).registerModels();
            }
        }
        for(Block block : BlockInit.BLOCKS){
            if(block instanceof IHasModel){
                ((IHasModel) block).registerModels();
            }
        }
    }

    public static void initRegistries(){
        SoundHandler.registerSounds();
    }


    public static void preInitRegistriesBoth()
    {
        EntityInit.registerEntities();

    }

    public static void preInitRegistriesClient()
    {
        RenderHandler.registerEntityRenders();

    }

    public static void serverRegistries(FMLServerStartingEvent event){
        event.registerServerCommand(new changebending());
    }
}
