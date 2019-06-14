package chapter_3;

import java.util.Scanner;

public class Q3_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Enter a, b, c, d, e, f: ");
		
		a = scan.nextDouble();
		
		b = scan.nextDouble();
		
		c = scan.nextDouble();
		
		d= scan.nextDouble();
		
		e = scan.nextDouble();
		
		f = scan.nextDouble();
		
		x = (e*d - b*f)/(a*d-b*c);
		
		y = (a*f-e*c)/(a*d-b*c);
		
		if(a*d-b*c==0) {
			System.out.println("The equation has no solution.");
		} else {
			System.out.println("x is " + x + " and y is " + y);
		}
		
		
	}

}
