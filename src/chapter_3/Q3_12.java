package chapter_3;

import java.util.Scanner;

public class Q3_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a three-digit integer: ");
		int number = input.nextInt();
		int digit1 = number/100;
		number=number % 100;
		
		int digit2 = (number)/10;
		number=number % 10;

		int digit3 = number;
        
		String leftToRight= ""+digit1+digit2+digit3;
		String rigthToLeft= ""+ digit3+digit2+digit1;
		

		if(leftToRight.equals(rigthToLeft)) {
			
			System.out.println(leftToRight + " is a palindrome.");
			
		}
		else {
			System.out.println(leftToRight + " is not a palindrome.");

		}
	}

}
