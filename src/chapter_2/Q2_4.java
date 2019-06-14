package chapter_2;

import java.util.Scanner;

public class Q2_4 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
	
		System.out.print("Enter a number in pounds: ");
		double lbs=input.nextDouble();
		
		double kg=lbs*0.454;
		System.out.println(lbs + " pounds is " + kg + " kilograms.");

		
		
	}

}
