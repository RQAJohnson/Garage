package Garage;

public class Motorcycle extends Vehicle {
	private int helmet;
	private String type;
	
//	Constructors
	public Motorcycle(int wheels, String engines, String colour, int helmet, String type) {
		super(wheels, engines, colour);
		this.helmet = helmet;
		this.type = type;
	}
	
//	Getters and Setters 
	public int getHelmet() {
		return helmet;
	}

	public void setHelmet(int helmet) {
		this.helmet = helmet;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	
	

	
	
	
	
}
