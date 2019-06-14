package chapter_3;

import java.util.Scanner;

public class Q3_17 {

	public static void main(String[] args) {

		
		System.out.println("scissor (0), rock (1), paper (2): ");
		Scanner input =new Scanner(System.in);
		
		int numberSelected=input.nextInt();
		
		int randomNumber=(int) Math.random()*10;
		System.out.println(randomNumber);
		
		

		if (numberSelected==0) {
			if(randomNumber==0) {
				System.out.println("The computer is scissor. You are scissor, too. It's a draw");
			}
			
			else if(randomNumber==1) {
				System.out.println("The computer is rock. You are scissor, too. You lost");

			}
		
			else if(randomNumber==2) {
				System.out.println("The computer is paper. You are scissor, too. You won");

			}
			
			else if (numberSelected==1) {
				if(randomNumber==0) {
					System.out.println("The computer is scissor. You are rock, too. You won");
				}
				
				else if(randomNumber==1) {
					System.out.println("The computer is rock. You are rock, too. It's a draw");

				}
			
				else if(randomNumber==2) {
					System.out.println("The computer is paper. You are rock, too. You lost");

				}
		}
		
			else if (numberSelected==2) {
				if(randomNumber==0) {
					System.out.println("The computer is scissor. You are paper, too. You lost");
				}
				
				else if(randomNumber==1) {
					System.out.println("The computer is rock. You are paper, too. You won");

				}
			
				else if(randomNumber==2) {
					System.out.println("The computer is paper. You are paper, too. It's a draw");

				}
	}

}
	}
}

