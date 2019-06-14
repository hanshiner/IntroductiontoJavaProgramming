package chapter_4;

import java.util.Scanner;

public class Q4_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double x1, y1, x2, y2, distance;

		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();

		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();

		distance = 6371.0101 * Math.acos((Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))
				+ Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2))));

		System.out.println("The distance between the two points is " + distance + " km");

	}
}
