package com.github.cubixcraft.OneDirection;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.cubixcraft.OneDirection.commands.Router;

public class Main extends JavaPlugin {
	public static Main instance;
	
	public static Logger log = Bukkit.getLogger();
	private PluginManager pm;
	
	public PlayerStorage players = new PlayerStorage();
	
	public void onEnable() {
		this.instance = this;
		this.pm = getServer().getPluginManager();
		
		// Register all events
		pm.registerEvents(new EventListener(this), this);
		
		// Register commands
		getCommand("OneDirection").setExecutor(new Router(this));
	}
	
	public void onDisable() {
		
	}

}