package ua.lviv.iot.Attraction;

import ua.lviv.iot.Attraction.Attraction;


public class Child extends Attraction {
	private int age;
	private double weight;
	private double height;

	public Child() {

	}

	public final int getAge() {
		return age;
	}

	public final void setAge(final int age) {
		this.age = age;
	}

	public final double getWeight() {
		return weight;
	}

	public final void setWeight(final double weight) {
		this.weight = weight;
	}

	public final double getHeight() {
		return height;
	}

	public final void setHeight(final double height) {
		this.height = height;
	}

	public Child(final double priceOfTicket, final int maxNumberOfVisitors, final DangerLevel dangerLevel,
			final int age, final double weight, final double height) {
		super(priceOfTicket, maxNumberOfVisitors, dangerLevel);
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}
