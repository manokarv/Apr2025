package Loop;

public class LoopingConcepts 
{

	public static void main(String[] args) 
	
	{
		int a=28;
		
		while(a%4==0)
		{
			System.out.println("The value of a is:"+a);
			break;
		}
		
		a=100;
		
		while(a%5==0 && a%10==0)
		{
			System.out.println("The vlaue of a is:"+a);
			a=a+5;
		}
		
		System.out.println("******************************************************************************");
		
		a=400;
		
		while(a/10>0)
		{
			System.out.println("The value of a is:"+a);
			a=a/10;
		}
		System.out.println("******************************************************************************");
		
		a=2;
		int b=0;
		
		while(a<10)
		{
			b=b+a;
			a=a+1;
		}
			System.out.println("The value of b is:"+b);
	
			System.out.println("***************************************************************************");
			
			//a=300;
			//b=400; 
			
			a=304;
			b=403;
			
			while(a<500 || b>300)
			{
				if(a%2==0 && b%2==0)
				{
					System.out.println("The vlaus of a is:"+a);
					System.out.println("The value of b is:"+b);
					
					a=a/10;
					b=b*10;
				}
				else
				{
					a=a+1;
					b=b-1;
				}
			}
			
			System.out.println("*********************************************************************************");
			
			
			int d=30;
			do
			{
				System.out.println("The value of d is:"+d);
				d=d+1;
			
			}
			while(d<20);
			{
					System.out.println("*************************************************************************");
			}
			
			System.out.println("*************************************************************************");
			
			d=50;
			do
			{
				System.out.println("The value of d is:"+d);
				d=d+1;
			
			}
			while(d<100);
			
					System.out.println("*************************************************************************");
					System.out.println("*************************************************************************");
					    a=300;
				        b=400;
				        d=500;

				        do
				        {
				            if(a%2==0)  //300%2==0 --> True
				            {
				                while(b%4==0) //25%4==0 --> True
				                {
				                    System.out.println("The value of a is: "+b); //100
				                    b=b/4; //100/4=25
				                }
				            }

				            else if(b%4==0) //400%4==0 --> True
				            {
				                while(b%4==0)
				                {
				                    System.out.println("The value of b is: "+b);
				                    b=b/4;
				                }
				            }

				            else
				            {
				                while(d%5==0)
				                {
				                    System.out.println("The value of d is: "+d);
				                    d=d/5;
				                }
				            }
				        }
				        while (d>11000);

				       // System.out.println("Adding some lines of code for GIT Changes");
			
	}

}
