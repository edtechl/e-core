package me.edtechl;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {
	
	private main plugin;
	public heal(main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("heal")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "You have been healed!");
				return true;
			} else {
				sender.sendMessage("Must be a player!");
			}
		}
		return false;
	}

}
