package chapter_7;

import java.util.Arrays;

public class Q7_34 {

	public static String sort(String s) {

		char[] ch = s.toCharArray();

		Arrays.sort(ch);

		String result = "";
		for (char in : ch) {
			result += in;
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println(sort("bca"));
	}

}
