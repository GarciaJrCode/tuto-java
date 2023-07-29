package Tutos;

public class tuto01 {
	
	public static void main(String [] args) {
		
		//The values of these variables were assigned randomly. Other values could very well have been assigned
		byte byteNumber = 1;
		short shortNumber = 1;
		int intNumber = 1;
		long longNumber = 1;
		float floatNumber = 1;
		double doubleNumber = 1;
		char charLetter = '1';
		boolean booleanTest = true;
		String stringLetter = "1";
		
		//Display of the types of the different variables
		System.out.println(((Object)byteNumber).getClass().getName().substring(10));
		System.out.println(((Object)shortNumber).getClass().getName().substring(10));
		System.out.println(((Object)intNumber).getClass().getName().substring(10));
		System.out.println(((Object)longNumber).getClass().getName().substring(10));
		System.out.println(((Object)floatNumber).getClass().getName().substring(10));
		System.out.println(((Object)doubleNumber).getClass().getName().substring(10));
		System.out.println(((Object)charLetter).getClass().getName().substring(10));
		System.out.println(((Object)booleanTest).getClass().getName().substring(10));
		System.out.println(stringLetter.getClass().getName().substring(10));
		
	}
}
