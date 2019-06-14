package chapter_2;

import java.util.Scanner;

public class Q2_15 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);
		Scanner input3=new Scanner(System.in);
		Scanner input4=new Scanner(System.in);

		
		System.out.print("Enter x1 and y1: ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();

		System.out.print("Enter x2 and y2:");
		double x2=input3.nextDouble();
		double y2=input4.nextDouble();

		System.out.print("The distance between the two points is " + Math.pow(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)), 0.5));
	}

}
