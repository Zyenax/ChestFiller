package net.Blxd.main;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	public void onEnable(){
		registerListeners();
		ConsoleCommandSender console = Bukkit.getConsoleSender();
		console.sendMessage("ChestFiller aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
	}
	
	public void onDisable(){
		ConsoleCommandSender console = Bukkit.getConsoleSender();
		console.sendMessage("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
	}
	
	public void registerListeners(){
		PluginManager manager = Bukkit.getServer().getPluginManager();
		manager.registerEvents(new ChestHandler(this), this);
	}

}
