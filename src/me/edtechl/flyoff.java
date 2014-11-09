package me.edtechl;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class flyoff implements CommandExecutor {
	
	private main plugin;
	public flyoff(main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("flyoff")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				player.setAllowFlight(false);
				player.sendMessage(ChatColor.AQUA + "Fly mode deactivated!");
				return true;
			} else {
				sender.sendMessage("Must be a player!");
			}
		}
		return false;
	}

}