package chapter_4;

import java.util.Scanner;

public class Q4_14 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a letter grade: ");
		String letterGrade = scan.next();
		
		int numberGrade;
		
		if (letterGrade.equals("A"))
				System.out.println("The numeric value for grade "+ letterGrade + " is "+ 4); 
		else if (letterGrade.equals("B"))
				System.out.println("The numeric value for grade "+ letterGrade + " is "+ 3); 
		else if (letterGrade.equals("C"))
				System.out.println("The numeric value for grade "+ letterGrade + " is "+ 2); 
		else if (letterGrade.equals("D"))
		      System.out.println("The numeric value for grade "+ letterGrade + " is "+ 4); 
		else 
			System.out.println(letterGrade + " is an invalid grade");
		
	}

}
