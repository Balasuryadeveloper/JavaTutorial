package myproject;

public class ClassMethods {
	static void myStaticMethod() {
		System.out.println("This is my static Method");
	}
	public void myPublicMethod() {
		System.out.println("This is my Public Method");
	}
	public static void main(String[] args) {
		//calling static method
		myStaticMethod();
		//calling public method
		ClassMethods myobj = new ClassMethods();
		myobj.myPublicMethod();
	}
}
