package chapter_1;

public class Q1_11 {

	public static void main(String[] args) {

		double population =312032486;
		
		for(int i=0;i<=5;i++) {
		population+= i*((365*24*60*60/7.0) + (365*24*60*60/45.0) -(365*24*60*60/13.0)) ;
				
		System.out.println(population);

		
		
		}
		
	}

}
