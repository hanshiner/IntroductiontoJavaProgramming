package chapter_2;
import java.util.Scanner;
public class Q2_5 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);

		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal=input.nextDouble();
		double gratuity=input2.nextDouble();
		
		
		System.out.print("The gratuity is "+ subtotal*gratuity + " and total is " + (subtotal + subtotal*gratuity) );

		
		

}
}