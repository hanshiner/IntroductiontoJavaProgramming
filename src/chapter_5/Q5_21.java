package chapter_5;

import java.util.Scanner;

public class Q5_21 {

	public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         
		
		
		System.out.print("Loan Amount: ");
		double loanAmount = scan.nextDouble();
		
		System.out.print("Number of Years: ");
		int numOfYears = scan.nextInt();
		
		System.out.println("Interest Rate     Monthly Payment     Total Payment");

		
		double rate = 5.000;

		while(rate<=8.000) {
			double totalPayment = (loanAmount*(1+rate/100));
			
			double monthlyPayment = totalPayment/60;
			System.out.println(rate +"%         " + monthlyPayment +"         "+ totalPayment);
			rate+=.125;
		}
	}

}
