package Tutos;

public class tuto04a {
	
	private String name;
	private int age;
	
	tuto04a(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void affichage() {
		System.out.print("Your name : ");
		System.out.println(this.name);
		System.out.print("Your Age : ");
		System.out.println(this.age);
	}

}
