package zad;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Kitchen kitchen = new Kitchen();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many appliances: ");
		int applianceNumber = sc.nextInt();
		
		for (int i = 0; i< applianceNumber; i++) {
			System.out.println("Appliance # " + i + 1);
			System.out.println("Appliance type (1: dishwasher,2: refrigerator,3:washing machine): ");
			int applType = sc.nextInt();
			
			System.out.print(" - weight: ");
            double weight = sc.nextDouble();
            System.out.print(" - breadth: ");
            double breadth = sc.nextDouble();
            System.out.print(" - width: ");
            double width = sc.nextDouble();
            System.out.print(" - height: ");
            double height = sc.nextDouble();
            
            Appliance appliance = null;
            if (applType == 1) {
            	appliance =  new Dishwasher(weight, breadth, width, height);
            }
            else if (applType == 2) {
            	appliance =  new Refrigirator(weight, breadth, width, height);
            }
            else if (applType == 3) {
            	appliance =  new WashingMachine(weight, breadth, width, height);
            }
            else {
            	System.out.println("error");
            }
            
            kitchen.addAppl(appliance);

		}
		
		kitchen.viewAppl();

	}
}