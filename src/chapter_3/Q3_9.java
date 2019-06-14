package chapter_3;

import java.util.Scanner;

public class Q3_9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		int isbnNumber = input.nextInt();
		
		int editedIsbn=isbnNumber;
		
		int d1 = (int) isbnNumber/100000000;
		isbnNumber = isbnNumber % 100000000;
		
		int d2 = (int) isbnNumber/10000000;
		isbnNumber = isbnNumber % 10000000;
		
		int d3 = (int) isbnNumber/1000000;
		isbnNumber = isbnNumber % 1000000;
		
		int d4 = (int) isbnNumber/100000;
		isbnNumber = isbnNumber % 100000;
		
		int d5 = (int) isbnNumber/10000;
		isbnNumber = isbnNumber % 10000;
		
		int d6 = (int) isbnNumber/1000;
		isbnNumber = isbnNumber % 1000;
		
		int d7 = (int) isbnNumber/100;
		isbnNumber = isbnNumber % 100;
		
		int d8 = (int) isbnNumber/10;
		isbnNumber = isbnNumber % 10;
		
		int d9 = (int) isbnNumber;
		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;


		if (d10 == 10) {
			System.out.println("The ISBN-10 number is " + editedIsbn + "X");
		} else {
			System.out.println("The ISBN-10 number is " + editedIsbn + d10);
		}

	}
}
