package chapter_4;

public class Q4_25 {

	public static void main(String[] args) {
//		(Generate vehicle plate numbers) Assume a vehicle plate number consists of three
//		uppercase letters followed by four digits. Write a program to generate a plate
//		number.

		char firstPlace = (char) (65 + (Math.random() * 25));
		char secondPlace = (char) (65 + (Math.random() * 25));
		char thirdPlace = (char) (65 + (Math.random() * 25));
		int forthPlace = (int) (Math.random() * 10);
		int fifthPlace = (int) (Math.random() * 10);
		int sixthPlace = (int) (Math.random() * 10);
		int seventhPlace = (int) (Math.random() * 10);

		String plate = "" + firstPlace + secondPlace + thirdPlace + forthPlace + fifthPlace + sixthPlace + seventhPlace;

		System.out.println(plate);

	}

}
