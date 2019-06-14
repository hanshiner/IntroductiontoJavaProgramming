package chapter_3;

import java.util.Scanner;

public class Q3_8 {

	public static void main(String[] args) {

		// Write a program that prompts the user to enter three integers and display the
		// integers in
		// non-decreasing order.

		Scanner scan = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println("You will enter three integer");

		System.out.println("Enter the first integer");
		num1 = scan.nextInt();

		System.out.println("Enter the second integer");
		num2 = scan.nextInt();

		System.out.println("Enter the third integer");
		num3 = scan.nextInt();

		if (num1 > num2 && num2 > num3) {
			System.out.println(num1 + "  " + num2 + "  " + num3);
		} else if (num1 > num3 && num2 < num3) {
			System.out.println(num1 + "  " + num3 + "  " + num2);
		} else if (num1 < num2 && num1 > num3) {
			System.out.println(num2 + "  " + num1 + "  " + num3);
		} else if (num1 < num3 && num2 > num3) {
			System.out.println(num2 + "  " + num3 + "  " + num1);
		} else if (num1 < num2 && num2 < num3) {
			System.out.println(num3 + "  " + num2 + "  " + num1);
		} else if (num1 > num2 && num1 < num3) {
			System.out.println(num3 + "  " + num1 + "  " + num2);
		}
	}

}
