package myproject;

public class JavaMethods {
	public static void main(String[] args) {
		myMethod();
		mysecMethod();
	}
	static void myMethod() {
		System.out.println("This is my first method");
	}
	static void mysecMethod() {
		myMethod();
		System.out.println("This is my second method");
	}
}
