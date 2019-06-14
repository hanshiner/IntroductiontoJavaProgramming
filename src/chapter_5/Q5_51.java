package chapter_5;

import java.util.Scanner;

public class Q5_51 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the first string:");
		String s1 = scan.nextLine();

		System.out.print("Enter the second string:");
		String s2 = scan.nextLine();

		int count1 = s1.length();
		int count2 = s2.length();

		int count = Math.min(count1, count2);

		String result = "";
		int i = 0;

		while (i <= count - 1) {
			if (s1.charAt(i) == s2.charAt(i)) {
				result += s1.charAt(i);
				i++;

			} else {
				System.out.println();
				break;
			}

		}

		String that = (result.isEmpty()==false)?("The common prefix is " + result): (s1 +" and " + s2+ " have no common prefix");
		
		System.out.println(that);

	}

}
