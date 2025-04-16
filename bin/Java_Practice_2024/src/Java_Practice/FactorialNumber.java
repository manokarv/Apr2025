package Java_Practice;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args)
	{
		int fact =1;
		//int a;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int b = a.nextInt();
		/*for(int i=1;i<=b;i++)
		{
			fact=fact*i;
			
		}*/
		int i=1;
		while( i <= b ){  
            fact = fact * i;   
            i++; 
        }     
System.out.println("Factorial no is:"+fact);
a.close();
	}


}
