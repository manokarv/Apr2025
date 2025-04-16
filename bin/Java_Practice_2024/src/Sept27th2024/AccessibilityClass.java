package Sept27th2024;

public class AccessibilityClass {

	public static void main(String[] args) 
	{
		
		//MethodDeclaration.displayMessage(); //private method cannot access out side the class
		MethodDeclaration.productOfNumbers(45, 23); //default method cannot access out side the class
		MethodDeclaration.quotientOfNumbers(35, 5); //public method cannot access out side the class
	}

}
