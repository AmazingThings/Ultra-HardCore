package com.amazingthings.uhc;

import org.bukkit.plugin.java.JavaPlugin;

import com.amazingthings.uhc.commands.CommandStart;

public class UHC extends JavaPlugin {

	public UHC plugin;
	public static boolean hasStarted = false;
	
	
	public void onEnable() {
		
		this.getCommand("start").setExecutor(new CommandStart());
		getServer().getScheduler().scheduleSyncRepeatingTask(this, new TeleportRun(), 20l, 20l);
		hasStarted = false;
	}
	

	public void onDisable() {
		

	}
}
