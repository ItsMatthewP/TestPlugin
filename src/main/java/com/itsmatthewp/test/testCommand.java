package com.itsmatthewp.test;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class testCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;
        Location l1 = null;
        Location l2 = null;
        Cuboid cuboid = null;

        if(sender instanceof Player) {
            //player.sendMessage(ChatColor.RED + "Please Provide An Argument.");
            if (args[0].equalsIgnoreCase("create") && args[1] == null) {
                    player.sendMessage(ChatColor.RED + "Incorrect Usage! Argument 1 Empty.");
                }
                else if (args[0].equalsIgnoreCase("create") && args[1] == "1") {
                    l1 = player.getTargetBlockExact(100).getLocation();
                    player.sendMessage("Position 1 Created!");
                }
                else if (args[0].equalsIgnoreCase("create") && args[1] == "2") {
                    l2 = player.getTargetBlockExact(100).getLocation();
                    player.sendMessage("Position 2 Created!");
                }
                
                if (args[1].equalsIgnoreCase("cuboid") && l1 != null) {
                    cuboid = new Cuboid(l1, l2);
                    player.sendMessage("Region Created!");
                    
                if (args[0].equalsIgnoreCase("fill") && l1 != null) {
                    for (Block blocks: cuboid.getBlocks()) {
                        blocks.setType(Material.DIAMOND_BLOCK);
                    }
                    player.sendMessage("Region Filled!");
                } 
        }
        else {
            player.sendMessage(ChatColor.RED + "Incorrect Usage! This Command Is In-Game Only.");
        }
        return false;
    }
}
