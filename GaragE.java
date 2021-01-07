package Garage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaragE {
	
	static List<Vehicle> myList = new ArrayList<>();
	
	public void addVehicle(Vehicle v) {
		myList.add(v);
	}
	public void removeVehicle(Vehicle v) {
		myList.remove(v);
	}
	
	public void repairVehicle(Vehicle v) {
		((Vehicle) myList).fix();
	}
	
	public void emptyGarage(Vehicle v) {
		myList.clear();
	}
	
//	---------------------------------------------------------
	public static void calculateCar(int a, int b) {
		if (a+b<=30000) {
			System.out.println("The Total for Your Car is: " + (a+b));
		}else {
			System.out.println("No Car Available!");
		
		}
		
		}
//	----------------------------------------------------------
	public static void calculateVan(int a, int b) {
		if (a+b<=60000) {
			System.out.println("The Total for Your Van is: " + (a+b));
		}else {
			System.out.println("No Van Available!");
		
		}
	}
//	-----------------------------------------------------------
	public static void calculateMotorcycle(int a, int b) {
		if (a+b<=20000) {
			System.out.println("The Total for Your Motorcycle is: " + (a+b));
		}else {
			System.out.println("No Motorcycle Available!");
		}
	
	}
//	------------------------------------------------------------
	public static void calculateVehicle() {	
//		Enhanced For Loop
		for(Vehicle v: myList) {
		if (v.getWheels() == 4) {
			System.out.println(v.getWheels() + 60);
		}else {
			System.out.println(v.getWheels());
		}
		}
		
	}
//	---------------------------------------------------------------
	}


