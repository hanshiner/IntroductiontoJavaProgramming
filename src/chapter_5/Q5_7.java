package chapter_5;

public class Q5_7 {

	public static void main(String[] args) {
    
		float tuition = 10_000;
		
		for(int i =0;i<10;i++)
			System.out.println(10000*Math.pow(1.05, i));
		
		float sum = 0;
		
		for(int i =10;i<14;i++) {
			sum+=10000*Math.pow(1.05, i);
			
			}
		
		System.out.println(sum);
		}

}
