package net.mcplugin.throwitem;

import net.mcplugin.throwitem.command.Handler;

import org.bukkit.plugin.java.JavaPlugin;

public class ThrowItemMain extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getCommand("throw").setExecutor(new Handler(this));

	}

	@Override
	public void onDisable() {
		// TODO Insert logic to be performed when the plugin is disabled
	}

}
