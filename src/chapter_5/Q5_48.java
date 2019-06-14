package chapter_5;

import java.util.Scanner;

public class Q5_48 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
       
		System.out.print("Enter a string: ");
		String s = scan.nextLine();
		
		String str = "";
		
		int i=0;
		
		while(i<=s.length()-1){
			str+=s.charAt(i);
			i+=2;
		}
		
		System.out.println(str);
	}

}
