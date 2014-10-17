package com.amazingthings.uhc;

import org.bukkit.plugin.java.JavaPlugin;

import com.amazingthings.uhc.commands.CommandStart;

public class UHC extends JavaPlugin {

	public UHC plugin;
	
	
	
	public void onEnable() {
		this.getCommand("start").setExecutor(new CommandStart());
		
	}
	

	public void onDisable() {
		
	}
}
