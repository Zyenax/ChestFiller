package net.Blxd.main;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ChestHandler implements Listener {
	@SuppressWarnings("unused")
	private Main plugin;

	public ChestHandler(Main hub) {
		this.plugin = hub;
		fillChests(Bukkit.getServer().getWorld("world"));
	}

	public void fillChests(World world){
		for(Chunk chunk : world.getLoadedChunks()){
			for(BlockState entity : chunk.getTileEntities()){
				if(entity.getLocation().getBlock().getState() instanceof Chest){
						Chest chest = (Chest) entity;
						chest.getBlockInventory().addItem(createItem(Material.DIAMOND_AXE, 1, 0, "AXE 1", null));
				}
			}
		}
	}
	
	public static ItemStack createItem(Material material, int amount ,int dataValue, String name,
			List<String> list) {
		ItemStack selector = new ItemStack(material, amount, (short) dataValue);
		ItemMeta selectorMeta = selector.getItemMeta();
		selectorMeta.setDisplayName(name);
		if (list != null)
			selectorMeta.setLore(list);
		selector.setItemMeta(selectorMeta);
		return selector;
	}

}
