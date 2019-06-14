package chapter_4;

import java.util.Scanner;

public class Q4_4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		float side,area;
		
		System.out.println("Enter the side : ");
	
		side = scan.nextFloat();
		
		area = (float) (6 * Math.pow(side, 2)/(4*Math.tan(Math.PI/6)));
		
		System.out.println("The area of the hexagon is " + area);
		
	}
	
}
