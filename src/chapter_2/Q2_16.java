package chapter_2;

import java.util.Scanner;

public class Q2_16 {

	public static void main(String[] args) {

		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter the side: ");
		double side=input.nextDouble();
		
		double area= 3*Math.pow(3, 0.5)*side*side/2;
		
		System.out.println("The area of the hexagon is " + area);
		
		
	}

}
