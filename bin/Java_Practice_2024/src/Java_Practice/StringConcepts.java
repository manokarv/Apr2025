package Java_Practice;

public class StringConcepts {

	public static void main(String[] args) 
	{
		String b = "This is the Program";
		
		System.out.println(b.length());
		System.out.println(b.isEmpty());
		System.out.println(b.isBlank());
		
		b="";
		
		System.out.println(b.isEmpty());
		System.out.println(b.isBlank());
//-----------------------------------------------------		
		b="  ";
		
		System.out.println(b.isEmpty());
		System.out.println(b.isBlank());
		
		b = "This is the Program";
		
		//convert the string to capital letters
		System.out.println(b.toUpperCase());
		
		//convert the string to small letters
		System.out.println(b.toLowerCase());
		
		//check if the given String is starts with 'this' or not
		
		//return true if condition is satisfied else return false
		
		System.out.println(b.startsWith("is"));
		System.out.println(b.startsWith("This"));
		
		
		b = "This is the Program need to execute";
		
		//Checking  whether the String is starting with the "need",
		//if we are taking the String from 10th index position
		//we need to count starting from 0,1,2
		
		System.out.println(b.startsWith("need",20));
		
		//Checking if the string is ends with "mentioned String" or not
		//returns true if the condition is satisfied or not
		
		System.out.println(b.endsWith("cute	"));
		
		//Replacing the word '  ' with the word  '  'in the given String
		
		System.out.println(b.replace("the", "get"));
		
		//if the word '  ' is not present, then it will return the original String
		
		System.out.println(b.replace("thhe", "get"));
		
		
		b = "This is the HanumanKind song";
		
		//it will check whether the word present in the String or not
		
		System.out.println(b.contains("Kind"));
		
		//Joining two strings
		
		System.out.println(b.concat(" Yes its me"));
		
		//prints the character that is present at 10th position
		
		System.out.println(b.charAt(10));
		//System.out.println(b.charAt(100));//error(java.lang.StringIndexOutOfBoundsException)
		
		//Print the String Statring from the mentioned position till the end
		
		System.out.println(b.substring(5));
		
		b = "This is the HanumanKind song \n";
		//Print the String Statring from the mentioned position till the mentioned position
			
		System.out.println(b.substring(5, 10));
		//System.out.println(b.substring(10, 5));//error(java.lang.StringIndexOutOfBoundsException:)
		
		//Repeat the same String for mutiple times
		System.out.println(b.repeat(5));
		
		//prints the index position of the first occurence of the character ' ' that is present in the String
		//returns -1 if the character is not present
		System.out.println(b.indexOf("n"));
		System.out.println(b.indexOf("z"));
		
		System.out.println(b.indexOf("song"));
		
		//checks of the index position of the word 'is' from the 24th index position
		
		System.out.println(b.indexOf("is", 5));
		
		System.out.println(b.indexOf("i", 3));
		
		//prints the index position of the last occurrence of letter 'i'
		
		System.out.println(b.lastIndexOf("is"));
		System.out.println(b.lastIndexOf('a'));
	//	System.out.println(b.lastIndexOf("i", 15));
		
		
		/*Convert the character to String: Character.toString(b. charAt())...we can written like this way as
		 String str = Character.toString(String.charAt(index no)); syso(str.repeat(5));*/
		//print the specific characters for n no of times.
		//System.out.println(b.charAt(3));
		System.out.println(Character.toString(b.charAt(9)).repeat(5));
		
		b = "   This is the HanumanKind is song \n ";
		//Removes white spaces present at the start and at the end
		//System.out.println(b);
		System.out.println(b.trim());
		
		//Removes the white spaces that is present at the start of the String
		
		System.out.println(b.stripLeading());
		
		//Removes the white spaces that is present at the end of the String
		
		System.out.println(b.stripTrailing());
				
		//Removes the white spaces that is present at the start of the String
		
		System.out.println(b.stripLeading());	
		
		//Replace all the words of new with old
		
		System.out.println(b.replace("is", "are"));
		
		b = "   This is my HanumanKind song and He is good \n ";
		
		//Replace first occurrence  of new with old
		
		System.out.println(b.replaceFirst("is", "are"));
		
		//Prints the ascii value
		System.out.println(b.codePointAt(10));
		
		
		//Checks if the 2 Strings are equals or not
		
		b = "This is my HanumanKind song and He is good ";
		String c = "This is my HanumanKind song and He is not good";
		
		
		System.out.println(b.equals(c));
		
		
		
		//Case sensitivity does not matter here. checks if the Strings are equal or not. 
		b = "This is my HanumanKind song and He is good";
		c = "This is my HanumanKind song and He is Good";
		
		System.out.println(b.equalsIgnoreCase(c));
				
		
		
	}

}
