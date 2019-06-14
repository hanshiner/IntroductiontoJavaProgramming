package chapter_3;

import java.util.Scanner;

public class Q3_22 {

	public static void main(String[] args) {

		
		System.out.println("Enter a point with two coordinates: ");
		Scanner input=new Scanner (System.in);
		double x=input.nextDouble();
		double y=input.nextDouble();

		
		if(Math.pow((Math.pow(x, 2)+Math.pow(y, 2)), .5)<=10) {
		
		System.out.println("Point "+ "("+x+"," + y+")" +" is in the circle."); 
		
		}
		
		
		else {
			System.out.println("Point "+ "("+x+"," + y+")" +" is not in the circle."); 
		}
	}

}
