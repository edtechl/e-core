package me.edtechl;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class arrow implements CommandExecutor {
	
	private main plugin;
	public arrow(main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("arrow")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				player.shootArrow();
				player.sendMessage(ChatColor.GREEN + "You shot an arrow!");
				return true;
			} else {
				sender.sendMessage("Must be a player!");
			}
		}
		return false;
	}

}