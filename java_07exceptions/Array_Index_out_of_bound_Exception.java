package java_07exceptions;

public class Array_Index_out_of_bound_Exception {
public static void main(String[] args) {
	try
	{
		try
		{
			int a[]=new int[5];
			System.out.println(a[10]);
			}
	catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println(e);
		}
		
	String s="123";
	System.out.println(s.charAt(3));
	}
	
//	//catch(StringIndexOutOfBoundsException e)
//	{
//		System.out.println(e);
//	}
	
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println(e.getMessage());
	}
	finally
	{
		System.out.println("name");
	}
	
}
}
