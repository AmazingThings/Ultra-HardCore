package com.amazingthings.uhc.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.amazingthings.uhc.UHC;

public class CommandStart implements CommandExecutor {

	public boolean started = false;

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(command.getName().equalsIgnoreCase("start")) {
			Player player = (Player) sender;
			for(Player online : Bukkit.getOnlinePlayers()) {
				if(started = false) {
					player.sendMessage("Started the game.");
					online.sendMessage(ChatColor.RED + "[UHC]" + ChatColor.RESET + "Game Started!");
					UHC.hasStarted = true;
					started = true;
					return true;
				} else if (started = true) {
					player.sendMessage("Forced game to stop.");
					online.sendMessage(ChatColor.RED + "[UHC]" + ChatColor.RESET + "Game stopped by Admin!");
					UHC.hasStarted = false;
					started = false;
					return true;
				}

			}
		}
		return false;
	}
}
