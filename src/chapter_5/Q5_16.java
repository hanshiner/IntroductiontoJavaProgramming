package chapter_5;

import java.util.Scanner;

public class Q5_16 {

	public static void main(String[] args) {
//		(Find the factors of an integer) Write a program that reads an integer and displays
//		all its smallest factors in increasing order. For example, if the input integer is
//		120, the output should be as follows: 2, 2, 2, 3, 5.
		
		Scanner scan =new Scanner(System.in);
		
		String factors = "";
		
		System.out.println("Enter an integer: ");
		int n1 = scan.nextInt();
		
		
		for(int i = 2;i<=n1;i++ ) {
		
		for(int j = 2;j<=i;j++ ) {

			if(n1%i==0) {
				factors+=i+" ";
			}
							
		}
		System.out.println("The list of factors of n1 are " + factors);
		
	}

}
}
