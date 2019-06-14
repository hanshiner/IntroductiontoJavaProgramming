package chapter_7;

public class Q7_30 {

	public static boolean isConsecutiveFour(int[] values) {

		for (int i = 0; i < values.length - 3; i++) {
			if (values[i] == values[i + 1] && values[i + 1] == values[i + 2] && values[i + 2] == values[i + 3])
				return true;
		}

		return false;
	}

	public static void main(String[] args) {

		int[] nums = { 3, 4, 5, 7, 5, 5, 4, 5 };

		System.out.println(isConsecutiveFour(nums));

		int x = 5;
		int y=2;
		double avg = x/y;
		System.out.println(avg);
	}

}
