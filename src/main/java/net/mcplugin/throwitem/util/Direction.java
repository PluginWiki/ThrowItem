package net.mcplugin.throwitem.util;

import org.bukkit.Location;
import org.bukkit.util.Vector;

public class Direction {
	private float yaw;
	private float pitch;

	public Direction(float yaw, float pitch) {
		this.setYaw(yaw);
		this.setPitch(pitch);
	}

	// Get The Direction from the Vector.
	public Direction(Vector vec) {
		double x = vec.getX();
		double y = vec.getY();
		double z = vec.getZ();

		// Calculate the yaw
		yaw = (float) ((Math.atan2(z, x) / Math.PI * 180) - 90);
		if (yaw < 0)
			yaw = yaw + 360;

		// Calculate the pitch
		pitch = (float) -(Math.atan(y
				/ Math.sqrt(Math.pow(x, 2) + Math.pow(z, 2)))
				/ Math.PI * 180);

	}

	public Direction(Location loc) {
		this.yaw = loc.getYaw();
		this.pitch = loc.getPitch();
	}

	public float getYaw() {
		return yaw;
	}

	public void setYaw(float yaw) {
		this.yaw = yaw;
	}

	public float getPitch() {
		return pitch;
	}

	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	// TODO finish this method
	public void toVector(double distance) {

	}
}
