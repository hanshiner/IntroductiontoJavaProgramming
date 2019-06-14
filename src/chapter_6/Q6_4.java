package chapter_6;

import java.util.Scanner;

public class Q6_4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Bir sayi yaz : ");
		int num = scan.nextInt();
		
		System.out.println("Baba senin yazdigin sayinin " + num+" tam tersi iste budur "+  reverse(num));
		
	}
	
	public static int reverse(int number) {
		String numberString = "" + number;
		String reversed = "";

		for (int i = numberString.length() - 1; i >= 0; i--)
			reversed += numberString.charAt(i);

		int newNumber = Integer.parseInt(reversed);
		return newNumber;

	}

}
