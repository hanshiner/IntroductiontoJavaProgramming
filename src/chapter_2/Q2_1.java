package chapter_2;

import java.util.Scanner;

public class Q2_1 {
	
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//
//		System.out.print("Enter a degree in Celsius: ");
//		double celsius = input.nextDouble();
//
//		double fahrenheit = 9.0 / 5 * celsius + 32;
//
//		
//		System.out.println(celsius + " Celsius is " + fahrenheit
//				+ " Fahrenheit"); 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double radius = scan.nextDouble();
		
		System.out.println(3.14 * radius * radius);
		
		}
	}