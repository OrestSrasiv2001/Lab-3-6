package ua.lviv.iot.Attraction;

public class Disneyland extends Attraction {
	private double area;
	private double location;
	private double numberAttractions;
	
	

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public  Disneyland() {	
	}

	public Disneyland(double priceOfTicket, int maxNumberOfVisitors,DangerLevel dangerLevel,double area, double location, double numberAttractions ) {
		super(priceOfTicket,maxNumberOfVisitors, dangerLevel);
		this.area = area;
		this.location = location;
		this.numberAttractions = numberAttractions;
	}
	
	
	  void setLocation(double Location) {
		  location= Location;
	  }
	  
	  void setNumberAttractions(double NumberAttractions) {
		  numberAttractions= NumberAttractions;
	  }
	  
	public	double getLocation() {
			return location;
		}
		double getNumberAttractions() {
			return numberAttractions;
		}

		@Override
		public String toString() {
			return "Disneyland [area=" + area + ", location=" + location + ", numberAttractions=" + numberAttractions
					+ "]";
		}
}
