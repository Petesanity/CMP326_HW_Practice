package hw2;
import java.util.Scanner;
/*
 * Peter Farquharson
 * Intro to Switch Statements
 * Write a program that will evaluate simple expressions such as 17 + 3 and 3.14159 * 4.7. 
 * The expressions are to be typed in by the user. 
 * The input always consists of a number, followed by an operator, followed by another number. 
 * The operators that are allowed are +, -, *, and /.
 *Your program should read an expression, print its value, read another expression, print its value, and so on. 
 * The program should end when the user enters 0 as the first number on the line.
 */

public class Hw3_3 {
	
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		
		double num1 = 1, num2 = 0;
		char operator;
		while(num1!=0){
			
			System.out.println("Enter first number : ");
			num1= s.nextDouble();
			System.out.println("Enter operator :");
			operator = s.next().charAt(0);
			System.out.println("Enter second number:");
			num2 = s.nextDouble();
			switch(operator){
			case'+' : 
				System.out.println(num1 + num2);
				break;
			case '-' :
				System.out.println(num1 - num2);
				break;
			case'*' :
				System.out.println(num1 * num2);
				break;
			case '/' : 
				System.out.println(num1 / num2);
				break;
			}
		}
		s.close();
	}

}
