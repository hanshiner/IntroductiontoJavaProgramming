package chapter_3;

import java.util.Scanner;

public class Q3_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		
		double a = input.nextDouble();
		
		double b = input.nextDouble();
		
		double c = input.nextDouble();

		if ((Math.pow(b, 2) - 4 * a * c) > 0) {

			
	    double r2 = (-b - Math.pow(Math.pow(b, 2) - 4 * a * c, .5)) / (2 * a);
		
	    double r1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, .5)) / (2 * a);

		System.out.print("The equation has two roots " + r1 + " and " + r2);

		}
		else if ((Math.pow(b, 2) - 4 * a * c) == 0) {

			double r3 = -b / (2 * a);

	    System.out.print("The equation has one root " + r3);

		}else {
			System.out.print("The equation has no real root");

		}
	}

}
