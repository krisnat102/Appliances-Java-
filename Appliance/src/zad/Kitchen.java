package zad;

import java.util.ArrayList;
import java.util.Scanner;

public class Kitchen {
	ArrayList<Appliance> appliances = new ArrayList<>();
	
	public void addAppl(Appliance appliance) {
		appliances.add(appliance);
	}
	
	public void viewAppl() {
		int applNumber = 1;
		for (Appliance appliance : appliances) {
			System.out.println("Appliance #" + applNumber);
			System.out.println("Appliance type: " + appliance.Type());
			System.out.println("Description: " + appliance.Desc());
			System.out.println(" - weight: " + appliance.weight);
			System.out.println(" - breadth: " + appliance.breadth);
	    	System.out.println(" - width: " + appliance.width);
	    	System.out.println(" - height: " + appliance.height);
	    
	    	applNumber++;
		}
	}
}