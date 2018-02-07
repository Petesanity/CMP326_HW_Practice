package hw2;
/*
 * Peter Farquharson
 * Which integer between 1 and 10000 has the largest number of divisors,
 * and how many divisors does it have?
 * Write a program to find the answers and print out the results. 
 * It is possible that several integers in this range have the same, maximum number of divisors.
 * Your program only has to print out one of them.
 */
public class Hw3_2 {
	
	public static void main(String [] args){
		
		int largest = 0;
		int max = 0;
		for(int i = 1; i<=10000; i++){ //loops through the given numbers
			
			int d = 0; //divisor
			int dcount = 0; //divisor count
			for(d = 1; d<=i; d++){ //checks for possible divisors
				if(i % d == 0){
					
					dcount++; //increment divisors
				
				}
			}
			if(dcount > max){
				max = dcount;
				largest = i;
			}
			
		}
		System.out.println("The number is " + largest + "the number of divisors are" + max );
		
		   
	}
}