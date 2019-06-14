package chapter_5;

import java.util.Scanner;

public class Q5_49 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
       
		System.out.print("Enter a string: ");
		String s = scan.nextLine();
		s=s.toLowerCase();
		
		int vowels=0;
		
		int consonants=0;

		int i=0;
		
		while (i<= s.length()-1) {
						
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				vowels+=1;
				
			else if(s.charAt(i)>=97 && s.charAt(i)<=122)
				consonants+=1;
		i++;
		
	}
		System.out.println("The number of vowels is "+ vowels);
		System.out.println("The number of consonants is "+ consonants);
}
}
