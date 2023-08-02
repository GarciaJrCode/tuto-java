package Tutos;

import java.util.ArrayList;
import java.util.Comparator; //To sort an array in ascending or descending order

public class tuto03 {
	
	public static void main(String[] args) {
		
		//AArray of arrays
		ArrayList<ArrayList<String>> arrayOfArray = new ArrayList<>();
		
		//First array: juice array
		ArrayList<String> arrayJuice = new ArrayList<>();
		arrayJuice.add("pepsi");
		arrayJuice.add("Coca");
		arrayJuice.add("Orangina");
		arrayJuice.add("Mojito");
		System.out.println("First Array");
		System.out.println(arrayJuice);
		System.out.println();
		
		//Second array: fruit array
		ArrayList<String> arrayFruit = new ArrayList<>();
		arrayFruit.add("apple");
		arrayFruit.add("banana");
		arrayFruit.add("orange");
		System.out.println("Second Array");
		System.out.println(arrayFruit);
		System.out.println();
		
		//Third array: meal array
		ArrayList<String> arrayMeal = new ArrayList<>();
		arrayMeal.add("salad");
		arrayMeal.add("chiken");
		System.out.println("Third Array");
		System.out.println(arrayMeal);
		System.out.println();
		
		//Array of arrays before adding values
		System.out.println("Array of arrays before adding values");
		System.out.println(arrayOfArray);
		System.out.println();
		
		//Adding values
		System.out.println("Adding values...");
		arrayOfArray.add(arrayJuice);
		arrayOfArray.add(arrayFruit);
		arrayOfArray.add(arrayMeal);
		System.out.println();
		
		//Array of arrays after adding values
		System.out.println("Array of arrays after adding values");
		System.out.println(arrayOfArray);
		System.out.println();
		
		//Display of the value located at index 1 of the array of arrays
		System.out.println("Display of the value located at index 1 of the array of arrays");
		//We can do the same process on valueOfIndexOne or on arrayFruit to have the value located at index 0, 1 or 2
		ArrayList<String> valueOfIndexOne = arrayOfArray.get(1);
		System.out.println(valueOfIndexOne); // 
		System.out.println();
		
		//Let's check if the array of arrays is empty
		System.out.print("Is the array of arrays empty ? : ");
		System.out.println(arrayOfArray.isEmpty() ? "Yes" : "No");
		System.out.println();
		
		//Let's check if the meal array contains "salad"
		System.out.print("does meal array contain 'salad' ? : ");
		System.out.println(arrayOfArray.get(2).contains("salad") ? "Yes" : "No");
		System.out.println();
		
		//Let's check if the fruit array contains "coca"
		System.out.print("does fruit array contain 'coca' ? : ");
		System.out.println(arrayOfArray.get(1).contains("coca") ? "Yes" : "No");
		System.out.println();
		
		//Let's sort the juice array in ascending order
		System.out.println("Let's sort the juice array in ascending order");
		arrayOfArray.get(0).sort(Comparator.naturalOrder());
		System.out.println(arrayOfArray.get(0));
		System.out.println();
		
		//Let's sort the juice array in descending order
		System.out.println("Let's sort the juice array in descending order");
		arrayOfArray.get(0).sort(Comparator.reverseOrder());
		System.out.println(arrayOfArray.get(0));
		System.out.println();
		
		System.out.println("we can thus use the methods .remove(/*Index of the element to remove*/), \n.valueOf(/*Index of the element to recover*/), .clear(/*Empty the entire array*/ ), \n.size(/*Retrieve the size of the array*/), \n.set(/*position of the element to modify*/, /*Value to put at the chosen position*/)");
		
		arrayOfArray.get(2).contains("salad");
		arrayOfArray.get(1).contains("coca");
		arrayOfArray.get(0).sort(Comparator.naturalOrder());
	}
}
