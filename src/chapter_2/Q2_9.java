package chapter_2;

import java.util.Scanner;

public class Q2_9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double a,v0,v1,t;
		
		System.out.print("Enter v0, v1, and t: ");
		v0 = scan.nextDouble();
		v1 = scan.nextDouble();
		t = scan.nextDouble();
		
		a= (v1-v0) / t;
		
		System.out.println("The average acceleration is " + a);
		
	}

}
