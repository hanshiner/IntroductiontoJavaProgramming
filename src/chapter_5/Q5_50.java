package chapter_5;

import java.util.Scanner;

public class Q5_50 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter a string:");
		String s = scan.nextLine();
		
		int uppercaseNo = 0;
		
		int i = 0;
		
		while(i<=s.length()-1) {
			
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			   uppercaseNo+=1;
			   
		i++;
		}
		
		System.out.println("The number of uppercase letters is " + uppercaseNo);
		
	}

}
