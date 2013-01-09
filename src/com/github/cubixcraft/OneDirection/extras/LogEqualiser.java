package com.github.cubixcraft.OneDirection.extras;

import org.bukkit.Material;
import org.bukkit.block.Block;

public class LogEqualiser {
	public static void equalise(Block log, Direction direction) {
		if (log.getType().equals(Material.LOG)) {
			int type = log.getData() % 4;
			
			switch (direction) {
				case VERTICAL:
					log.setData((byte) (type + (4 * 0)));
					break;
				case HORIZONTAL:
					log.setData((byte) (type + (4 * 1)));
					break;
				case LATERAL:
					log.setData((byte) (type + (4 * 2)));
					break;
				default:
					break;
			}
		}
	}
	
	public static void vertical(Block log) {
		equalise(log, Direction.VERTICAL);
	}
	
	public static void horizontal(Block log) {
		equalise(log, Direction.HORIZONTAL);
	}
	
	public static void lateral(Block log) {
		equalise(log, Direction.LATERAL);
	}
}
