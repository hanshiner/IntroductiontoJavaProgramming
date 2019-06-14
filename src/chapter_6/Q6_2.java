package chapter_6;

public class Q6_2 {

	public static int sumDigits(long n) {
	
		int digit1 = (int)n/100;
		int digit2 = (int)(n-digit1*100)/10;
		int digit3 = (int) n%10;
		
		return digit1+digit2+digit3;
	}
		
	public static void main(String[] args) {
		
		System.out.println(sumDigits(100));
		
	}

}
