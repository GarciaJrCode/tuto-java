package Tutos;

//car class (tuto05c)
public class tuto05c extends tuto05b{
	
	//Constructor
	public tuto05c(String color, int year, String models, int capacities){
		
		//Using all vehicles class constructor (tuto05b)
		super(color, year);
		
		this.modelOfCar = models;
		this.capacityOfCar = capacities;
	}
	
	//Viewing vehicle information
	void showDescription() {
		
		//Using all vehicles class showDescription method (tuto05b)
		super.showDescription();
		System.out.println("This " + modelOfCar + " is a car and can contain " + capacityOfCar + " persons");
	}
	
	private String modelOfCar;
	private int capacityOfCar;
}
