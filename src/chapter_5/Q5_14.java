package chapter_5;

import java.util.Scanner;

public class Q5_14 {

	public static void main(String[] args) {
//		(Compute the greatest common divisor) Another solution for Listing 5.9 to find
//		the greatest common divisor of two integers n1 and n2 is as follows: First find d
//		to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
//		a divisor for both n1 and n2 in this order. The first such common divisor is the
//		greatest common divisor for n1 and n2. Write a program that prompts the user to
//		enter two positive integers and displays the gcd.
		
		Scanner scan =new Scanner(System.in);
		
		
		System.out.println("Enter two integers: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int min = Math.min(n1, n2);
		int gcd=1;
		
		for (int i =1 ;i<=min;i++) {
			if(n1%i==0 && n2%i==0)
			gcd=i;
		}
		
		System.out.println("The greatest common divisor of " + n1 + " and " + n2 +" is "+ gcd +".");
		
	}

}
