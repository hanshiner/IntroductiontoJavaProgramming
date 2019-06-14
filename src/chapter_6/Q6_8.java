package chapter_6;

public class Q6_8 {

	public static void main(String[] args) {

		
		System.out.println("Celsius     Fahrenheit       |        Fahrenheit     Celsius");
		System.out.println("_____________________________________________________________");
		
		for (int i = 40;i>30;i--)
			System.out.println(i + "     "+  celsiusToFahrenheit(i)+"             " + (10*i - 280) + "    "+fahrenheitToCelsius(10*i - 280) );
		
	}

	public static double celsiusToFahrenheit(double celsius) {

		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {

		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}
}
