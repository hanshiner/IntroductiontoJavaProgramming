package chapter_6;

public class Q6_17 {

	public static void main(String[] args) {
		
		printMatrix(2);

	}

	public static void printMatrix(int n) {

		int random1 = (int) (Math.random() + 1);

		for (int i = 0; i < n; i++)
			System.out.println(random1);

	}
}
