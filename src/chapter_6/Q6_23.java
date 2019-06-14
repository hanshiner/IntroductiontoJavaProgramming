package chapter_6;

import java.util.Scanner;

public class Q6_23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any word: ");
		String word = scan.next();

		System.out.println("Enter any char that you want the count: ");
		String theChar = scan.next();
		char ch = theChar.charAt(0);

		System.out.println("The number of char " + ch + " in sentence " + word + " is " + count(word, ch));

		System.out.println(count("Welcome", 'e'));

	}

	public static int count(String str, char a) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a)
				count++;

		}
		return count;
	}
}
