package java_07exceptions;

public class Nullpoint_exception {
private static String s;

public static void main(String[] args) {
	try
	{
	s = null;
	System.out.println(s.length());
	}
	catch(NullPointerException e)
	{
		System.out.println(e.getMessage());
		
	}
	System.out.println("Hello");
}
}
