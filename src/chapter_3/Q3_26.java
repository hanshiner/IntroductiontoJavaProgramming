package chapter_3;

import java.util.Scanner;

public class Q3_26 {

	public static void main(String[] args) {

		System.out.println("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int numberEntered = input.nextInt();

		System.out.println("Is " + numberEntered + " divisible by 5 and 6?");
		if (numberEntered % 5 == 0 && numberEntered % 6 == 0) {

			System.out.println("true");
		}

		else {
			System.out.println("false");
		}

		System.out.println("Is " + numberEntered + " divisible by 5 or 6?");
		if (numberEntered % 5 == 0 || numberEntered % 6 == 0) {

			System.out.println("true");
		}

		else {
			System.out.println("false");
		}

		System.out.println("Is " + numberEntered + " divisible by 5 or 6, but not both?");
		if ((numberEntered % 5 == 0 || numberEntered % 6 == 01)
				&& !(numberEntered % 5 == 0 && numberEntered % 6 == 0)) {

			System.out.println("true");
		}

		else {
			System.out.println("false");
		}

	}

}
