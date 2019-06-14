package chapter_2;

import java.util.Scanner;

public class Q2_6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");
		int number=input.nextInt();
		
		System.out.print("The sum of the digits is: " + number/100%10 + number/10%10 + number%10);

	}

}
