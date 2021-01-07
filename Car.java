package Garage;

public class Car extends Vehicle{
	private String doors;
	private String Bootspace;
	
//	Constructor
	public Car(int wheels, String engines, String colour, String doors, String bootspace) {
	super(wheels, engines, colour);
	this.doors = doors;
	Bootspace = bootspace;
}

// Getters and Setters
	public String getDoors() {
		return doors;
	}
	
	public void setDoors(String doors) {
		this.doors = doors;
	}


	public String getBootspace() {
		return Bootspace;
	}


	public void setBootspace(String bootspace) {
		Bootspace = bootspace;
	}
	
	
	
	
}
	
	
	
