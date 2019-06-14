package chapter_2;

import java.util.Scanner;

public class Q2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = input.nextDouble();
		double length = input2.nextDouble();
		
		double area = radius * radius * 3.14;
		double volume = area * length;
		
		System.out.println("The area is " + area); 
		System.out.println("The volume is " + volume); 

	}

}
