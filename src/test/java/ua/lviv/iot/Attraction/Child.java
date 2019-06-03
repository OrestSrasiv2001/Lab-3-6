package ua.lviv.iot.Attraction;

public class Child extends Attraction{
	private int age;
	private double weight;
	private double height;
	
	public Child() {
		
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Child(double priceOfTicket, int maxNumberOfVisitors, DangerLevel dangerLevel, int age, double weight, double height) {
		super(priceOfTicket, maxNumberOfVisitors, dangerLevel);
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return super.toString() + "Child [age=" + age + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
	
	

}
