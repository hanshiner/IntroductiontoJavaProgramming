package chapter_6;

import java.util.Scanner;

public class Q6_7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter investment Amount , monthly Interest Rate and years in order : ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		

		System.out.println("The amount invested : " + num1);
		System.out.println("Annual interest rate : ");
		System.out.println("Years      Future Value");
		
		for(int i = 1 ; i <= 30; i++)
		System.out.println(futureInvestmentValue(num1, num2, i));
	}

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		
		
		double investmentValue = investmentAmount + (investmentAmount * monthlyInterestRate * years*12);
		
		
		
		return investmentValue;

	}
}
