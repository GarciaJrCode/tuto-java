package Tutos;
import java.util.Scanner;

public class tuto05a {
	public static void main(String[] args) {
		
		//keyboard reading
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose a type of vehicle (1 = car) | (2 = moto) | (3 = not identified): ");
		System.out.println();
		
		//Read user's choice
		int choiceUser = scanner.nextInt();
		if(choiceUser == 1) {
			
			System.out.println("You have chosen option 1 : car \n");
			
			//Retrieve car details
			tuto05f carInfo = new tuto05f();
			//Color of the car
			carInfo.getColorVehicle();
			//Year of the creation of the car
			carInfo.getYearCreationVehicle();
			//Name of the car
			carInfo.getNameVehicle();
			//Car capacity
			carInfo.getCapacityVehicle();

			//Call of the class intended for cars. this class is extended from the vehicle class
			tuto05c carVehicle = new tuto05c(carInfo.setColorVehicle(), carInfo.setYearCreationVehicle(), carInfo.setNameVehicle(), carInfo.setCapacityVehicle());
			//This method calls the showDescription method of the car class which itself calls the showDescription method of the vehicle class
			carVehicle.showDescription();
		}
		else if(choiceUser == 2) {
			
			System.out.println("You have chosen option  2 : Moto \n");
			
			//Call of the class intended for Motorcycles. this class is extended from the vehicle class
			tuto05f motoInfo = new tuto05f();
			//Color of the Moto
			motoInfo.getColorVehicle();
			//Year of the creation of the Moto
			motoInfo.getYearCreationVehicle();
			//Name of the Moto
			motoInfo.getNameVehicle();
			//Moto capacity
			motoInfo.getSpeedVehicle();

			//Call of the class intended for cars. this class is extended from the vehicle class
			tuto05d motoVehicle = new tuto05d(motoInfo.setColorVehicle(), motoInfo.setYearCreationVehicle(), motoInfo.setNameVehicle(), motoInfo.setSpeedVehicle());
			//This method calls the showDescription method of the car class which itself calls the showDescription method of the vehicle class
			motoVehicle.showDescription();
		}
		else {
			
			//Call of the class intended for random vehicles. this class is extended from the vehicle class
			tuto05e randomCar = new tuto05e();
			
			//This method calls the showDescription method of the car random vehicles
			randomCar.showDescription();
		}
		scanner.close();	
	}
}
