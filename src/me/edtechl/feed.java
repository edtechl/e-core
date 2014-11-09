package me.edtechl;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class feed implements CommandExecutor {
	
	private main plugin;
	public feed(main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("feed")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				player.setFoodLevel(20);
				player.sendMessage(ChatColor.YELLOW + "You have been fed!");
				return true;
			} else {
				sender.sendMessage("Must be a player!");
			}
		}
		return false;
	}

}