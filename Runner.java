package Garage;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car(4, "one engine", "white", "4doors", "deep bootspace");
		Van va = new Van(4, "one engine", "grey", "no spare", 3);
		Motorcycle m = new Motorcycle(2, "one engine", "black", 1, "Moped");
//		---------------------------------------------------------------------
		GaragE garagE = new GaragE();
		garagE.addVehicle(c);
		garagE.addVehicle(va);
		garagE.addVehicle(m);
		garagE.removeVehicle(c);
		garagE.emptyGarage(m);
		garagE.repairVehicle(va);
		
//		-----------------------------------------------------------------------
		GaragE.calculateMotorcycle(10000, 3000);
		GaragE.calculateCar(10000, 5000);
		GaragE.calculateVan(60000, 2000);
		GaragE.calculateVehicle();
//		-----------------------------------------------------------------------
		

}
}
