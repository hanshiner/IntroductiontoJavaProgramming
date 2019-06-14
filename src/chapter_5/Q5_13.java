package chapter_5;

public class Q5_13 {

	public static void main(String[] args) {

		int n = 0;
		
		for(int i = 0 ;i*i*i<12000; i++) {
			n=i;
		}
		
		System.out.println("The largest integer n such that n^3 is less than 12,000: " + n);
	}

}
