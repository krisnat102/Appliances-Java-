package zad;

public class WashingMachine extends Appliance {
	
	public WashingMachine ( double weight, double breadth, double width, double height) {
		super(weight, breadth, width, height);
	}
	
	public String Type() {
		return "Washing Machine ";
	}
	
	public String Desc() {
		double volume = breadth * width * height;
		return Type() + "weighs " + weight + " kg has volume of " + volume + " m^3, and cleans clothes";
	}
}