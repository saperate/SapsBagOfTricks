package com.saperate.sapsbagoftricks.commands;

import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class changebending implements ICommand {


    private final List aliases;



    public changebending()
    {
        aliases = new ArrayList();

        aliases.add("changebending");


    }

    @Override
    public String getName() {
        return "changebending";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "changebending <text>";
    }

    @Override
    public List<String> getAliases() {
        return this.aliases;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {

        System.out.print("GALAXIM90"+args[0]);

        //Logs the action to -199 14 18, so if you want to catch people abusing the command place a hopper or smth, if not just place a bucket of lava
        server.getCommandManager().executeCommand(server,"/summon Item -199 14 -18 {Item:{id:wooden_sword,Count:1,tag:{display:{Name:"+sender.getName()+",Lore:["+args[0]+"]}}}}");

        System.out.print("GALAXIM160");

        //this part will only work if you have the mod avatar out of the iceberg, if not it will just say it cant do it but still log the action
        server.getCommandManager().executeCommand(server,"avatar bending remove "+sender.getName()+" all");
        server.getCommandManager().executeCommand(server,"avatar bending add "+sender.getName()+" "+args [0]);

        System.out.print("GALAXIM278");
        return;
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
}
