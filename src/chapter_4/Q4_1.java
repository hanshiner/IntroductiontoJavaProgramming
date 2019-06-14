package chapter_4;

import java.util.Scanner;

import java.util.*;

public class Q4_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the length from the center to a vertex: ");

		double length = scan.nextDouble();

		double side = 2 * length * Math.sin(Math.PI / 5);

		double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));

		System.out.println("The area of the pentagon is " + area);

	}

}
