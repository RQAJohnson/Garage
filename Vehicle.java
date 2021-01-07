package Garage;

public class Vehicle {
	private int wheels;
	private String engines;
	private String colour;
	
//	Constructor
	public Vehicle(int wheels, String engines, String colour) {
		super();
		this.wheels = wheels;
		this.engines = engines;
		this.colour = colour;
	}

// Getters and Setters
	public int getWheels() {
		return wheels;
	}


	public void setWheels(int wheels) {
		this.wheels = wheels;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	@Override
	public String toString() {
		return "Vehicle [wheels=" + wheels + ", engines=" + engines + ", colour=" + colour + "]";
	}

	public void fix() {
		// TODO Auto-generated method stub
		
	}
		
	
	
	}
	

	
	

	
	
	
	
	
	
	
	

