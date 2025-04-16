package VairableConcepts;

public class Practice3rdOct 
{

	public static void main(String[] args) 
	
	{
		String a ="abcdef";
		String b ="xyz1234";
		String c ="abcxy";
		
		if(a.length()<b.length() && a.length()>c.length())
		{
			System.out.println("Variable a is less than variable b and greater than variable c");
			
		}
		else 
		{
			System.out.println("Variable a is greater than variable b and less than variable c");
			
		}
		
		if(a.equals(b)==false && a.equals(c) != true)
		{
			System.out.println("String a and b and c are same");
		}
		else 
		{
			System.out.println("String a and b and c are not same");
			
		}
		
		if(a.equalsIgnoreCase(c))
		{
			System.out.println("String a and c are equals");
		}
		else 
		{
			System.out.println("String a and c are not equals");
			
		}
		
		if(a.contains("cd") && !a.contains("xy"))
		{
			System.out.println("Pass");
		}
		else 
		{
		    System.out.println("Fail");	
		}
		
		b.toUpperCase();
		System.out.println(b);
		if(b.contains("Z")== true)
		{
			System.out.println("String b contains Z");
		}
		else 
		{
			System.out.println("String b not contains Z");
		}
	}

}
