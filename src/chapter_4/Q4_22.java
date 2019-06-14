package chapter_4;

import java.util.Scanner;

public class Q4_22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count=0; 
		
		System.out.println("Enter string s1: ");
		String s1 = scan.next();

		System.out.println("Enter string s2: ");
		String s2 = scan.next();

		for (int i = 0; i <= s1.length()-s2.length(); i++)
			if (s1.substring(i, i+s2.length()).equals(s2))
                 count+=1;
					
		if (count>=1)		
			System.out.println(s2 + " is a substring of " + s1);
		else    
			System.out.println(s2 + " is not a substring of " + s1);

	}

}
