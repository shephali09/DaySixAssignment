package com.bridgelabz.logicalprograms;

/*Given N distinct Coupon Numbers, how many random numbers do you need to generate a distinct 
 * coupon number? This program simulates this random process.*/

public class CuponNumber {

	public static void main(String[] args) {

		// initialize the character array.
		char[] couponArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max = 100000000;
		// generate random numbers
		int random = (int) (Math.random() * max);

		// declare buffer class
		StringBuffer sb = new StringBuffer();

		// generate coupon number
		while (random > 0) {
			sb.append(couponArray[random % couponArray.length]);
			random /= couponArray.length;
		}

		// print the coupon number
		String couponCode = sb.toString();
		System.out.println("Coupon Code: " + couponCode);
	}

}
