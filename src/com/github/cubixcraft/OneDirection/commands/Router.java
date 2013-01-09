package com.github.cubixcraft.OneDirection.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.cubixcraft.OneDirection.Main;
import com.github.cubixcraft.OneDirection.PlayerStorage;
import com.github.cubixcraft.OneDirection.extras.Direction;

public class Router implements CommandExecutor {
	Main plugin;
	PlayerStorage players;

	public Router(Main plugin) {
		this.plugin = plugin;
		this.players = plugin.players;
		plugin.getCommand("OneDirection").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (args.length > 0) {
			switch (args[0]) {
				case "vertical":
				case "v":
					players.set((Player) sender, Direction.VERTICAL);
					break;
				case "horizontal":
				case "h":
					players.set((Player) sender, Direction.HORIZONTAL);
					break;
				case "l":
				case "lateral":
					players.set((Player) sender, Direction.LATERAL);
					break;
				case "off":
				default:
					players.set((Player) sender, Direction.NONE);
					break;
			}
			return true;
		}
		return false;
	}
}
