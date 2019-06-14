package chapter_1;

public class Q1_13 {

	public static void main(String[] args) {
		double a=3.4;
		double b=50.2;
		double c=2.1;
		double d=.55;
		double e=44.5;
		double f=5.9;
       
		
		System.out.println("Assume that ax+by=e and	cx+dy=f");
		System.out.println("Then x=(ed-bf)/(ad-bc)  and y=(af-ec)/(ad-bc");
		
		System.out.println("So " + "x" + "=" + (e*d-b*f)/(a*d-b*c) );
		System.out.println("So " + "y" + "=" + (a*f-e*c)/(a*d-b*c ));

	}
	

}
