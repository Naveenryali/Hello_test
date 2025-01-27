package java_07exceptions;

public class Number_format_Exception {
public static void main(String[] args) {
	
	try
	{
		
	String s="name";
	double d=Double.parseDouble(s);
	System.out.println(d);
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
		
	}
	System.out.println("Name");
}
}
