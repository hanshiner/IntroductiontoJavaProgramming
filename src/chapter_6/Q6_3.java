package chapter_6;

import java.util.Scanner;

public class Q6_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();

		System.out.println("Your number is " + (isPalindrome(num)?"a palindrome":"not a palindrome"));

	}

	public static int reverse(int number) {
		String numberString = "" + number;
		String reversed = "";

		for (int i = numberString.length() - 1; i >= 0; i--)
			reversed += numberString.charAt(i);

		int newNumber = Integer.parseInt(reversed);
		return newNumber;

	}

	public static boolean isPalindrome(int number) {
		
		if (number == reverse(number))
		return true;
		
		else
		return false;	
	}

}
