package ua.lviv.iot.Attraction;


public class Karting extends Attraction{
	private int numberOfCars;
	private String name;
	private String typeOfCovering;
	
	public Karting() {
	}
	
	public Karting(double priceOfTicket, int maxNumberOfVisitors,DangerLevel dangerLevel,int numberOfCars,String name,String typeOfCovering) {
		super(priceOfTicket, maxNumberOfVisitors, dangerLevel);
		this.numberOfCars = numberOfCars;
		this.name = name;
		this.typeOfCovering = typeOfCovering;
	}

	public int getNumberOfCars() {
		return numberOfCars;
	}

	public void setNumberOfCars(int numberOfCars) {
		this.numberOfCars = numberOfCars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfCovering() {
		return typeOfCovering;
	
	}
	public void setTypeOfCovering(String typeOfCovering) {
		this.typeOfCovering = typeOfCovering;
	}

	@Override
	public String toString() {
		return super.toString() + "Karting [numberOfCars=" + numberOfCars + ", name=" + name + ", "
				+ "typeOfCovering=" + typeOfCovering + "]";
	}
	
}

