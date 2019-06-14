package chapter_4;

import java.util.Scanner;

public class Q4_23 {

	public static void main(String[] args) {
				
		Scanner scan=new Scanner (System.in);
		
		String name;
		
		double hoursWorked, hourlyPayRate, federalTaxRate,stateTaxRate,grossPay;
		
		System.out.println("Enter employee's name: ");
		name = scan.nextLine();
				
		System.out.println("Enter number of hours worked in a week: ");
		hoursWorked = scan.nextDouble();
		
		System.out.println("Enter hourly pay rate: ");
		hourlyPayRate =scan.nextDouble();
		
		System.out.println("Enter federal tax withholding rate: ");
		federalTaxRate=scan.nextDouble();
		
		System.out.println("Enter state tax withholding rate: ");
		stateTaxRate=scan.nextDouble();
		
	    grossPay = (hourlyPayRate*hoursWorked);
	    
	    double federalTaxDeduction= (grossPay*federalTaxRate);
	    
	    double stateTaxDeduction = (grossPay*stateTaxRate);
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hoursWorked );
		System.out.println("Pay Rate: $" + hourlyPayRate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions: ");
		System.out.println("  Federal Withholding ("+ (federalTaxRate*100) + "%): $" + federalTaxDeduction );
    	System.out.println("  State Withholding (" + (stateTaxRate*100) + "%): $"  + stateTaxDeduction );
    	System.out.println("  Total Deduction: $" + (stateTaxDeduction + federalTaxDeduction));
    	System.out.println("Net Pay: $" + (grossPay-stateTaxDeduction-federalTaxDeduction));
		

	}

}
