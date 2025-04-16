package Static_NonStatic;

public class MethodPractice 
	{
	
	 public static void m1()
	{
		int a=20;
		int b=34;
		System.out.println("Addition of a and b is:"+a+b);
	}
	
	public int m2()
	{
		int x=34; int y=89;
			System.out.println(x*y);
			
			return y/x;
	}

	public static void main(String[] args) 
	{
		m1();
		
		MethodPractice s1 = new MethodPractice();
		s1.m2();
	}

}
