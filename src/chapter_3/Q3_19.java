package chapter_3;

import java.util.Scanner;

public class Q3_19 {

	public static void main(String[] args) {

		System.out.println("Put three edges for the triangle: ");
		Scanner input=new Scanner(System.in);
		int edge1=input.nextInt();
		int edge2=input.nextInt();
		int edge3=input.nextInt();
		
		
		if (((edge1+edge2)>=edge3)&&((edge1+edge3)>=edge2)&&((edge3+edge2)>=edge1)) {
			System.out.println("The perimeter is " + (edge1+edge2+edge3) );
		}
		
		else{
			System.out.println("The triangle is invalid");

		}
		}
	}


