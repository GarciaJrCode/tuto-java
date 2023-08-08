package Tutos;

//Class of all vehicles (tuto05b)
//Class defining the basic data of a random vehicle.
public class tuto05b {
	
	//Empty constructor needed for unknown vehicle class (tuto05e)
	public tuto05b() {
		
	}
	
	//Constructor
	public tuto05b(String color, int year){
		
		this.colorOfVehicle = color;
		this.yearOfCreation = year;
	}
	
	//Viewing vehicle information
	void showDescription() {
		System.out.println("This " + colorOfVehicle + " vehicle was made in " + yearOfCreation);
	}
	
	private String colorOfVehicle;
	private int yearOfCreation;

}
