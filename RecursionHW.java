/*
 * Use the recursion examples from class to solve the following problems
 * Get the sum of numbers between 2 numbers including those numbers (int a, int b) 
 * Calculate Fibonacci
 */

public class RecursionHW {
	
	public static int sumOfNumsWithInRange(int a, int b){
		if(b<a){
			return 0;
		}
		else{
			return a + sumOfNumsWithInRange(a+1,  b);
		}
	}
	public static int Fibonacci(int a){
		if(a == 0 || a==1){
			return 1;
		}
		else{
			return Fibonacci(a-1) + Fibonacci(a-2);
		}
	}
	public static void main(String [] args){
		System.out.println(sumOfNumsWithInRange(2,5));
		System.out.println(Fibonacci(18));
	}

}
