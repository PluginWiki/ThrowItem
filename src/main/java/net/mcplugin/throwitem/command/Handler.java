package net.mcplugin.throwitem.command;

import net.mcplugin.throwitem.ThrowItem;
import net.mcplugin.throwitem.ThrowItemMain;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Handler implements CommandExecutor {
	private final ThrowItemMain plugin;

	public Handler(ThrowItemMain plugin) {
		this.plugin = plugin; // Store the plugin in situations where you need
								// it.

	}

	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		// TODO finish the code when player type /throw
		if (sender instanceof Player) {
			Player player = (Player) sender;
			ItemStack item = player.getItemInHand();

			if (item.getType() != Material.AIR) {
				new ThrowItem(player, item);
				player.getInventory().remove(item);
			}

		} else {
			sender.sendMessage("You must be a player!");
			return false;
		}

		return false;
	}

}
