package chapter_2;
import java.util.Scanner;

public class Q2_7 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number of minutes:");
		long min=input.nextLong();
		long year=min/(60*24*365);
		long day=min-year/(60*24);
		
		System.out.print(min + " minutes is approximately " + year +" years and " + day +" days.");
		
		
	}

}
