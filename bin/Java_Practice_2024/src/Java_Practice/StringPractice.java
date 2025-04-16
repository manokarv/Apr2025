package Java_Practice;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) 
	{
		String s1 = "Hello World, I am learning Selenium";
		String s2 = "   Good Morning World, I am learning Selenium  ";
		
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(8));
		System.out.println(s1.toUpperCase().compareTo(s2));
		System.out.println(s1.endsWith("m"));
		System.out.println(s2.indexOf("Good"));
		System.out.println(s2.charAt(9));
		System.out.println(s2.trim());
		System.out.println(s1.isEmpty());
		
	Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter value of a:");
			int a =sc.nextInt();
			
			System.out.println("Enter value of b:");
			int b =sc.nextInt();
			
			System.out.println("Addition is:"+(a+b));
			
			

	}
	
	public static Number methodDec(int a, int b)
	{
	
		return a+b;
	}

}
