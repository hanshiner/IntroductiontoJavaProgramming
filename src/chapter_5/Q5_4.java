package chapter_5;

public class Q5_4 {

	public static void main(String[] args) {
		
		int miles=0;
		
		double kilometer=0;
		
				
		System.out.println("Miles     Kilometers");
		
		for(int i=1;i<=10;i++) {
			miles=i;
		    kilometer+= 1.609;
			System.out.println(miles+ "     "+kilometer);
		}
	}

}
