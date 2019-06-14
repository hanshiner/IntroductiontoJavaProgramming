package chapter_4;

import java.util.Scanner;

public class Q4_9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a character: ");
		String code = scan.next();
		char ch = code.charAt(0);

		int numValue = ch;

		System.out.println("The Unicode for the character " + ch + " is " + numValue);

	}

}
