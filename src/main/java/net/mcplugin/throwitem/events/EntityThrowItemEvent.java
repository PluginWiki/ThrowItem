package net.mcplugin.throwitem.events;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class EntityThrowItemEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
	private boolean cancelled;

	private final Entity thrower;
	private final ItemStack item;
	private final float force;

	public EntityThrowItemEvent(Entity thrower, ItemStack item, float force) {
		this.thrower = thrower;
		this.item = item;
		this.force = force;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;

	}

	public Entity getThrower() {
		return thrower;
	}

	public ItemStack getItem() {
		return item;
	}

	public float getForce() {
		return force;
	}

}
