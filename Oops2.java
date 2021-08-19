package myproject;

public class Oops2 {
	int x = 12;
	int y = 20;
	public static void main(String[] args) {
		Oops2 myObj1 = new Oops2();
		Oops2 myObj2 = new Oops2();
		myObj1.x = 20;
		myObj2.y = 12;
		System.out.println(myObj1.x);
		System.out.println(myObj2.y);
	}
}
