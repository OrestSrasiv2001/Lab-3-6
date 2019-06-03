package ua.lviv.iot.Attraction;
import ua.lviv.iot.Attraction.DangerLevel;

public class Attraction {	
	private double priceOfTicket;
	private int maxNumberOfVisitors;
	private  DangerLevel dangerLevel;
	
	
	public Attraction(double priceOfTicket, int maxNumberOfVisitors, DangerLevel dangerLevel) {
		this.priceOfTicket = priceOfTicket;
		this.maxNumberOfVisitors = maxNumberOfVisitors;
		this.dangerLevel =  dangerLevel;
	}
	
	public Attraction() {
	}
	
	public double getPriceOfTicket() {
		return priceOfTicket;
	}
	
	public void setPriceOfTicket(double priceOfTicket) {
		this.priceOfTicket = priceOfTicket;
	}
	
	public int getMaxNumberOfVisitors() {
		return maxNumberOfVisitors;
	}
	
	public void setMaxNumberOfVisitors(int maxNumberOfVisitors) {
		this.maxNumberOfVisitors = maxNumberOfVisitors;
	}
	
	public DangerLevel getDangerLevel() {
		return dangerLevel;
	}
	
	public void setDangerLevel(DangerLevel dangerLevel) {
		this.dangerLevel = dangerLevel;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Attraction [priceOfTicket=" + priceOfTicket + ", maxNumberOfVisitors=" + maxNumberOfVisitors
				+ ", dangerlevel=" + dangerLevel + "]";
	}
}
