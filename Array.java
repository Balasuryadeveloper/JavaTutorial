package myproject;

public class Array {
	public static void main(String[] args) {
		//Array
		String[] cars = {"Volvo","BMW","Ford"};
		int[] myNumbers = {1,5,10,18};
		//Accessing elements
		System.out.println(cars[0]);
		System.out.println(myNumbers[2]);
		//finds an array length
		System.out.println(cars.length);
		//Loop through in an array
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
	}
}
