package Sept27th2024.accessModifier;

import Sept27th2024.MethodDeclaration;
import Static_NonStatic.MethodPractice;

public class AccessModifierClass {

	public static void main(String[] args) {
		
		//MethodDeclaration.productOfNumbers(45, 23);    //default access modifier method can not access outside the package
		
	//	MethodDeclaration.quotientOfNumbers(35, 5); //public method cannot access out side the class
		
		MethodPractice.m1();

	}

}
