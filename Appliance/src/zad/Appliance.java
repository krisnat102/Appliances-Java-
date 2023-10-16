package zad;

public abstract class Appliance {
	double weight;
	double breadth;
	double width;
	double height;
	
    public Appliance(double weight, double breadth, double width, double height) {
    	this.weight = weight;
	    this.breadth = breadth;
	    this.width = width;
	    this.height = height;
	}
	public abstract String Type();
	public abstract String Desc();
}
