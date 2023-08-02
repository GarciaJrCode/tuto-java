package Tutos;

public class tuto04b {
	
	public static void main(String[] args) {
		
		//Array of objects
		System.out.println("Creation of the array of objects...");
		tuto04a arrayObject[] = new tuto04a[2];
		System.out.println();
		
		//Creation of two objects that we will put in the array of objects
		System.out.println("Creation of the first and the second objects...");
		tuto04a personne1 = new tuto04a("René", 25);
		tuto04a personne2 = new tuto04a("Garcia", 26);
		System.out.println();
		
		//Filling the array of objects
		arrayObject[0] = personne1;
		arrayObject[1] = personne2;
		
		//Display of different objects
		System.out.println("Display of object content : ");
		System.out.println();
		for(int i = 0; i < arrayObject.length; i++) {
			System.out.println("Object " + i + " : ");
			arrayObject[i].affichage();
			System.out.println();
		}
	}

}
