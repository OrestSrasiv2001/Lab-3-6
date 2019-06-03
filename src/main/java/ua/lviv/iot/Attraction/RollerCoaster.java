package main.java.ua.lviv.iot.Attraction;

public class RollerCoaster extends Attraction {
	private int speed;
	private int height;
	private String typeOfMaterial;

	public RollerCoaster() {
	}

	public RollerCoaster(final double priceOfTicket, final int maxNumberOfVisitors, final DangerLevel dangerLevel,
			final int speed, final int height, final String typeOfMaterial) {
		super(priceOfTicket, maxNumberOfVisitors, dangerLevel);
		this.speed = speed;
		this.height = height;
		this.typeOfMaterial = typeOfMaterial;
	}

	public final int getSpeed() {
		return speed;
	}

	public final void setSpeed(final int speed) {
		this.speed = speed;
	}

	public final int getHeight() {
		return height;
	}

	public final void setHeight(final int height) {
		this.height = height;
	}

	public String getTypeOfMaterial() {
		return typeOfMaterial;
	}

	public final void setTypeOfMaterial(final String typeOfMaterial) {
		this.typeOfMaterial = typeOfMaterial;
	}

}
