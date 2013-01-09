package com.github.cubixcraft.OneDirection;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import com.github.cubixcraft.OneDirection.extras.LogEqualiser;

public class EventListener implements Listener {
	private Main plugin;
	private PlayerStorage players;
	
	public EventListener(Main plugin) {
		this.plugin = plugin;
		this.players = plugin.players;
	}
	
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlockPlaced();
		
		plugin.log.info("" + block.getData());

		if (player.hasPermission("onedirection.use")
				&& block.getType().equals(Material.LOG)) {
			LogEqualiser.equalise(block, players.get(player));
		}
	}
}
