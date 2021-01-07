package Garage;

public class Van extends Vehicle{
	private String Sparetyre;
	private int windows;
	
//	Constructor
	public Van(int wheels, String engines, String colour, String sparetyre, int windows) {
		super(wheels, engines, colour);
		Sparetyre = sparetyre;
		this.windows = windows;
	}

	
// Getters and Setters
	public String getSparetyre() {
		return Sparetyre;
	}

	public void setSparetyre(String sparetyre) {
		Sparetyre = sparetyre;
	}


	public int getWindows() {
		return windows;
	}


	public void setWindows(int windows) {
		this.windows = windows;
	}
	
	
	
	
		
}
