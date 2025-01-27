package java_07exceptions;
class CustomException extends Exception{

	private static final long serialVersionUID = 1L;

	public CustomException(String str) {
		super(str);
	}
	
}

public class Custom_Exception
{
	static void validateAge(int age)throws CustomException
	{
		if(age<18)
		{
			throw new CustomException("Person is not eligible for vote");
		}
		else
		{
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args) {
		try
		{
		validateAge(17);
		}
		catch(CustomException e)
		{
			System.out.println(e);
		}
	}





}
