package chapter_2;

import java.util.Scanner;

public class Q2_14 {

	public static void main(String[] args) {

		
		Scanner input=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);

		
		System.out.print("Enter weight in pounds: ");
		float kg=input.nextFloat();

		System.out.print("Enter height in inches: ");
		float msquare=input2.nextFloat();

		
		System.out.print("BMI is "+ (kg*0.45359237)/((msquare*0.0254)*(msquare*0.0254)));
		
	}

}
