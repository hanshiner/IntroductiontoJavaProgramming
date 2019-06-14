package chapter_7;

import java.util.Scanner;

public class Q7_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of students:");
		int size = scan.nextInt();
		
		System.out.print("Enter "+ size +" scores:"); 
		int[] scores = new int[size];
		
		int best = 0;
		
		for (int i = 0; i < scores.length; i++) {
			scores[i]=scan.nextInt();
			if(best<scores[i])
				best=scores[i];
		}

		char score = 'a';
		for (int i = 0; i < scores.length; i++) {
			if(scores[i]>=best-10)
				score='A';
			else if(scores[i]>=best-20)
				score='B';
			else if(scores[i]>=best-30)
				score='C';
			else if(scores[i]>=best-40)
				score='D';
			else
				score='F';

			System.out.println("Student "+i+" score is "+scores[i]+" and grade is "+ score);
		}

		

}
}
