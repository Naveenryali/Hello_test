package java_07exceptions;
class MyCustomException extends Exception{

	private static final long serialVersionUID = 1L;
	
	
}

public class CostumException2 {
public static void main(String[] args) {
	try
	{
		
		
		throw new MyCustomException();
	}
	catch(MyCustomException e)
	{
		System.out.println("Caught the exception");
		System.out.println(e.getMessage());
	}
	System.out.println("Remaining Code");
}
}
