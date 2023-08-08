package Tutos;

import java.util.Scanner;

public class tuto05f {
	
	Scanner scanner = new Scanner(System.in);
	
	void getColorVehicle() {
		//Color of the vehicle
		System.out.println("Enter vehicle color : ");
		this.colorVehicle = scanner.nextLine();
		//Clear buffer
		//scanner.nextLine();
	}
	
	void getYearCreationVehicle() {
		//Year of the creation of the vehicle
		System.out.println("Enter the creation date of the vehicle : ");
		this.yearCreationVehicle = scanner.nextInt();
		//Clear buffer
		scanner.nextLine();
	}
	
	void getNameVehicle() {
		//Name of the vehicle
		System.out.println("Enter vehicle name: ");
		this.nameVehicle = scanner.nextLine();
		//Clear buffer
		//scanner.nextLine();
	}
	
	void getCapacityVehicle() {
		//Vehicle capacity
		System.out.println("Enter the Vehicle capacity : ");
		this.capacityVehicle = scanner.nextInt();
		//Clear buffer
		scanner.nextLine();
	}
	
	void getSpeedVehicle() {
		//Vehicle speed
		System.out.println("Enter the Vehicle speed : ");
		this.speedVehicle = scanner.nextInt();
		//Clear buffer
		scanner.nextLine();
	}
	
	String setColorVehicle() {
		return this.colorVehicle;
	}
	
	int setYearCreationVehicle() {
		return this.yearCreationVehicle;
	}
	
	String setNameVehicle() {
		return this.nameVehicle;
	}
	
	int setCapacityVehicle() {
		return this.capacityVehicle;
	}
	
	int setSpeedVehicle() {
		return this.speedVehicle;
	}
	
	private String colorVehicle;
	private int yearCreationVehicle;
	private String nameVehicle;
	private int capacityVehicle;
	private int speedVehicle;
}
