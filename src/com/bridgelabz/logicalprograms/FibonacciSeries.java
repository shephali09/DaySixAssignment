package com.bridgelabz.logicalprograms;

/*write a java program to 
 * find a Fibonacci series */

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int i,number;
		
		//initialize first and second term
		int termOne=0,termTwo=1;
		
		//initialize the next term
		int nextTerm =  termOne + termTwo;
		
		//get number of terms from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of terms: ");
		number = scanner.nextInt();
		
		//print first two terms
		System.out.print("Fibonacci series: " + termOne+","+termTwo);
		
		//print 3rdto nth terms
		for(i=2;i<number;i++) {
			System.out.print(" ,"+nextTerm);
			termOne = termTwo;
			termTwo = nextTerm;
			nextTerm = termOne + termTwo; 
		}
	}

}
