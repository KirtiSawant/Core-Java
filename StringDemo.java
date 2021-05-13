
import java.lang.String;

class StringDemo{
public static void main(String[] args)
{
//String greeting="Hello World";
//String great=new String(greeting);
//System.out.println(great);
//int len=greeting.length();

	//StringLength
	String palindrome = "Dot saw I was Tod";
	int len = palindrome.length();
	System.out.println(len);

	String one1 = "Hello";
	String two2 = "World";
	String three3 = one1 + " " + two2;
	System.out.println(three3);
	
	//Substring
	String str=palindrome.substring(2,7);
	System.out.println(str);
	
	//Trim
	String st=palindrome.trim();
	System.out.println(st);
	String text    = "  And he ran across the field   ";
        String trimmed = text.trim();
	 
	//Indexof
	String string1 = "Hello World";
	int index = string1.indexOf("orld");
	System.out.println(index);

	//LastIndexof Substring
	String theString = "is this good or is this bad?";
	String substring = "is";
	int ind = theString.lastIndexOf(substring);
	System.out.println(ind);
		
	//equals
	String one   = "abc";
	String two   = "def";
	String three = "abc";
	String four  = "ABC";

	System.out.println( one.equals(two) );
	System.out.println( one.equals(three) );
	System.out.println( one.equals(four) );

	
	String o = "This is a good day to code";
	System.out.println( o.startsWith("This")    );
	System.out.println( o.startsWith("This", 5) );
	System.out.println( o.endsWith  ("code")    );
	System.out.println( o.endsWith  ("shower")  );

	System.out.println( one.compareTo(one)   );
	System.out.println( one.compareTo(three) );	
	
	//Replace
	String source   = "123abc";
        String replaced = source.replace('a', '@');
	System.out.println( replaced );

	//replaceFirst
	String text1 = "one two three two one";
	String s = text1.replaceFirst("two", "five");
	System.out.println( text1 );

	//replaceAll
	String text2 = "one two three two one";
	String t = text2.replaceAll("two", "five");
	System.out.println( text2 );
	
	//Split
	String   source1 = "A man drove with a car.";
        String[] occurrences1 = source1.split("a");
	System.out.println( occurrences1 );
	//lmit
	String   source2 = "A man drove with a car.";
	int      limit  = 2;
	String[] occurrences = source2.split("a", limit);
	System.out.println( occurrences);

	String intStr = String.valueOf(10);
	System.out.println("intStr = " + intStr);
	String flStr = String.valueOf(9.99);
	System.out.println("flStr = " + flStr);

}
}
