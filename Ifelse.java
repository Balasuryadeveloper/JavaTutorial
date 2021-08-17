package myproject;

public class Ifelse {
	public static void main(String[] args) {
		//If condition
		/*	Syntax
		 * 	if(condition){
		 *    Statements
		 *  }
		 */
		int a = 12;
		int b = 13;
		if(a < b) {
			System.out.println("b is greater than a");
		}
		//If else condition
		/*	Syntax
		 *  if(Condition){
		 *  	statements
		 *  }
		 *  else{
		 *  	statements
		 *  }
		 */
		if(a > b) {
			System.out.println("a is bigger than b");
		}
		else {
			System.out.println("b is bigger than a");
		}
		//Else if condition
		/*
		 * Syntax
		 * if(condition){
		 * 	statements
		 * }else if(condition){
		 * 	statements
		 * }else{
		 * 	statements
		 * }
		 */
		 int c = 15;
		 
		 if(a > b && a > c) {
			 System.out.println("a is bigger value");
		 }
		 else if(b > a && b > c) {
			 System.out.println("b is bigger value");
		 }else {
			 System.out.println("c is bigger value");
		 }
		}
	}

