package chapter_2;

import java.util.Scanner;

public class Q2_10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the amount of water in kilograms: ");
		double M = scan.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		double initialTemperature = scan.nextDouble();

		System.out.println("Enter the final temperature: ");
		double finalTemperature = scan.nextDouble();
		
		
		double energyNeeded = (M * (finalTemperature - initialTemperature) * 4184);
		
		System.out.println("The energy needed is " + energyNeeded);
	}

}
