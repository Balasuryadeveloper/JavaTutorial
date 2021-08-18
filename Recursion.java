package myproject;

import java.util.Scanner;

public class Recursion {
	public static void main(String[] args) {
		System.out.println("Please Enter any number : ");
		Scanner getNumber = new Scanner(System.in);
		int num = getNumber.nextInt();
		int mysum = sum(num);
		System.out.println("Sum of "+num+" is "+mysum);
	}

	private static int sum(int k) {
		if(k > 0) {
			return k+sum(k-1);
		}
		return 0;
	}
}
