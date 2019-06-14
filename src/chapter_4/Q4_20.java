package chapter_4;

import java.util.Scanner;

public class Q4_20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = " ";

		System.out.println("Enter a string: ");
		str = scan.next();

		int length = str.length();

		char firstCharacter = str.charAt(0);

		System.out.println("its length is: " + length);

		System.out.println("its first character is: " + firstCharacter);

	}

}
