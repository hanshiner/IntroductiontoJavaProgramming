package chapter_4;

import java.util.Scanner;

public class Q4_13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a letter: ");
		String letter = scan.next();
		char ch1 = letter.toLowerCase().charAt(0);

		if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
			System.out.println(letter + " is a vowel");

		else if (ch1 >= 'a' && ch1 <= 'z')
			System.out.println(letter + " is a consonant");

	}

}
