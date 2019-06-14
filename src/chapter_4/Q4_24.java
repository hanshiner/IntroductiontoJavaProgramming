package chapter_4;

import java.util.Scanner;

public class Q4_24 {

	public static void main(String[] args) {

     Scanner scan=new Scanner (System.in);
    
     String city1, city2, city3;
     
     String alphabeticalOrder = "";
     
     System.out.println("Enter the first city: ");
     city1=scan.nextLine();
     
     System.out.println("Enter the second city: ");
     city2=scan.nextLine();

     System.out.println("Enter the third city: ");
     city3=scan.nextLine();
 		
          
     if ((city3.charAt(0) < city1.charAt(0)) &&((city3.charAt(0) > city2.charAt(0))))
	 alphabeticalOrder += city2 + city3 + city1 ;
     
     else if ((city3.charAt(0) < city1.charAt(0)) &&((city3.charAt(0) > city2.charAt(0))))
    	 alphabeticalOrder += city2 + city3 + city1 ;
     
     else if ((city3.charAt(0) < city1.charAt(0)) &&((city3.charAt(0) > city2.charAt(0))))
    	 alphabeticalOrder += city2 + city3 + city1 ;
     
     
     System.out.println("The three cities in alphabetical order are ");
     
     
	}

}
