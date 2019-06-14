package chapter_6;

public class Q6_1 {

	public static int getPentagonalNumber(int n) {
			return (int) (n * (3 * n - 1) / 2);
	}
		

	public static void main(String[] args) {
		
		for( int i = 0 ; i< 100; i++)
		System.out.println("The first 100 pentagonal numbers are: " + getPentagonalNumber(i));
	}

}
