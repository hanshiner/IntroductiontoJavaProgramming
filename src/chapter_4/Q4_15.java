package chapter_4;

import java.util.Scanner;

public class Q4_15 {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
				
		int number=0;
		
		System.out.println("Enter a letter:");
		String  letter = scan.next();	

		if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("b") || letter.equalsIgnoreCase("c"))
			number = 2;
		
		else if (letter.equalsIgnoreCase("d") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("f"))
			number = 3;
		else if (letter.equalsIgnoreCase("g") || letter.equalsIgnoreCase("h") || letter.equalsIgnoreCase("i"))
			number = 4;
		else if (letter.equalsIgnoreCase("j") || letter.equalsIgnoreCase("k") || letter.equalsIgnoreCase("l"))
			number = 5;
		else if (letter.equalsIgnoreCase("m") || letter.equalsIgnoreCase("n") || letter.equalsIgnoreCase("0"))
			number = 6;
		else if (letter.equalsIgnoreCase("p") || letter.equalsIgnoreCase("q") || letter.equalsIgnoreCase("r") || letter.equalsIgnoreCase("s"))
			number = 7;
		else if (letter.equalsIgnoreCase("t") || letter.equalsIgnoreCase("u") || letter.equalsIgnoreCase("v"))
			number = 8;
		else if (letter.equalsIgnoreCase("w") || letter.equalsIgnoreCase("x") || letter.equalsIgnoreCase("y") || letter.equalsIgnoreCase("z"))
			number = 9;
			
		System.out.println("The corresponding number is " + number);
	}

}
