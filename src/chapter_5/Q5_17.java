package chapter_5;

import java.util.Scanner;

public class Q5_17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter an dinteger from 1 to 15: ");
		int number = scan.nextInt();
		
		String pyramidMini = "1";
		String pyramid;
		
		for (int i=1;i<=number;i++) {
			
			pyramid=" "+(i+1)+" "+pyramidMini+" "+(i+1)+" ";
			System.out.println(pyramidMini);

			pyramidMini=pyramid;
		}
	}

}
