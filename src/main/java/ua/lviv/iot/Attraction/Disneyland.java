package main.java.ua.lviv.iot.Attraction;

public class Disneyland extends Attraction {
	private double area;
	private double location;
	private double numberAttractions;

	public final double getArea() {
		return area;
	}

	public final void setArea(final double area) {
		this.area = area;
	}

	public Disneyland() {
	}

	public Disneyland(final double priceOfTicket, final int maxNumberOfVisitors, final DangerLevel dangerLevel,
			final double area, final double location, final double numberAttractions) {
		super(priceOfTicket, maxNumberOfVisitors, dangerLevel);
		this.area = area;
		this.location = location;
		this.numberAttractions = numberAttractions;
	}

	public final void setLocation(final double Location) {
		location = Location;
	}

	public final void setNumberAttractions(final double NumberAttractions) {
		numberAttractions = NumberAttractions;
	}

	public double getLocation() {
		return location;
	}

	double getNumberAttractions() {
		return numberAttractions;
	}
}
