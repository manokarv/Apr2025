package JavaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
	//method 1
		String str = "Hello I am doing Program Practice", sr="";
		
		char ch;
	
			for(int i=0;i<str.length();i++)
			{
				ch= str.charAt(i);
				System.out.println(ch= str.charAt(i));
				sr=ch+sr;
				
				//System.out.println("Reverse String is:"+sr);
			}
		System.out.println("Reverse String is:"+sr);
		
		
		System.out.println("********************************************************************");
		
		//method 2
		String a ="Helllo World";
		
		char[] resultArray = a.toCharArray();
		
		for(int i=resultArray.length-1;i>0;i--)
		{
			String k= String.valueOf(resultArray[i]);
			System.out.println(k);
		}
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the no");
		int num = s.nextInt();
		int reversenum = 0;
		
		
		while( num > 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }
		System.out.println("Reverse of input number is: "+reversenum);
	}

}	
