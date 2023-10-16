package zad;

public class Dishwasher extends Appliance  {
	
	public Dishwasher( double weight, double breadth, double width, double height) {
		super(weight, breadth, width, height);
	}
	
	public String Type() {
		return "Dishwasher";
	}
	
	public String Desc() {
		double volume = breadth * width * height;
		return Type() + " weighs " + weight + " kg has volume of " + volume + " m^3, and and washes dishes";
	}
}
