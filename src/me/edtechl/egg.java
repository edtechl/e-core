package me.edtechl;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class egg implements CommandExecutor {
	
	private main plugin;
	public egg(main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("egg")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				player.throwEgg();
				player.sendMessage(ChatColor.WHITE + "You threw an egg!");
				return true;
			} else {
				sender.sendMessage("Must be a player!");
			}
		}
		return false;
	}

}