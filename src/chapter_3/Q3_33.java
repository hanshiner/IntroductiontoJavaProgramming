package chapter_3;

import java.util.Scanner;

public class Q3_33 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	double weight1,price1,weight2,price2;
	
	System.out.println("Enter weight and price for package 1: ");
	weight1 =scan.nextDouble();
	price1=scan.nextDouble();
	
	System.out.println("Enter weight and price for package 2: ");
	weight2 =scan.nextDouble();
	price2=scan.nextDouble();
	
	if(price1/weight1 > price2/weight2)	
	System.out.println("Package "+ 2 + " has a better price.");
	else if (price1/weight1 == price2/weight2)
		System.out.println("Package "+ 1 +" and " +2 + " has the same price.");
	else
			System.out.println("Package " + 1 + " has a better price.");

	}
}
