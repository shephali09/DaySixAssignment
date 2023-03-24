package com.bridgelabz.logicalprograms;

/*Java program to check whether 
 * number is prime or not*/

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int i,number,flag = 0;
		
		//get number from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		number = scanner.nextInt();
		
		//change the flag to 1 for o and 1 numbers, because they are non-prime numbers
		if(number ==0 || number == 1) {
			flag = 1;
		}
		
		for(i=2;i<number;i++) {
			if(number % i == 0) {
				flag = 1;
			}
		}
		if(flag == 0) {
			System.out.println(number+" is prime number");
		}else {
			System.out.println(number+" is not prime number");
		}

	}

}
