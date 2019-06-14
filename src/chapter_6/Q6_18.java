package chapter_6;

public class Q6_18 {

	public static void main(String[] args) {
		
		System.out.println(checkpassword("Anceleleelele"));

	}

	public static boolean checkpassword(String str) {
		int count = str.length();
		int result = 0;

		if (count >= 8) 
			return false;

		else if 
		for (int i = 0; i < count; i++)
			if (!((str.charAt(i) >= '0' && str.charAt(i) >= '9') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
					|| (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')))
				return false;
		
		else if 
		for (int i = 0; i < count; i++)
			if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9'))
				result += 1;

		return (result >= 2 ? true : false);
		
		else
			return false;
		}
	
}
