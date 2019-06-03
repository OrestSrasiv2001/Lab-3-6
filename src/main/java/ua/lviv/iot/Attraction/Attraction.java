package main.java.ua.lviv.iot.Attraction;

import main.java.ua.lviv.iot.Attraction.DangerLevel;

public class Attraction {
	private double priceOfTicket;
	private int maxNumberOfVisitors;
	private DangerLevel dangerLevel;

	public Attraction(final double priceOfTicket, final int maxNumberOfVisitors, final DangerLevel dangerLevel) {
		this.priceOfTicket = priceOfTicket;
		this.maxNumberOfVisitors = maxNumberOfVisitors;
		this.dangerLevel = dangerLevel;
	}

	public Attraction() {
	}

	public final double getPriceOfTicket() {
		return priceOfTicket;
	}

	public final void setPriceOfTicket(final double priceOfTicket) {
		this.priceOfTicket = priceOfTicket;
	}

	public final int getMaxNumberOfVisitors() {
		return maxNumberOfVisitors;
	}

	public final void setMaxNumberOfVisitors(final int maxNumberOfVisitors) {
		this.maxNumberOfVisitors = maxNumberOfVisitors;
	}

	public final DangerLevel getDangerLevel() {
		return dangerLevel;
	}

	public final void setDangerLevel(final DangerLevel dangerLevel) {
		this.dangerLevel = dangerLevel;
	}

	@Override
	public final String toString() {
		return super.toString() + "Attraction [priceOfTicket=" + priceOfTicket + ", maxNumberOfVisitors="
				+ maxNumberOfVisitors + ", dangerlevel=" + dangerLevel + "]";
	}
}
