package chapter_5;

import java.util.Scanner;

public class Q5_1 {

	public static void main(String[] args) {
//		(Count positive and negative numbers and compute the average of numbers) Write
//		a program that reads an unspecified number of integers, determines how many
//		positive and negative values have been read, and computes the total and average of
//		the input values (not counting zeros). Your program ends with the input 0. Display
//		the average as a floating-point number. Here is a sample run:
//		
		Scanner scan = new Scanner (System.in);
						
		int positives= 0 , negatives =  0,count=0,number;
		
		double average, total=0;
		
		System.out.println("Enter an integer, the input ends if it is 0: ");
		 number = scan.nextInt();

			
		while(number != 0 ) {
							
				count ++;
				
		total+=number;
				
				if(number > 0)
					positives++;
				
				else
					negatives++;
				 number = scan.nextInt();

		}
		
		average = total/count;
		
		
	System.out.println("The number of positives is: " + positives);
	System.out.println("The number of negatives is: " + negatives);
	
System.out.println("total is: " + total);
		System.out.println("The average is: " + average);
		
		
		
		
	}

}
