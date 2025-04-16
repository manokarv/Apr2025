package Sept25th2004;

public class SwitchCase {

	public static void main(String[] args) 
	{
		//Switch Case
		//is used when if there are more than 3 condition is check for
		//it is better alternatives for if-else if-else
		
		//Syntax
		//switch(variable name)
		//{
		//case value 1: //else if
		// code  to be executed
		//break;
		//case value 1: //else if
		// code  to be executed
		//break;
		//default: //else block
		// code  to be executed
		//break;
		//}
		
		int a =20;
		
		switch(a)
		{
		case 10:
			System.out.println("The value of a is 10");
			break;
		case 20:
			System.out.println("The value of a is 20");
			break;
		case 30:
			System.out.println("The value of a is 30");
			break;
		default:
			System.out.println("The value of a is not 10,20, 30, actual value is:" +a);
			break;
				
		}
		
		int x =200;//switch case is enhanced
		
		switch(x)//no need of break statements as it is called internally
		{
		case 10 -> System.out.println("The value of a is 10");
		case 20 -> System.out.println("The value of a is 20");
		case 30 -> System.out.println("The value of a is 30");
		default->System.out.println("The value of a is not 10,20, 30, actual value is:" +a);
		}
		
		String s4 ="Hello World";

		switch(s4)
		{
		case "Hello","Hello World" -> System.out.println("The value of s4 is Hello");
		case "World" -> System.out.println("The value of s4 is World");
		default -> System.out.println("The value of s4 is not Hello, Hellow World, World");
		}
		
	}
	

}
