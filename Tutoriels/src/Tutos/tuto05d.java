package Tutos;

//Motorcycle class (tuto05c)
public class tuto05d extends tuto05b {
	
	//Constructor
	public tuto05d(String color, int year, String models, int speed){
		
		//Using all vehicles class constructor (tuto05b)
		super(color, year);
		
		this.modelOfMoto = models;
		this.speedOfMoto = speed;
	}
	
	//Viewing vehicle information
	void showDescription() {
		
		//Using all vehicles class showDescription method (tuto05b)
		super.showDescription();
		System.out.println("This " + modelOfMoto + " is a Motorcycle and can run at " + speedOfMoto + " km/h");
	}
	
	private String modelOfMoto;
	private int speedOfMoto;

}
