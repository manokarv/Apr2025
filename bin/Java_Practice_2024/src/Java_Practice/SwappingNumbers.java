package Java_Practice;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
	
		int x, y, t;
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of x and y");  
	       x = sc.nextInt();  
	       y = sc.nextInt();  
	       System.out.println("Current values are: "+x +"  "+ y);  
	     
	      // t = x;  
	     //  x = y;  
	     //  y = t;  
	       x=x+y;
	       y=x-y;
	       x=x-y;
	       System.out.println("New values after swapping: "+x +"   " + y);  
	       System.out.println( );  
	       
	      
	}

}
