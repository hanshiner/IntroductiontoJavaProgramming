package chapter_3;

import java.util.Scanner;

public class Q3_6 {

	public static void main(String[] args) {

		Scanner input=new Scanner (System.in);
		Scanner input2=new Scanner (System.in);
		Scanner input3=new Scanner (System.in);

		System.out.print("Enter weight in pounds: ");
		double weight =input.nextDouble();
		
		System.out.print("Enter feet: ");
		double feet=input2.nextDouble();

		System.out.print("Enter inches: ");
		double inches=input3.nextDouble();

		double bmi= (weight *0.453592)/Math.pow(((feet*0.3048)+(inches*0.0254)),2);
		
		
		 System.out.println("BMI is "+ bmi ); 
		 
		 if (bmi < 18.5) {     
		 System.out.println("Underweight");
		 }
		 
		 else if (bmi < 25) {      
		 System.out.println("Normal");}
		 
		 else if (bmi < 30) {     
		 System.out.println("Overweight");
		 }
		 else {      
		 System.out.println("Obese");
	
		 }}

}
