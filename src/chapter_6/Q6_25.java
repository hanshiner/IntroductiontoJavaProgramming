package chapter_6;

public class Q6_25 {

	public static void main(String[] args) {
		
		System.out.println(convertMillis(100000));

	}

	public static String convertMillis(long millis) {
		
		
		 long hours= (millis-minutes*3600-seconds*1000)/60;
		 long minutes = (millis-seconds*1000)/60;
		 long seconds = millis/1000;

		String time = ""+hours+":"+minutes+":"+seconds;
		
		return time;
	}
}
