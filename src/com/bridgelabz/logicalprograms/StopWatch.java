package com.bridgelabz.logicalprograms;
/* Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks. Print the elapsed time.*/

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {

		long startTime;
		long endTime;
		double isRunning;
		
		//get input from user for start time of stop watch
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press any key for start the stop watch");
		char start = scanner.next().charAt(0);
		
		////get input from user for start time of stop watch
		startTime = System.currentTimeMillis();
		System.out.println("Press any key for stop the stop watch");
		char end = scanner.next().charAt(0);
		endTime = System.currentTimeMillis();
		
		//calculate the elapsed time
		isRunning = (endTime - startTime) / 1000.0 ;
		
		//print the elapsed time
		System.out.println("Elapsed time: " + isRunning);

	}

}
