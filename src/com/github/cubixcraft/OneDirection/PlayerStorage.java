package com.github.cubixcraft.OneDirection;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;

import com.github.cubixcraft.OneDirection.extras.Direction;

public class PlayerStorage {
	private Map<Player, Direction> players = new HashMap<Player, Direction>();
	
	public Direction get(Player player) {
		if (players.containsKey(player)) return players.get(player);
		return Direction.NONE;
	}
	
	public void set(Player player, Direction direction) {
		players.put(player, direction);
	}
	
	public void remove(Player player) {
		players.remove(player);
	}
}
