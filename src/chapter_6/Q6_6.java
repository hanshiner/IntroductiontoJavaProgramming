package chapter_6;

import java.util.Scanner;

public class Q6_6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer that you wan the pattern of :");
		int num = scan.nextInt();
		
		displayPattern(num);
		
	}

	public static void displayPattern(int n) {
		
		String pattern = "";
		
		for(int i = 1;i<=n;i++) {
			pattern+=i+" ";
			System.out.println(pattern);
		}
	}
}
