package com.amazingthings.uhc.commands;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandStart implements CommandExecutor {

	
		Random rand = new Random();
		int L = 1;
		int H = 500;

		int randomX = (int) (Math.random() * (H - L)) + L;
		int randomZ = (int) (Math.random() * (H - L)) + L;

	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(command.getName().equalsIgnoreCase("start")) {
			Player player = (Player) sender;
			for(Player online : Bukkit.getOnlinePlayers()) {
				player.sendMessage("Started the game.");
				online.sendMessage(ChatColor.RED + "[UHC]" + ChatColor.RESET + "Game Started!");
				online.teleport(new Location(online.getWorld(), randomX, online.getWorld().getHighestBlockYAt(randomX, randomZ) + 1, randomZ));
				randomX = (int) (Math.random() * (H - L)) + L;
				randomZ = (int) (Math.random() * (H - L)) + L;
				return true;
			}
		}
		return false;
	}

}
