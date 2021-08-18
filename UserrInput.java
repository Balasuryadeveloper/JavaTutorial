package myproject;

import java.util.Scanner;

public class UserrInput {
	public static void main(String[] args) {
		//Input from Input
		//String Value
		System.out.println("Enter User Name : ");
		Scanner userName = new Scanner(System.in);
		String name = userName.nextLine();
		System.out.printf("Hii "+name);
		//Numerical Value
		System.out.println("\nEnter Your Age : ");
		Scanner age = new Scanner(System.in);
		int uage = age.nextInt();
		System.out.println("Your age is "+uage);
		//		Same as 
		//		float - nextFloat()
		//		double - nextDouble()
		//		long - nextLong()
		//		short - nextShort()
		//		byte - nextByte()
		//		boolean - nextBoolean()
	}
}
