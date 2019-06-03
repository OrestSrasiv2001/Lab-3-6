package main.java.ua.lviv.iot.Attraction;

public class Karting extends Attraction {
	private int numberOfCars;
	private String name;
	private String typeOfCovering;

	public Karting() {
	}

	public Karting(final double priceOfTicket, final int maxNumberOfVisitors, DangerLevel dangerLevel,
			final int numberOfCars, final String name, final String typeOfCovering) {
		super(priceOfTicket, maxNumberOfVisitors, dangerLevel);
		this.numberOfCars = numberOfCars;
		this.name = name;
		this.typeOfCovering = typeOfCovering;
	}

	public final int getNumberOfCars() {
		return numberOfCars;
	}

	public final void setNumberOfCars(final int numberOfCars) {
		this.numberOfCars = numberOfCars;
	}

	public String getName() {
		return name;
	}

	public final void setName(final String name) {
		this.name = name;
	}

	public String getTypeOfCovering() {
		return typeOfCovering;

	}

	public final void setTypeOfCovering(final String typeOfCovering) {
		this.typeOfCovering = typeOfCovering;
	}
}
