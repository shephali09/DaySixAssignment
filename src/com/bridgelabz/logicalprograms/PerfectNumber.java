package com.bridgelabz.logicalprograms;

/*write a java program to 
 * check whether number is perfect or not.*/

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		//get a number from user
		int i,number,sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		number = scanner.nextInt();
		
		//find divisors for the number
		for(i=1;i<number;i++) {
			if(number % i == 0) {
				sum = sum + i;
				
			}
		}
		
		//check whether number is perfect or not
		if(sum == number) {
			System.out.println(number + " is perfect number");
		}else {
			System.out.println(number + " is not perfect number");
		}
	}

}
