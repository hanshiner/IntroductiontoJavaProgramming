package chapter_4;

import java.util.Scanner;

public class Q4_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int numberOfSides;
		
		double side,area;
		
		System.out.println("Enter the number of sides:");
		numberOfSides =scan.nextInt();	
		
		System.out.println("Enter the side:");
		side = scan.nextDouble();
		
		area = (numberOfSides*Math.pow(side, 2))/(4 * Math.tan(Math.PI/numberOfSides));
		
		System.out.println("The area of the polygon is " + area);
		
		
	}

}
