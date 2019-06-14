package chapter_5;

public class Q5_24 {

	public static void main(String[] args) {

    int x  = 1;
    
    String expression = "";
    
    int sum = 0;
    
    while(x <= 97 ) {
    	expression+= x +"/"+(x+2)+"+"; 
    	sum+=(x/(x+2));
    	x+=2;
    }
		System.out.println(expression);
		System.out.println(sum);
	}

}
