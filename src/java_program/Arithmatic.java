package java_program;

public class Arithmatic {

	public static void main(String[] args) {
	/*increment/Decrement*/
		int i = 10;
		int a = 10;
		int c = 5;
		int b = 10;
		
		System.out.println(i-- + ++i +  i-- + --i + i--);
		System.out.println(a-- + ++b + c-- + --i + c++);
		System.out.println(--a + c-- + --i + i--);
		System.err.println(a++ + b++ + ++c + 10);
		System.out.println(a+b+c+i);
		
		System.out.println(a>c ||a<b||c!=b || b==a);
		System.err.println(a==i && c<i || a>c && b>a);
		System.out.println(a<++i && i>a);
		System.out.println(a>=i && a<++i || c<a && i>a++);
		
		
		

	}

}
