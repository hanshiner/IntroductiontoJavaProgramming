package chapter_6;

import java.util.Scanner;

public class Q6_5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 floating numbers: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        
        System.out.println("The sorted version of " + num1 + ", " + num2 + ", and " + num3 + " in increasing order is ");
		displaySortedNumbers(num1,num2,num3);
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
              double max =  Math.max(Math.max(num1, num2),num3);		
              double min =  Math.min(Math.min(num1, num2),num3);	
              
              double middle;
              if(num1!=max && num1!=min )
            	  middle=num1;
              else if(num2!=max && num2!=min )
            	  middle=num2;
              else
            	  middle=num3;
            	  
              System.out.println(min +" " + middle + " "+ max );
}
}
