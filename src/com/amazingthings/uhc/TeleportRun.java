package com.amazingthings.uhc;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class TeleportRun implements Runnable {

	Random rand = new Random();
	int L = 1;
	int H = 500;

	int randomX = (int) (Math.random() * (H - L)) + L;
	int randomZ = (int) (Math.random() * (H - L)) + L;
	
	@Override
	public void run() {
		for(Player player : Bukkit.getOnlinePlayers()) {
			if(UHC.hasStarted != false) {

				player.teleport(new Location(player.getWorld(), randomX, player.getWorld().getHighestBlockYAt(randomX, randomZ) + 1, randomZ));
				randomX = (int) (Math.random() * (H - L)) + L;
				randomZ = (int) (Math.random() * (H - L)) + L;
			}
		}

	}

}
