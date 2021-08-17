package myproject;

public class Strings {
	public static void main(String[] args) {
		//Strings
		String txt = "Hellow Welcome To Our Home";
		System.out.println(txt);
		//Find length
		System.out.println(txt.length());
		//UpperCase
		System.out.println(txt.toUpperCase());
		//LowerCase
		System.out.println(txt.toLowerCase());
		//Finding a character
		System.out.println(txt.indexOf("Our"));
		//Concatenation
		String txt1 = "Surya";
		System.out.println(txt+" "+txt1);
		//Special Characters
		String sChar = "I Love \"India\"";
		System.out.println(sChar);
		String sChar1 = "It\'s good";
		System.out.println(sChar1);
		String sChar2 = "I Love\nIndia";
		System.out.println(sChar2);
		String sChar3 = "I Love\tIndia";
		System.out.println(sChar3);
	}
}
