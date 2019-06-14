package chapter_5;

public class Q5_43 {

	public static void main(String[] args) {

		int to7 = 7;

		int i = 1;

		while (i < 7) {
			int j = i + 1;

			while (j <= 7) {

				System.out.println(i + " " + j);

				j++;
			}

			i++;
		}

		System.out.println("The total number of all combinations is 21");
	}

}
