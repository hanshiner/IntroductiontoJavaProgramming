package chapter_5;

public class Q5_5 {

	public static void main(String[] args) {
		
		System.out.println("Kilograms        Pounds       |           Pounds              Kilograms");

		for (int i=1;i<200;i+=2) {
			
	System.out.println(i + "      " + (float)(2.2*i) + "           |           " + (2.5*i+17.5) + "       "+ (float)(2.5*i+17.5)/(2.2) );

		}
		
	}

}
