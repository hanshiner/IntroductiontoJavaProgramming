package chapter_5;

import java.util.Scanner;

public class Q5_22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Loan Amount: ");
		double loanAmount = scan.nextDouble();

		System.out.println("Number of Years: ");
		int numOfYears = scan.nextInt();

		System.out.println("Annual Interest Rate: ");
		double annualRate = scan.nextDouble();

		double monthlyInterestRate = annualRate / 1200;
		
		double monthlyPayment = loanAmount * monthlyInterestRate / (1- 1 / Math.pow(1 + monthlyInterestRate, numOfYears * 12));
		
		double totalPayment = monthlyPayment * numOfYears*12;

		System.out.println("Monthly Payment: " + monthlyPayment);
		
		System.out.println("Total Payment: " + totalPayment);
		
		System.out.println("Payment#     Interest        Principal           Balance");
		
		int paymentNo = 1;
		
		while(paymentNo <= 12) {
			
			
		}
	}

}
