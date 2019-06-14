package chapter_5;

public class Q5_12 {

	public static void main(String[] args) {
//		(Find the smallest n such that n2 7 12,000) Use a while loop to find the smallest
//		integer n such that n2 is greater than 12,000.
		
		int n = 0;
		
		for (int i = 1000;i*i>12000 ;i--) {
			n=i;
		}
		System.out.println("The smallest integer n such that n^2 is greater than 12,000: " + n);	
		
	}

}
