package chapter_6;

import java.util.Scanner;

public class Q6_20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any word:");
		String word = scan.next();

		System.out.println("The number of characters in the word " + word + " is " + countLetters(word));

	}

	public static int countLetters(String s) {

		return s.length();

	}

}
