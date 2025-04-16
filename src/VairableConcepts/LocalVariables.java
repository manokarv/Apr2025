package VairableConcepts;

public class LocalVariables {
	
	public static void m1()
	{
		int a=9;
		int b=10;
		//int c= a*b;
		//m2();
		
		System.out.println(a+b);
	}
	public  static /*void*/ int m2()
	{
		int a= 34;
		int b=14;
		int c=(a-b);
		System.out.println(c);
		m1();
		
		return c;
	}

	public static void main(String[] args) 
	{
		LocalVariables x1 = new LocalVariables();
		
		
		
		//int a =12;
		//System.out.println(a);
        m1();
		m2();
	}

}
