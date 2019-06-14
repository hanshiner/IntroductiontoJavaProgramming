package chapter_6;

public class Q6_9 {

	public static void main(String[] args) {

//		Write a test program that invokes these methods to display the following tables:

		
		System.out.println("Feet     Meters      |      Meters      Feet");
		System.out.println("--------------------------------------------");

		for (int i = 1 ;i<=10 ; i++)
			System.out.println(i + "     "+footToMeter(i) + "        " + (5*i + 15) + "     " +meterToFoot(5*i + 15));
	}

	/** Convert from feet to meters */
	public static double footToMeter(double foot) {

		double meter = 0.305 * foot;
		return meter;
	}

	/** Convert from meters to feet */
	public static double meterToFoot(double meter) {

		return 3.279 * meter;
	}

}
