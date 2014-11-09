package me.edtechl;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	private heal heal;
	private feed feed;
	private egg egg;
	private snowball snowball;
	private arrow arrow;
	private enderchest enderchest;
	private flyon flyon;
	private flyoff flyoff;
	
	@Override
	public void onEnable() {
		getLogger().info("e-core enabled!");
		getCommand("heal").setExecutor(heal);
		getCommand("feed").setExecutor(feed);
		getCommand("egg").setExecutor(egg);
		getCommand("snowball").setExecutor(snowball);
		getCommand("arrow").setExecutor(arrow);
		getCommand("enderchest").setExecutor(enderchest);
		getCommand("flyon").setExecutor(flyon);
		getCommand("flyoff").setExecutor(flyoff);
	}
	
	@Override
	public void onDisable() {
		getLogger().info("e-core disabled!");
	}
}
