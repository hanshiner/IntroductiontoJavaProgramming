package chapter_5;

public class Q5_6 {

	public static void main(String[] args) {
	
	
		System.out.println("Miles    Kilometers      |      Kilometers    Miles");
				
		for(int i=1;i<=10;i++)
			System.out.println(i + "     " + (1.609*i) + "      |      " + (5*i+15) + "    "+ (5*i+15)/(1.609) );
		
	}

}
