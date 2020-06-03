package de.zanyar.HealCommand.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.zanyar.HealCommand.healcommand.HealCommand;

public class Main extends JavaPlugin {
	public void onEnable() {
		getCommand("heal").setExecutor(new HealCommand());
		
		Bukkit.getConsoleSender().sendMessage("§aHealCommand was started successfully! By Axolxtl");
	}
}
		 
