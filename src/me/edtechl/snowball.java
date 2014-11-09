package me.edtechl;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class snowball implements CommandExecutor {
	
	private main plugin;
	public snowball(main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("snowball")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				player.throwSnowball();
				player.sendMessage(ChatColor.BLUE + "You threw a snowball!");
				return true;
			} else {
				sender.sendMessage("Must be a player!");
			}
		}
		return false;
	}

}