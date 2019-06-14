package chapter_4;

import java.util.Scanner;

public class Q4_8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter an ASCII code (an integer between 0 and 127): ");
		int code = scan.nextInt();
		
		char codec = (char) code;
		
		
		System.out.println("The character for ASCII code " + code +" is " + codec);
		
		
	}

}
