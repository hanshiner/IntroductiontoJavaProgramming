package chapter_6;

import java.util.Scanner;

public class Q6_19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Enter 3 sides of a triangle and I will tell ya the area if it is valid if not I will tel ya it is invalid.");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();

		if (isValid(num1, num2, num3))
			System.out.println("The triangle " + num1 + ", " + num2 + ", " + num3 + " is valid and the area is "
					+ area(num1, num2, num3));

		else
			System.out.println("Invalid");

	}

	public static boolean isValid(double side1, double side2, double side3) {

		if ((side1 + side2 >= side3) && (side1 + side3 >= side2) && (side3 + side2 >= side1))
			return true;
		else
			return false;

	}

	public static double area(double side1, double side2, double side3) {

		double s = (side1 + side2 + side3) / 2;

		return Math.sqrt(s * (s - side2) * (s - side1) * (s - side3));

	}

}
