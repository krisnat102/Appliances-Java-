package zad;

public class Refrigirator extends Appliance {
	
	public Refrigirator( double weight, double breadth, double width, double height) {
		super(weight, breadth, width, height);
	}
	
	public String Type() {
		return "Refrigirator";
	}
	
	public String Desc() {
		double volume = breadth * width * height;
		return Type() + "weighs " + weight + " kg has volume of " + volume + " m^3, and keeps food cool";
	}
}