package Sept25th2004;

public class ConditionalStatements {

	public static void main(String[] args) 
	{
		int i=25;
		
		if(i==15)
		{
			System.out.println("The value of i is 15");
		}
		else
			System.out.println("The value of a is not 10, actual value is:"+i);
		
		
		i=40-20*100;
		
		if(i%5==0)
		{
			System.out.println("The value of i is divisible by 5");
		}
		else
			System.out.println("The value of i is not divisible by 5");
		
		
		i=60-200*30/2;
		
		if(i%7==0)
		{
			System.out.println("The value of i is divisible by 7");
		}
		else if(i%5==0)
		{
			System.out.println("The value of i is divisible by 5");
		}
		else if(i%3==0)
		{
			System.out.println("The value of i is divisible by 3");
		}
		else if(i%2==0)
		{
			System.out.println("The value of i is divisible by ");
		}
		else
			System.out.println("The value of i is not divisible by 2,3,5,7 ");
		
		String s1="hello";
				
				if(s1.isBlank()==false) //nested if
				{
					if(s1.length()%2==0)
					{
						System.out.println("The length of the String is even number");
					}
					else if(s1.charAt(0)=='H')
					{
						System.out.println("The length of the String is odd and first character is H");
					}
					else if(s1.charAt(0)=='h')
					{
						System.out.println("The length of the String is odd and first character is h");
					}
					else
						System.out.println("The length of the String is odd number");
				}
				
				
				String s2="Hello World";
				
				
				if(s2.isEmpty())
				{
					System.out.println("The String is Empty");
				}
				else 
				{
					String s3=s2.substring(0, 5);
					
					if(s3.contains("H"))
					{
						System.out.println("The String Starting with letter H");
						
					} 
					else if(s3.substring(0).isEmpty())
					{
						System.out.println("The String is Empty");
					}
						
				}


	}

}
