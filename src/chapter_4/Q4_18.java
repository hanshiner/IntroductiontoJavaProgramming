package chapter_4;

import java.util.Scanner;

public class Q4_18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String major;		
	
		System.out.println("Enter two characters: ");
		major = scan.next();
		
		if(major.equals("M1"))
			System.out.println("Mathematics Freshman");
		else if(major.equals("M2"))
			System.out.println("Mathematics Sophomore");
		else if(major.equals("M3"))
			System.out.println("Mathematics Junior");
		else if(major.equals("M4"))
			System.out.println("Mathematics Senior");
		else if(major.equals("C1"))
			System.out.println("Computer Science Freshman");
		else if(major.equals("C2"))
			System.out.println("Computer Science Sophomore");
		else if(major.equals("C3"))
			System.out.println("Computer Science Junior");
		else if(major.equals("C4"))
			System.out.println("Computer Science Senior");
		else if(major.equals("I1"))
			System.out.println("Information Technology Freshman");
		else if(major.equals("I2"))
			System.out.println("Information Technology Sophomore");
		else if(major.equals("I3"))
			System.out.println("Information Technology Junior");
		else if(major.equals("I4"))
			System.out.println("Information Technology Senior");
		else 
			System.out.println("Invalid input");
		
		
			
		
	}

}
