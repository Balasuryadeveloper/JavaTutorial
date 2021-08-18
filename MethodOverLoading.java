package myproject;

public class MethodOverLoading {
	static int plusMethod(int x , int y) {
		return x+y;
	}
	static double plusMethod(double x , double y) {
		return x+y;
	}
	public static void main(String[] args) {
		int myMeth1= plusMethod(5,6);
		double myMeth2= plusMethod(5.09,6.11);
		System.out.println(myMeth1);
		System.out.println(myMeth2);
	}
}
