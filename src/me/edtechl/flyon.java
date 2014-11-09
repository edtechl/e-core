package me.edtechl;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class flyon implements CommandExecutor {
	
	private main plugin;
	public flyon(main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("flyon")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				player.setAllowFlight(true);
				player.sendMessage(ChatColor.AQUA + "Fly mode activated!");
				return true;
			} else {
				sender.sendMessage("Must be a player!");
			}
		}
		return false;
	}

}