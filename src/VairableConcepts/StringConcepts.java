package VairableConcepts;

public class StringConcepts {

	public static void main(String[] args) 
	{
        String s = "This is my Clasd";

        System.out.println(s.length());
        System.out.println(s.isEmpty());
        
        s ="  ";
        System.out.println();
        int a=30;
        int b = a++ - --a + a-- + ++a;
        System.out.println(b);
         int c =b++ * b++ - --b + b-- / --b;
         System.out.println(c);
         
       
    }
}
