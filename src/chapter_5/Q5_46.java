package chapter_5;

import java.util.Scanner;

public class Q5_46 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
       
		System.out.print("Enter a string: ");
		String s = scan.nextLine();
		
		int count = s.length();
		String mod = "";
		int i = 1 ;
		
		while(i <=count) {
			mod+=s.charAt(count-i);
			
			i++;
		}
		
		
		
		
		
		System.out.print("The reversed string is " + mod);
		
		
	}

}
