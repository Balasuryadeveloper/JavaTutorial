package myproject;

import java.util.Scanner;

public class MethodParameter {
	static void Vote(int uDob , String uName) {
		if(uDob <=2003) {
			System.out.println(uName+" You are eligible to vote...");
		}
		else {
			System.out.println(uName+" You are wait "+(2021-uDob)+". Because you are in child catogery");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter Your Name");
		Scanner uname = new Scanner(System.in);
		String uName = uname.nextLine();
		System.out.println("Enter Your birth of year");
		Scanner udob = new Scanner(System.in);
		int uDob = uname.nextInt();
		Vote(uDob , uName);
	}
}
