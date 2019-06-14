package chapter_2;

import java.util.Scanner;

public class Q2_11 {

	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the number of years: ");
		int  years = scan.nextInt();
		
		int population=312032486;
		
		for(int i=0;i<years;i++) 
		population+= i*((365*24*60*60/7.0) + (365*24*60*60/45.0) -(365*24*60*60/13.0)) ;
				
		
		
		System.out.println("The population in 5 years is " + population);
		
	}

}
