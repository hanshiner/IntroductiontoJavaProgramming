package chapter_5;

import java.util.Scanner;

public class Q5_41 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter numbers: ");
		int num = scan.nextInt();
		
		int countMax = 0;
		int max=0;
		
		do {
			if (num > max) {
				max=num;
				countMax=1;
			}else if (num == max) {
				countMax++;
			}
			num = scan.nextInt();
			
		}while(num>0);
			
		System.out.println("The largest number is : " + max);
		
		System.out.println("The occurrence count of the largest number is " +countMax);
		
	}

}
