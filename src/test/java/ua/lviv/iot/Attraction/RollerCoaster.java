package ua.lviv.iot.Attraction;

public class RollerCoaster extends Attraction {
	private int speed;
	private int height;
	private String typeOfMaterial;
	
	public RollerCoaster() {
	}
	public RollerCoaster(double priceOfTicket, int maxNumberOfVisitors, DangerLevel dangerLevel, int speed, int height, String typeOfMaterial) {
		super(priceOfTicket, maxNumberOfVisitors, dangerLevel);
		this.speed = speed;
		this.height = height;
		this.typeOfMaterial = typeOfMaterial;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getTypeOfMaterial() {
		return typeOfMaterial;
	}
	public void setTypeOfMaterial(String typeOfMaterial) {
		this.typeOfMaterial = typeOfMaterial;
	}
	@Override
	public String toString() {
		return "RollerCoaster [speed=" + speed + ", height=" + height + ", typeOfMaterial=" + typeOfMaterial + "]";
	}
	
}
