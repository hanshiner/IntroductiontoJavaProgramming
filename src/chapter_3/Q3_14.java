package chapter_3;

import java.util.Scanner;

public class Q3_14 {

	public static void main(String[] args) {

		System.out.println("Pick a number between 0 and 1;");
		Scanner input=new Scanner (System.in);
		
		int numberPicked=input.nextInt();
		
		int randomNumber=(int) (Math.random()*2);
		
		System.out.println(randomNumber);

		if (numberPicked==randomNumber) {
			System.out.println("Correct");
		}
		
		else {
			System.out.println("Incorrect");
		}
	}

}
